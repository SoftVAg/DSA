import java.util.*;
public class bubbleSort {
    public static void main(String[] args) {
        //Arraylist<Integer> arr = new ArrayList<>();int n = 5;
        int[] arr = {4,1,3,2};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
//                System.out.println("runs");
            }
            System.out.println("runs");
        }

        System.out.println(Arrays.toString(arr));
    }
}
