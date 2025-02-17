
import java.util.Scanner;


class Book{
    String title;
    String author;
    int price;
    static int count;
    public Book(){
        this.title="";
        this.author="";
        this.price=0;
        count++;
    }
    public Book(String title,String author,int price){
        this.title=title;
        this.author=author;
        this.price=price;
        count++;
    }
    public Book(Book s){
        this.title=s.title;
        this.author=s.author;
        this.price=s.price;
        count++;
    }
    public void display(){
        System.out.println("title : "+this.title+" Author : "+this.author+" price : "+this.price);
    }

}
public class BookDemo{
    public static void sortBook(Book[] s){
        for (int i=0;i<Book.count-1;i++){
            for (int j=i+1;j<Book.count;j++){
                if(s[i].author.length() > s[j].author.length()){
                    Book t = s[i];
                    s[i] = s[j];
                    s[j]=t;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of Books: ");
        int n = s.nextInt();
        Book book [] = new Book[10];
        for (int i =0;i<n;i++){
            s.nextLine();
            System.out.print("Enter Title: ");
            String title = s.nextLine();
            System.out.print("Enter Author: ");
            String author = s.nextLine();
            System.out.print("Enter price: ");
            int m = s.nextInt();
            book[i] = new Book(title,author,m);
            book[i].display();
            
        }

        sortBook(book);
        for (int i =0;i<n;i++){
            System.err.println("");
            book[i].display();
        }
        s.close();

    }

}
