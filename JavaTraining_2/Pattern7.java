public class Pattern7 {
    public static void main(String[] args) {
        int i = 4;
        
        for (int k = i; k >= 1; k--) {
            for (int l = 0; l < (i - k); l++) {
                System.out.print(" ");
            }
            for (int m = 1; m <= k; m++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
