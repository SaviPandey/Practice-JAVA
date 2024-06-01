public class Continue1 {
    public static void main(String[] args) {
        for(int i = 1, n = 10; i < n; i++, n--) {
            if (i == 3) {
                continue;
            }
            System.out.println(i + " " + n);
        }
    }
}
