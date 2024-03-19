import java.util.*;

public class inversionCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter size of array ");

    }

    static int inversionCount(int[] arr, int n) {
        n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                }
            }

        }
     return count;

    }
}
