public class Pattern11 {
    public static void main(String[] args) {
        int i = 4, j = 4;
        int n = 1;
        int sum = 0;

        for (int k = 1; k <= i; k++) {
            sum = 0;
            for (int l = 1; l <= j; l++) {
                System.out.print(n + " ");
                sum += n;
                n++;
            }
            System.out.print(" -> " + sum);
            System.out.println();
        }
    }
}
