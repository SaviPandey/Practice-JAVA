import java.util.Scanner;
public class BankAccount {

    static int c_accno;
    static String c_name;
    static String c_city;
    static double balance;

    public BankAccount() {
        balance = 5000;
    }
    
    public void inputData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Account no.: ");
        c_accno = sc.nextInt();

        System.out.print("Enter the Name of customer: ");
        c_name = sc.next();

        System.out.print("Enter the city: ");
        c_city = sc.next();
    }

    public void deposit() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the balance to be deposited: ");
        double add = sc.nextDouble();

        balance += add;
    }

    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("The remaining balance is: " + balance);
    }

    public void display() {
        System.out.println("Account no.\tName\tCity\tBalance");
        System.out.println(c_accno + "\t" + c_name + "\t" + c_city + "\t" + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount b = new BankAccount();
        SavingsAccount s = new SavingsAccount();

        while (true) {
            System.out.println("Main menu\n");
            System.out.println("1. Input data");
            System.out.println("2. Display data");
            System.out.println("3. Deposit money");
            System.out.println("4. Withdraw money");
            System.out.println("5. Exit\n");

            System.out.print("Enter your choice: ");

            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    b.inputData();
                    break;
                
                case 2:
                    b.display();
                    break;

                case 3:
                    b.deposit();
                    break;

                case 4:
                    System.out.print("Enter the amount to be withdrawn: ");
                    double amount = sc.nextDouble();
                    s.withdraw(amount);
                    break;
                
                default:
                    System.exit(0);
            }
        }
    }
}

class SavingsAccount extends BankAccount {
    public void withdraw(double amount) {
        if ((super.balance - amount) >= 1000) {
            super.withdraw(amount);
        }
        else {
            System.out.println("The balance is " + super.balance + " hence can't withdraw");
        }
    }
}
