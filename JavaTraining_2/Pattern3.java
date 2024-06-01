public class Pattern3 {
    public static void main(String[] args) {
        int i = 4;

        for (int k = i; k >= 1; k--) {
            for (int l = 1; l <= k; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
