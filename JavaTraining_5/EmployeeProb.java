import java.util.*;
class Employee{
    int esal;
    int eno;
    String ename;
    String city;

    public void work(){
        System.out.println("Employee is working");
    }
    public void getSalary(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your salary: ");
        int sal =  sc.nextInt();
    }
    public void addEmployee(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Id :");
        eno =  sc.nextInt();
        System.out.print("Enter your Name : ");
        ename = sc.next();
        System.out.print("Enter City : ");
        city = sc.next();
    }
}
class HrManager extends Employee{
    HrManager(){
        super.esal = 70000;
    }
    public void work(){
        System.out.println("HrManager is working");
    }
    public void showEmployee(){
        System.out.println(super.eno+"\t"+super.ename+"\t"+super.city+"\t"+esal);
    }
}
public class EmployeeProb {
    public static void main(String[] args) {
        HrManager h = new HrManager();
        h.work();
        h.getSalary();
        h.addEmployee();
        h.showEmployee();

    }
}
