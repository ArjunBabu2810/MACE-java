import java.util.HashMap;;
import java.util.Scanner;

public class StudentList {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HashMap <Integer ,String> students = new HashMap<>();
        int c;
        System.out.println("1 Add Student\n2 Search Student\n3 Display\n4 Exit");
        do { 
            System.out.print("Enter Choice : ");
            c = s.nextInt();
            switch (c) {
                case 1:
                    System.out.print("Enter Id :");
                    int id  = s.nextInt();
                    s.nextLine();
                    System.out.print("Enter name :");
                    String name = s.nextLine();
                    students.put(id, name);
                    break;
                case 2 :
                    System.out.print ("Enter Id :");
                    id = s.nextInt();
                    System.out.println("Student name : "+students.get(id));
                    break;
                case 3 :
                        for (String st : students.values()) {
                            System.out.println(st);
                        }
                        break;
                case 4 : break;
                default:
                    System.out.println("Invalid");
            }
        } while (c!=4);
        
        
    }
}
