public class Pattern2 {
    public static void main(String[] args) {
        int i = 4;

        for (int k = 1; k <= i; k++) {
            for (int l = 1; l <= k; l++) {
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
