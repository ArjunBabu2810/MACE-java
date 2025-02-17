import java.util.Scanner;

interface showable{
    void show();
}

class Person implements showable{
    String name;
    String gender;
    int phoneNo;
    public Person(String n,String g,int ph){
        name = n;
        gender = g;
        phoneNo = ph;
    }
    public void show(){
        System.out.println("Name : "+ name+"\nGender :"+gender+"\nPhone No: "+phoneNo);
    }
}

class Student extends Person{
    String course;
    int score;
    public Student(String n,String g,int ph,String co,int sc){
        super(n, g, ph);
        course = co;
        score = sc;
    }
    public void  show(){
        super.show();
        System.out.println("Course : "+ course+"\nScore :"+score);
    }
}

class PGstudent extends Student{
    String researchArea;
    String guide;
    public PGstudent(String n,String g,int ph,String co,int sc,String ra,String gd){
        super(n, g, ph, co, sc);
        researchArea = ra;
        guide = gd;
    }
    public void show(){
        super.show();
        System.out.println("research Area : "+ researchArea+"\nGuide :"+guide);
    }
}

public class DemoStudent {

    public static void rank(PGstudent p[],int n){
        for (int i = 0; i < n-1; i++) {
            for (int j = i; j < n-1; j++) {
                if(p[j].score < p[j+1].score){
                    PGstudent temp = p[j];
                    p[j]=p[j+1];
                    p[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students : ");
        int n = sc.nextInt();
        PGstudent p[] = new PGstudent[10];
        sc.nextLine();
        for (int i=0;i<n;i++){
            System.out.print("Name :");
            String name = sc.nextLine();
            System.out.print("Gender :");
            String gender = sc.nextLine();
            System.out.print("Phone :");
            int phone = sc.nextInt();
            sc.nextLine();
            System.out.print("Course :");
            String course = sc.nextLine();

            System.out.print("Score :");
            int score = sc.nextInt();
            sc.nextLine();
            System.out.print("Research Area :");
            String ra = sc.nextLine();

            System.out.print("Guide :");
            String guide = sc.nextLine();
            p[i] = new PGstudent(name, gender, phone, course, score, ra, guide);
        }
        for (int i=0;i<n;i++){
            System.out.println("\nStudent "+(i+1));
            p[i].show();
        }
        rank(p, n);
        for (int i=0;i<n;i++){
            System.out.println("\nRank "+(i+1) + " : "+p[i].name);
        }
    }
    
}
