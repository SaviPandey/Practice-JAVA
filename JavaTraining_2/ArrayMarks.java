import java.util.*;
public class ArrayMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of semesters: ");
        int noOfSemester = sc.nextInt();

        int noOfSubjects[] = new int[noOfSemester];

        for (int i = 0; i < noOfSemester; i++) {
            System.out.print("Enter the number of subjects in semester " + (i + 1) + ":");
            noOfSubjects[i] = sc.nextInt();
        }

        int maxSubjects = noOfSubjects[0];
        for (int i = 0; i < noOfSemester; i++) {
            if (noOfSubjects[i] > maxSubjects) {
                maxSubjects = noOfSubjects[i];
            }
        }

        int marks[][] = new int[noOfSemester][maxSubjects];

        for (int i = 0; i < noOfSemester; i++) {
            int subjects = noOfSubjects[i];
            System.out.print("Enter marks in semester " + (i + 1) + ": ");
            for (int j = 0; j < subjects; j++) {
                int n = sc.nextInt();
                if (n > 100 && n < 0) {
                    System.out.println("Invalid mark");
                    System.exit(0);
                }
                marks[i][j] = n;
            }
        }

        int maxSemester[] = new int[noOfSemester];

        for (int i = 0; i < noOfSemester; i++) {
            int max = marks[i][0];
            for (int j = 0; j < maxSubjects; j++) {
                if (max < marks[i][j]) {
                    max = marks[i][j];
                }
            }
            maxSemester[i] = max;
        }

        for (int i = 0; i < maxSemester.length; i++) {
            System.out.println("The maximum marks in semester " + (i + 1) + " is: " + maxSemester[i]);
        }

        sc.close();
    }
}
