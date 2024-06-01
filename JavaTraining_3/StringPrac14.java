public class StringPrac14 {
    public static void main(String[] args) {
        String s = "ABCD";
        byte b[] = s.getBytes();
        for(int i=0 ; i<b.length ; i++){
            System.out.println(b[i]);
        }
    }
}
