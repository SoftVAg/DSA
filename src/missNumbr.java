import java.util.*;

public class missNumbr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n+" elements");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
       // System.out.println("Enter target ");

        System.out.println(missNumber(arr,n));
    }
    public static int missNumber(int[] arr, int n){
       // int n = arr. int n = 10;
         n = arr.length;
        int sum1 = (n*(n+1))/2;
        int sum2 = 0;
        for(int i = 0; i<n-1; i++){
            sum2 += arr[i];
        }
        int target = sum1-sum2;
        return target;
    }
}
