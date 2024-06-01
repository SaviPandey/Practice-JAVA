public class GarbagePrac2 {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("Mohit");
        StringBuffer s2 = new StringBuffer("Rajat");
        s1 = s2;
        System.out.println(s1);
        System.out.println(s2);
    }
}
