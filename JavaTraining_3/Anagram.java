import java.util.Scanner;
public class Anagram {

    public static boolean anagramChecker(String s1, String s2) {
        if (s1.equals(s2)) {
            return true;
        }

        if (s1.length() != s2.length()) {
            return false;
        }

        int present = 0;

        for (int i = 0; i < s1.length(); i++) {
            present = 0;
            for (int j = 0; j < s1.length(); j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    present = 1;
                    break;
                }
            }
            if (present == 1) {
                continue;
            }
            else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two first String: ");
        String s1 = sc.nextLine();
        
        System.out.print("Enter the second String: ");
        String s2 = sc.nextLine();

        String str1 = s1.toLowerCase();
        String str2 = s2.toLowerCase();

        boolean b = anagramChecker(str1, str2);

        System.out.println("Are the two strings anagrams: " + b);

        sc.close();
    }
}
