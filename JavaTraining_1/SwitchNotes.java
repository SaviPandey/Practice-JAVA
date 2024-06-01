import java.util.Scanner;
public class SwitchNotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount: ");
        int amount = sc.nextInt();

        System.out.print("Enter the range: ");
        int range = sc.nextInt();

        int note2000 = 0;
        int note500 = 0;
        int note200 = 0;
        int note100 = 0;
        int note50 = 0;
        int note20 = 0;
        int note10 = 0;
        int note5 = 0;
        int note2 = 0;
        int note1 = 0;

        switch (range) {
            case 2000:
                note2000 = amount / 2000;
                amount %= 2000;
            
            case 500:
                note500 = amount / 500;
                amount %= 500;
            
            case 200:
                note200 = amount / 200;
                amount %= 200;
            
            case 100:
                note100 = amount / 100;
                amount %= 100;
            
            case 50:
                note50 = amount / 50;
                amount %= 50;
            
            case 20:
                note20 = amount / 20;
                amount %= 20;
            
            case 10:
                note10 = amount / 10;
                amount %= 10;
            
            case 5:
                note5 = amount / 5;
                amount %= 5;
            
            case 2:
                note2 = amount / 2;
                amount %= 2;
            
            case 1:
                note1 = amount / 1;
                amount %= 1;
                break;
        }

        // System.out.println(note2000 + "," + note500 + "," + note200 + "," + note100 + "," + note50 + "," + note20 + "," + note10 + "," + note5 + "," + note2 + "," + note1);

        int numberOfNotes = note2000 + note500 + note200 + note100 + note50 + note20 + note10 + note5 + note2 + note1;
        System.out.println("The number of notes are: " + numberOfNotes);

        sc.close();
    }
}