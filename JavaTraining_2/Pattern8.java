public class Pattern8 {
    public static void main(String[] args) {
        int i = 4;

        for (int k = 1; k <= i; k++){
            int sp = i - k;
            for (int l = 1; l <= sp; l++) {
                System.out.print(" ");
            }
            for (int m = 1; m <= k; m++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
