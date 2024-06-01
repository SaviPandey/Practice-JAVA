import java.util.*;
class Student{
    Scanner sc = new Scanner(System.in);
    int rollno[] = new int[10];
    String name[] = new String[10];
    String city[] = new String[10];
    long mob[] = new long[10];
    static int i=0;

    public void inputData(){
        System.out.print("Enter Rollno : ");
        rollno[i] = sc.nextInt();
        System.out.print("Enter Name : ");
        name[i] = sc.next();
        System.out.print("Enter City : ");
        city[i] = sc.next();
        System.out.print("Enter Mobile Number :");
        mob[i] = sc.nextLong();

        i++;
    }
    public void showInfo(){
        System.out.println("Rollno\tName\tCity\tMobno");
        System.out.println("-------------------------------------");
        for(int j= 0 ; j< i ; j++ ){
            System.out.println(rollno[j]+"\t"+name[j]+"\t"+city[j]+"\t"+mob[j]);
        }

    }
    public void deleteData(){
        System.out.println("Enter Rollno to delete that Info : ");
        int rno = sc.nextInt();
        for(int j = 0; j< rollno.length ;j++){
            if(rno == rollno[j]){
                for(int k=0 ; k<rollno.length-1 ; k++){
                    rollno[k] = rollno[k+1];
                    name[k] = name[k+1] ;
                    city[k]= city[k+1];
                    mob[k]  = mob[k+1];
                }
            }
    }
    i=i-1;
    System.out.println("Deleted Record!");
}    
    public void updateData(){
        System.out.println("Enter Your Rollno : ");
        int rno = sc.nextInt();
        for( int j = 0; j< rollno.length ;j++){
            if(rno == rollno[j]){
                System.out.print("Rollno : "+rollno[j]);
                System.out.print("1.Name : "+name[j]);
                System.out.print("2.City : "+city[j]);
                System.out.println("3.Mobno : "+mob[j]);
                System.out.print("Select which Data to update : ");
                int ch = sc.nextInt();
                switch(ch){
                    case 1: System.out.println("Enter new Name : ");
                            String sname= sc.next();
                            name[j] = sname;
                            System.out.println("Name Updated Successfully !");
                            break;

                    case 2: System.out.println("Enter new City : ");
                            String scity = sc.next();
                            city[j] = scity;
                            System.out.println("City Updated Successfully !");
                            break;
                
                    case 3: System.out.println("Enter new MObno : ");
                            long smobno = sc.nextLong();
                            mob[j] = smobno;
                            System.out.println("Mobile number Updated Successfully !");
                            break;

                    default :System.out.println("Invalid choice!");

                }
            }
        }

    }
}
public class CRUD{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        while(true){
            System.out.println("\n1.Input Data");
            System.out.println("2.Show Info");
            System.out.println("3.Delete Student Details");
            System.out.println("4.Update Details");
            System.out.println("5.Exit");
            System.out.print("\nEnter Your choice: ");
            int n = sc.nextInt();

            switch(n){
                case 1: s.inputData();
                        break;
                        
                case 2: s.showInfo();
                        break;
                case 3: s.deleteData();
                        break;
                case 4: s.updateData();
                        break;
                case 5: System.exit(0);        

            }

        }

    }
}