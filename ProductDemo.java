import java.util.ArrayList;
import java.util.Scanner;

class Product{
    int price;
    String name;
    public Product(int p,String n){
        price = p;
        name =n;
    }
    @Override
    public String toString(){
        return "Name : "+name+" Price : "+price;
    }
}
public class ProductDemo {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        do { 
            System.out.println("\nMenu\n1)Add\n2)Sort\n3)Display\n4)Exit");
            System.out.print("Enter Choice: ");
            int c = s.nextInt();
            s.nextLine();
            switch (c) {
                case 1:
                    System.out.println("Enter Price : ");
                    int p = s.nextInt();
                    System.out.print("Enter name : ");
                    s.nextLine();
                    String n = s.nextLine();
                    Product pr = new Product(p,n);
                    products.add(pr);
                    break;
                case 2:
                    Collection.sort(products,Comparator.comparing(Product p)->p.name);
                    break;
                case 3:
                    System.out.println(products);
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Enter valid choice");
            }
        } while (true);
    }    
}
