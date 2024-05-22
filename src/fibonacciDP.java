import java.util.*;
public class fibonacciDP {
    public static void main(String[] args) {
        System.out.println(fibonacciSeries(11));
    }
    public static int fibonacciSeries(int n){
        int[] arr = new int[n];
        arr[0]= 0;
        arr[1]= 1;
        for(int i=2; i<n; i++){
            arr[i]= arr[i-1]+arr[i-2];
        }
        return arr[n-1];
    }

}
