import java.util.*;
public class TopperSearch {
    public static void selectionSort(int arr[]){
        for(int i =0; i< arr.length-1; i++){
            int minPos = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void binarySearch(int result[], int key){
        int size = result.length;
        int pos = 0;
        boolean flag = false;

        int mid = 0, low = 0, high = size - 1;
        while (high >= low) {
            mid = (low + high) / 2;

            if (result[mid] == key) {
                flag = true;
                pos = mid;
                break;
            } else if (result[mid] > key) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if (flag) {
            System.out.println("Topper Score found at index " + pos);
        } else {
            System.out.println("Topper's score not found in the result!");
        }
    }
	
	public static void main(String args[])
	{
        Scanner sc = new Scanner(System.in);
        int[] result = {70, 60, 90, 88, 155, 96, 76, 72, 81};

        int[] percent = new int[10];
        System.out.print("Enter 10 Percentages: ");
        for(int i =0; i<10; i++){
         percent[i] = sc.nextInt();
        }
        selectionSort(percent);
        for(int i=0; i<10; i++){
         System.out.println(percent[i]+ " ");
        }
        int key = percent[percent.length-1];

        binarySearch(result, key);
        sc.close();

	}
}

