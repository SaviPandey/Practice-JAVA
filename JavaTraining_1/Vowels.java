import java.util.*;
public class Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(ch=='a'|| ch=='e' ||ch=='i'||ch=='o'||ch=='u'){
            System.out.println("Character is Vowel.");
        }
        else{
            System.out.println("Character is not a vowel");
        }
        sc.close();
    }
}
