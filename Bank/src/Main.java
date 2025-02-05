import java.util.*;

class Bank{
    static int balance = 0;
    void display_balance(){
        System.out.println("Available balance = " + balance);
    }
    void deposit(int a){
        balance += a;
    }
    void credit(int a){
        balance += a;
    }
    void debit(int a){
        balance -= a;
    }
}


public class Main {
    public static void main(String[] args) {
        int n=0;
        while(n!=5) {

            System.out.println("1. deposit");
            System.out.println("2. credit");
            System.out.println("3. debit");
            System.out.println("4. balance");
            System.out.println("5. exit");

            Bank acc = new Bank();

            Scanner scn = new Scanner(System.in);
            n = scn.nextInt();
            int a;

            switch (n) {
                case 1:
                    System.out.println("Enter the amount to be deposited:");
                    a = scn.nextInt();
                    acc.deposit(a);
                    acc.display_balance();
                    break;

                case 2:
                    System.out.println("Enter the amount to be credited:");
                    a = scn.nextInt();
                    if(a<=0){
                        while(a<=0){
                            System.out.println("Enter the amount to be credited:");
                            a = scn.nextInt();
                        }
                    }
                    acc.credit(a);

                    acc.display_balance();
                    break;

                case 3:
                    System.out.println("Enter the amount to be debited:");
                    a = scn.nextInt();
                    if (Bank.balance >= a) {
                        acc.debit(a);
                    } else {
                        System.out.println("Insufficient funds.");
                    }
                    acc.display_balance();
                    break;
                case 4:
                    acc.display_balance();
                    break;

                case 5:
                    break;
                default:
                    System.out.println("Invalid Input.");

            }
        }
        System.out.println("Thank you for banking with us!!!");
    }
}