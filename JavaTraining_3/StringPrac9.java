public class StringPrac9 {
    public static void main(String[] args) {
        String s1 = "Savinay";
        boolean b= s1.equalsIgnoreCase("Savinay");
        System.out.println(b);
        System.out.println(s1.equalsIgnoreCase("savinay"));
        String s2 = "Krithik";
        boolean b1 = s1.equalsIgnoreCase(s2);
        System.out.println(b1); 
    }
}
