// Task 3



import java.util.Scanner;
class Account{
    private int balance;
    public Account(int balance){
        this.balance = balance;
    }
    public int getBalance(){
        return this.balance;
    }
    public void deposit(int amount){
        if(amount>0) {
            this.balance += amount;
            System.out.println("You're Amount is deposited successfully");
            System.out.println("Current Balance : "+this.balance);
        }
        else
            System.out.println("Please, Enter Valid Amount");
    }
    public void withdraw(int amount){
        if(amount>0 && amount<=this.balance){
            this.balance -= amount;
            System.out.println("withdrawn successfully");
            System.out.println("your current balance : "+this.balance);
        }
        else
            System.out.println("Please, Enter Valid Amount for withdrawl");
    }
}
class ATM{
    private Account bankAccount;
    public ATM(Account bankAccount){
        this.bankAccount = bankAccount;
    }
    public void display(){
        System.out.println("Welcome, Choose the options below to proceed");
        System.out.println("1. Deposit money");
        System.out.println("2. Withdraw money");
        System.out.println("3. Check balance");
        System.out.println("4. Close");
    }
    public void Process(){
        Scanner sc = new Scanner(System.in);
        while(true) {
            this.display();
            System.out.print("Select option : ");
            int option = sc.nextInt();
            switch (option) {
                case 1: {
                    System.out.print("Enter amount for deposit : ");
                    int amount = sc.nextInt();
                    bankAccount.deposit(amount);
                    break;
                }
                case 2: {
                    System.out.print("Enter amount for withdraw : ");
                    int amount = sc.nextInt();
                    bankAccount.withdraw(amount);
                    break;
                }
                case 3: {
                    System.out.println("Balance : " + bankAccount.getBalance());
                    break;
                }
                case 4: {
                    System.exit(0);
                }
                default:
                    System.out.println("Wrong input");
            }
        }
    }
}
public class BankAccount {
    public static void main(String[] args) {
        Account bankAccount = new Account(1500000);
        ATM atm = new ATM(bankAccount);
        atm.Process();
    }
}