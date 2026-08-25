import java.util.Scanner;
public class Resanalyzer {
    public static void main(String[]args){
        System.out.println("Result Analyzer");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name");
        String name=sc.nextLine();
        System.out.println("Enter marks for subject 1");
        int mark1=sc.nextInt();
        System.out.println("Enter marks for subject 2");
        int mark2=sc.nextInt();
        System.out.println("Enter marks for subject 3");
        int mark3=sc.nextInt();
        int total=mark1+mark2+mark3;
        int avg=total/3;
        System.out.println("Total marks: "+total);
        System.out.println("Average marks: "+avg);
        if(total<=100 && total>=90){
            System.out.println("O Grade");
        }
        else if(total<90 && total>=80){
            System.out.println("Passed:A Grade");
        }
        else if(total<80 && total>=70){
            System.out.println("Passed:B Grade");
        }
        else if(total<70 && total>=60){
            System.out.println("Passed:C Grade");
        }
        else{
            System.out.println("fail");
        }
        System.out.println("Result of "+ name +" is "+ total);

    }

}
