
import java.util.Scanner;


class Student{
    int rollno;
    String name;
    int mark;
    static int count;
    public Student(){
        this.rollno=0;
        this.name="";
        this.mark=0;
        count++;
    }
    public Student(int r,String name,int mark){
        this.rollno=r;
        this.name=name;
        this.mark=mark;
        count++;
    }
    public Student(Student s){
        this.rollno=s.rollno;
        this.name=s.name;
        this.mark=s.mark;
        count++;
    }
    public void display(){
        System.out.println("Rollno : "+this.rollno+" Name : "+this.name+" Mark : "+this.mark);
    }

}
public class StudentDemo{
    public static void sortStudent(Student[] s){
        for (int i=0;i<Student.count-1;i++){
            for (int j=i+1;j<Student.count;j++){
                if(s[i].mark<s[j].mark){
                    Student t = s[i];
                    s[i] = s[j];
                    s[j]=t;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = s.nextInt();
        Student student [] = new Student[10];
        for (int i =0;i<n;i++){
            System.out.print("Enter roll no: ");
            int r = s.nextInt();
            s.nextLine();
            System.out.print("Enter name: ");
            String name = s.nextLine();
            System.out.print("Enter mark: ");
            int m = s.nextInt();
            student[i] = new Student(r,name,m);
        }
        for (int i =0;i<n;i++){
            System.err.println("");
            student[i].display();
        }
        sortStudent(student);
        for (int i =0;i<n;i++){
            System.err.println("");
            System.err.println("Rank "+(i+1));
            student[i].display();
        }
        s.close();

    }

}

// create class for with attributes author , title,and price create n books and sort based on author