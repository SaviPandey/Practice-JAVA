import java.util.Scanner;
interface RBI{
    void calInterest();
    double intrRate_sa =0.04;
    double intrRate_ca = 0.02;
}
abstract class BankAccount {

    static int c_accno;
    static String c_name;
    static String c_city;
    static double c_balance;
    static double s_balance;

    public BankAccount() {
        s_balance = 5000;
        c_balance =7000;
    }
    
    public static void inputData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Account no.: ");
        c_accno = sc.nextInt();

        System.out.print("Enter the Name of customer: ");
        c_name = sc.next();

        System.out.print("Enter the city: ");
        c_city = sc.next();
    }

    abstract void deposit(); 
    abstract void withdraw(double amount);

    public static void display() {
        System.out.println("Account no.\t\tName\t\tCity\t\tSavings_Balance\t\tCurrent_Balance");
        System.out.println("-------------------------------------------------");
        System.out.println(c_accno + "\t\t" + c_name + "\t\t" + c_city + "\t\t" + s_balance +"\t\t\t"+ c_balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SavingsAccount s = new SavingsAccount();
        CurrentAccount c= new CurrentAccount();
        Interest1 si = new Interest1();
        Interest2 ci = new Interest2();

        while (true) {
            System.out.println("Main menu\n");
            System.out.println("1. Input data");
            System.out.println("2. Display data");
            System.out.println("3. Deposit money " );
            System.out.println("4. Withdraw money ");
            System.out.println("5. Show Interest");
            System.out.println("6. Exit\n");

            System.out.print("Enter your choice: ");

            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    s.inputData();
                    break;
                
                case 2:
                    s.display();
                    break;

                case 3: System.out.println("1.Current Account");
                        System.out.println("2.Savings Account");
                        System.out.println("Select with account : ");
                        int ch2 = sc.nextInt();
                        if(ch2==1){
                            c.deposit();
                        }
                        else{
                            s.deposit();
                        }
                        break;

                case 4: System.out.println("1.Current Account");
                        System.out.println("2.Savings Account");
                        System.out.println("Select which account : ");
                        ch2 = sc.nextInt();
                        System.out.print("Enter the amount to be withdrawn: ");
                        double amount = sc.nextDouble();
                        if(ch2==1){
                            c.withdraw(amount);
                        }
                        else{
                            s.withdraw(amount);
                        }
                        break;
                case 5 : System.out.println("1.Current Account");
                        System.out.println("2.Savings Account");
                        System.out.println("Select which account : ");
                        ch2 = sc.nextInt();
                        if(ch2==1){
                            si.calInterest();
                        }
                        else{
                            ci.calInterest();
                        }
                        break;

                        
                
                default:
                    System.exit(0);
            }
        }
    }
}

class SavingsAccount extends BankAccount {
    public void withdraw(double amount) {
        if ((super.s_balance - amount) >= 1000) {
            s_balance -= amount;
            System.out.println("The remaining balance is: " + s_balance);
        }
        else {
            System.out.println("The balance is " + super.s_balance + " hence can't withdraw");
        }
    }
    
    public void deposit() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the balance to be deposited: ");
        double add = sc.nextDouble();

        s_balance += add;
    }

}
class CurrentAccount extends BankAccount{

    public void withdraw(double amount) {
        if (amount <= 5000 && (super.c_balance - amount) >= 1000) {
            c_balance -= amount;
            System.out.println("The remaining balance is: " + c_balance);
        }
        else {
            System.out.println("The balance is " + super.c_balance + " hence can't withdraw");
        }
    }

    public void deposit() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the balance to be deposited: ");
        double add = sc.nextDouble();

        c_balance += add;
    }
}
class Interest1 extends SavingsAccount implements RBI{
    public void calInterest(){
        double interest=0.04;
        if(interest>= intrRate_sa){
            interest = (0.04*s_balance);
        }
        else{
            System.out.println("Not Following RBI interest Rate !");
        }
        System.out.println("Interest = "+interest);
    }
}
class Interest2 extends CurrentAccount implements RBI{
    public void calInterest(){
        double interest=0.02;
        if(interest>= intrRate_ca){
            interest = (0.04*s_balance);
        }
        else{
            System.out.println("Not Following RBI interest Rate !");
            return;
        }
        // System.out.println("Interest = "+interest);
    }
}
