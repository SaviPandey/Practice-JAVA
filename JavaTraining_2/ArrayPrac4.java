public class ArrayPrac4 {
    public static void main(String[] args) {
        String[] strArray = {"Ayush", "Krithik", "Ayush", "Unnati"};

        for (int i = 0; i < strArray.length - 1; i++) {
            for(int j = i + 1; j < strArray.length; j++) {
                if (strArray[i].equals(strArray[j]) && (i != j)) {
                    System.out.println("Duplicates string: " + strArray[j]);
                }
            }
        }
    }
}
