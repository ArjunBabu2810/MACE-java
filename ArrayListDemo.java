
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        do { 
            System.out.println("\nMenu\n1)Add\n2)Remove\n3)Search\n4)Sort\n5)Display\n6)Exit");
            System.out.print("Enter Choice: ");
            int c = s.nextInt();
            s.nextLine();
            switch (c) {
                case 1:
                    System.out.print("Enter name: ");
                    names.add(s.nextLine());
                    break;
                case 2:
                    System.out.print("Enter name: ");
                    names.remove(s.nextLine());
                    break;
                case 3:
                    System.out.print("Enter name: ");
                    if(names.contains(s.nextLine()))
                        System.out.println("Name is in the list");
                    else
                        System.out.println("Not Found");
                    break;
                case 4:
                    Collections.sort(names);
                    break;
                case 5:
                    System.out.println(names);
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Enter valid choice");
            }
        } while (true);
    }    
}
