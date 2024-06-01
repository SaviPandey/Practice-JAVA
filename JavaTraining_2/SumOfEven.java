public class SumOfEven {
    public static void main(String[] args) {
        int num = 20;
        int i = 0;
        int sum = 0;
        while (i <= num) {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        }

        System.out.println("The sum of even numbers till 20 is: " + sum);

    }
}
