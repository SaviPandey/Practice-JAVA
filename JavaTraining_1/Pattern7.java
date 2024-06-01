public class Pattern7 {
    public static void main(String[] args) {
        int rows = 4 ; 
        printStarTriangle(rows);
    }

    public static void printStarTriangle(int rows) {
        for (int i = 1; i <= rows; i++) {
            
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }

          
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
