import java.util.*;

class Student{
    String name;
    String college_name;
    int id;

    Student(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter name of Student: ");
        name = sc.nextLine();
        System.out.println("Enter College name: ");
        college_name = sc.nextLine();
        System.out.println("Enter student ID no.: ");
        id = sc.nextInt();
    }

    void display(){
        System.out.println(this.college_name+" "+this.id+" "+this.name);
    }
}

public class Studentdetail {
    public static void main(String[] args) {
        Scanner sc =  new Scanner (System.in);
        System.out.println("Enter no of students: ");
        int count = sc.nextInt();
        Student s[] = new Student [count];
        for(int i=0;i<count;i++){
            Student student = new Student();
            s[i] = student;
        }
        for(int i=0;i<count;i++){
            s[i].display();
        }
    }
}
