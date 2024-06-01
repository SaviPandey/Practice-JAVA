public class Pattern5 {
    public static void main(String[] args) {
        int i = 4, j = 4;
        int n = 0;

        for (int k = 1; k <= i; k++) {
            for (int l = 1; l <= j; l++) {
                System.out.print((char) (65 + n));
                n++;
            }
            System.out.println();
        }
    }
}
