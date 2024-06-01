import java.util.Scanner;

public class Cape2 {
    public static void main(String[] args) {
        int shambhuNums[]=new int[4];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Digits: ");
        for (int i=0;i<4;i++){
            shambhuNums[i]=sc.nextInt();
        }

        for (int j=0;j<4;j++)
            System.out.print(shambhuNums[j]+" ->"+(char)(shambhuNums[j])+" ");
        
        sc.close();
    }
}
