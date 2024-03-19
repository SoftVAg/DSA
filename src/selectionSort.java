import java.util.*;
public class selectionSort {
    static int selectionSort(int[] arr, int n) {
        for (int i = 0; i <arr.length; i++) {
            int minimum = i;
            for (int j = i; j <arr.length; j++) {
                if (arr[j] < arr[i]) minimum = j;
            }
            int temp = arr[minimum];
            arr[minimum] = arr[i];
            arr[i] = temp;
            System.out.println("runs");
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements");
        for (int k = 0; k < n; k++) {
            arr[k] = sc.nextInt();
        }
        System.out.println("sorted array is ");
        selectionSort(arr,n);
        for(int k=0; k<n; k++){
            System.out.print(arr[k] + " ");
        }
    }
}
