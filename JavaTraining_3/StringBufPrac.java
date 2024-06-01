public class StringBufPrac {
    public static void main(String[] args) {
        String str1 = "Ashish";
        StringBuffer sb1 = new StringBuffer(str1);
        System.out.println(sb1);

        StringBuffer sb2 = new StringBuffer("Prashant");
        String str2 = sb2.toString();
        System.out.println(str2);
    }
}
