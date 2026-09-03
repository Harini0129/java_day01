import java.util.Scanner;
public class Accountmgmt {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student name: ");
        String name=scanner.nextLine();
        System.out.println("Enter student ID: ");
        String ID=scanner.nextLine();
        System.out.println("Enter student account number: ");
        int Accno=scanner.nextInt();
        System.out.println("Enter initial deposit: ");
        int initial_deposit=scanner.nextInt();

        System.out.println("Account created successfully!");

        System.out.println("1.Deposit Money");
        System.out.println("2.Withdraw Money"); 
        System.out.println("3.Check Balance");
        System.out.println("4.Display Account Details"); 
        System.out.println("5.Calculate Interest"); 
        System.out.println("6.Exit");
        
        int choice=scanner.nextInt();
        System.out.println("Enter your choice: "+choice);

        switch(choice){
            
            case 1:
                System.out.println("Enter amount to deposit: ");
                int deposit_amount=scanner.nextInt();
                initial_deposit+=deposit_amount;
                System.out.println("Amount deposited successfully! New balance: "+initial_deposit);
                break;
            case 2:
                System.out.println("Enter amount to withdraw: ");
                int withdraw_amount=scanner.nextInt();
                if(withdraw_amount>initial_deposit)
                    {
                    System.out.println("Insufficient balance!");
                    }
                    else
                    {
                    initial_deposit-=withdraw_amount;
                    System.out.println("Amount withdrawn successfully! New balance: "+initial_deposit);
                    }
                break;
            case 3:
                System.out.println("Current balance: "+initial_deposit);
                break;
            case 4:
                System.out.println("Account Details:");
                System.out.println("Name: "+name);
                System.out.println("ID: "+ID);
                System.out.println("Account Number: "+Accno);
                System.out.println("Balance: "+initial_deposit);
                break;
            case 5:
                double interest_rate=0.05; //5% interest rate
                double interest=initial_deposit*interest_rate;
                System.out.println("Interest earned: "+interest);
                break;
            case 6:
                System.out.println("Exiting, thankyou for using Student Bank System");
                break;
            default:
                System.out.println("Invalid");
        }


    }
    
}
