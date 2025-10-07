package ATM;
import java.util.Scanner;
class ATM {
    int accountNumber;
    String accountHolder;
    double balance;

ATM()
{
    accountNumber = 0;
    accountHolder = "";
    balance = 0.0;
}
ATM(int accountNumber, String accountHolder, double balance)
{
    this.accountNumber = accountNumber;
    this.accountHolder = accountHolder;
    this.balance = balance;
}

double deposit(double amount)
{
    if(amount > 0)
    {
        balance += amount;
       
    }
    else
    {
        System.out.println("Deposit amount must be positive.");
    }
     return balance;
}

double withdraw(double amount)
{
    if(amount >0 && amount <= balance)
    {
        balance-=amount;
        
    }
    else
    {
        System.out.println("Insufficient amount.");
    }

    return balance;

}
 double checkBalance()
 {
    return balance;
 }

}


public class atmMain {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("----------------Account Details------------------");

    System.out.print("Enter Account Number: ");
    int accNo1 = input.nextInt();
    input.nextLine(); // Consume newline
    System.out.print("Enter Account Holder Name: ");
    String accHolder1 = input.nextLine();
    System.out.print("Enter Initial Balance: ");
    double balance1 = input.nextDouble();

    ATM account1 = new ATM(accNo1, accHolder1, balance1);
    
    System.out.println("\n----------------Account 2 Details------------------");
    System.out.print("Enter Account Number for account2: ");
    int accNo2 = input.nextInt();
    input.nextLine(); // Consume newline
    System.out.print("Enter Account Holder Name for account2: ");
    String accHolder2 = input.nextLine();
    System.out.print("Enter Initial Balance for accounr2: ");
    double balance2 = input.nextDouble();
    ATM account2 = new ATM();
    account2.accountNumber = accNo2;
    account2.accountHolder = accHolder2;
    account2.balance = balance2;

        System.out.println("\n--- Account Details ---");
        System.out.printf("%-15s %-20s %-15s\n", "Account No", "Holder Name", "Balance");
        System.out.printf("%-15d %-20s %-15.2f\n", account1.accountNumber, account1.accountHolder, account1.checkBalance());
        System.out.printf("%-15d %-20s %-15.2f\n", account2.accountNumber, account2.accountHolder, account2.checkBalance());

    
    System.out.println("\n--- Transactions ---");
    while(true)
    {
    System.out.println("Enter 1 to access Account 1");
    System.out.println("Enter 2 to access Account 2");
    System.out.println("Enter 3 to Exit");
    int accChoice = input.nextInt();
    ATM selectedAccount;
    if(accChoice == 1)
    {
        selectedAccount = account1;
    }
    else if(accChoice == 2)
    {
        selectedAccount = account2;
    }
    else
    {
        System.out.println("Exiting...");
        break;
    }

    int choice;
    while(true)
    {
        System.out.println("1: Enter to Deposit");
        System.out.println("2: Enter to Withdraw");
        System.out.println("3: Enter to Check Balance");
        System.out.println("4: Enter to Exit");
        choice = input.nextInt();
    
    
    switch(choice)
    {
        case 1:
        System.out.print("Enter amount to deposit: ");
        double depositAmount = input.nextDouble();
        selectedAccount.deposit(depositAmount);
        System.out.println("\nNew Balance: " + selectedAccount.checkBalance()+ "\n");
        break; 

        case 2:
        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = input.nextDouble();
        selectedAccount.withdraw(withdrawAmount);
        System.out.println("\nNew Balance: " + selectedAccount.checkBalance()+ "\n");
        break;  

        case 3:
        System.out.println("\nCurrent Balance: " + selectedAccount.checkBalance()+ "\n");   
        break;

        default:
        System.out.println("Exiting...");

        System.exit(0);
    }
   }
  }   
 } 
}
