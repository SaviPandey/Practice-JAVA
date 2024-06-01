public class ReverseWords {
    public static void main(String[] args) {
        String str = "learning java is easy with ashish sir";
        String[] words = str.split(" ");
        String res = "";
        for(int i=words.length-1; i>=0; i--){
            res += words[i] + " ";
        }
        System.out.println(res);
    }
}