public class StringObj {
    public static void main(String[] args) {
        String str = "help4code";
        System.out.println(str);

        String str1 = new String("Help4code");
        System.out.println(str1);

        char[] ch = {'h', 'e', 'l','p' ,'4' ,'c', 'o' ,'d' ,'e' };
        String str3 = new String(ch);
        System.out.println(str3);

        char ch1[] = {'a' ,'s' ,'h' ,'i','h','e','l','p','4','c','o','d','e'};
        String str4 = new String(ch1 , 2, 8);
        System.out.println(str4);


        byte[] b = {65 ,66, 67,68,69,70};
        String str5 = new String(b);
        System.out.println(str5);

        byte[] b1 = {65, 66, 67,68,69,70};
        String str6 =  new String(b1 , 2, 4);
        System.out.println(str6);
        

    }
}
