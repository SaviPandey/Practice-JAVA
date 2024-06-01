import java.util.Scanner;
public class SwitchVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char c = sc.next().charAt(0);

        boolean vowel = false;

        switch (c) {
            case 'a':
                vowel = true;
                break;
            
            case 'e':
                vowel = true;
                break;
            
            case 'i':
                vowel = true;
                break;
            
            case 'o':
                vowel = true;
                break;
            
            case 'u':
                vowel = true;
                break;
            
            default:
                break;
        }

        if (vowel){
            System.out.println("The character is a vowel");
        }
        else {
            System.out.println("The character is not a vowel");
        }

        sc.close();
    }
}
