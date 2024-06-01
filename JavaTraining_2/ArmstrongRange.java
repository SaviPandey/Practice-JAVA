public class ArmstrongRange {
    public boolean armstrong(int i) {
        int num = i;
        int num_copy = num;
        int sum = 0;
        int count = 0;

        while (num != 0) {
            count++;
            num /= 10;
        }
        num = num_copy;

        while (num != 0) {
            int rem = num % 10;
            sum += Math.pow(rem, count);
            num /= 10;
        }

        if (num_copy == sum) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        ArmstrongRange a = new ArmstrongRange();
        int first = 1;
        int last = 5000;

        for (int i = first; i <= last; i++) {
            if (a.armstrong(i)) {
                System.out.println(i);
            }
        }
    }
}
