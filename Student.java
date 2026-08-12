import java.util.Scanner;

public class Student {
    public static void main(String args[]){
        String name;
        int age;
        int roll_no;
        int marks;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        name=sc.nextLine();
        System.out.println("Enter your age");
        age=sc.nextInt();
        System.out.println("Enter your roll_no");
        roll_no=sc.nextInt();
        System.out.println("Enter your marks");
        marks=sc.nextInt();
        System.out.println("My name is "+name);
        System.out.println("My age is "+age);
        System.out.println("My roll number is "+roll_no);
        System.out.println("My marks are "+marks);
    }
    
}
