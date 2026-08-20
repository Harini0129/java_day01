import java.util.Scanner;
public class Reverse {
    public static void main(String[]args){
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int rem=0;
        int rev=0;
        while(num!=0){
            rem=num%10;
            num=num/10;
            rev=rev*10+rem;
        }
        System.out.print(rev+" is Reversed number");
    }
    
}
