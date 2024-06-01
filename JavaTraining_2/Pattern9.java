public class Pattern9 {
    public static void main(String[] args) {
        int i = 4;

        for (int k = 1; k <= i; k++) {
            for (int l = 1; l <= (i - k); l++) {
                System.out.print(" ");
            }
            for (int m = 0; m < 2 * k - 1; m++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}