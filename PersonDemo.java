import java.util.Scanner;

class Person{
    String name;
    String gender;
    String address;
    int age;
    public Person(String n,String g,String a,int age){
        name = n;
        gender =g;
        address = a;
        this.age = age;
    }
    public void display(){
        System.out.println(name + " is " + age + " years old " + gender + " Living at "+ address+".");
    }
}
class Employee extends Person{
    int empid;
    String comp;
    String qual;
    int salary;
    public Employee(String n,String g,String a,int age,int eid,String c,String q,int salary){
        super(n, g, a, age);
        empid = eid;
        comp = c;
        qual = q;
        this.salary = salary;
    }
    public void display(){
        super.display();
        System.out.println("Is an employee ("+empid+") Working at "+comp+".");
        System.out.println("Has a qualification of "+qual+" and have "+salary+" as salary.");
    }
}
class Teacher extends Employee{
    int  teacherId;
    String sub;
    String dept;
    public Teacher(String n,String g,String a,int age,int eid,String c,String q,int salary,int id,String sb,String d){
        super(n, g, a, age, eid, c, q, salary);
        teacherId = id;
        sub =sb;
        dept = d;
    }
    public void display(){
        super.display();
        System.out.println("Is a Teacher ("+teacherId+") of department "+dept+" Teaching Subject "+sub+". ");
    }
}

public class PersonDemo {
    public static void main(String[] args) {
        Teacher t[] =new Teacher [10];

        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter Number of Teachers: ");
        n = sc.nextInt();
        for (int i= 0;i<n;i++){
            String name,add,comp,qual,sub,dept,g;
            int age,eid,salary,tid;
            sc.nextLine();
            System.out.println("Enter Teacher "+(i+1)+" details");
            System.out.print("Name : ");
            name = sc.nextLine();
            System.out.print("Address : ");
            add  =sc.nextLine();
            System.out.print("Company : ");
            comp =sc.nextLine();
            System.out.print("Qualifification : ");
            qual =sc.nextLine();
            System.out.print("Subject :");
            sub =sc.nextLine();
            System.out.print("Department : ");
            dept = sc.nextLine();
            System.out.print("Gender :");
            g =sc.nextLine();
            System.out.print("Age :");
            age = sc.nextInt();
            System.out.print("E id:");
            eid = sc.nextInt();
            System.out.print("Salary:");
            salary =sc.nextInt();
            System.out.print("T id :");
            tid = sc.nextInt();
            t[i] = new  Teacher(name,g,add,age,eid,comp,qual,salary,tid,sub,dept);
        }
        for (int i= 0;i<n;i++){
            System.out.println("\nTeacher "+ (i+1)+"\n");
            t[i].display();
        }
    }
}
