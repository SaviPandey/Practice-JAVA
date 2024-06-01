import java.util.Scanner;
public class SumOfSeries2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x = sc.nextInt();

        System.out.print("Enter the range of the series: ");
        int n = sc.nextInt();
        int i = 1;
        int sum = 1;

        while (i <= n) {
            int fact = 1;

            for (int j = 1; j <= i; j++) {
                fact *= j;
            }
            sum += (Math.pow(x, i) / fact);
            i++;
        }

        System.out.println("The sum of the series is: " + sum);

        sc.close();
    }
}