public class tribonacciDP {
    public static void main(String[] args) {
        System.out.println(tribonacciSeries(10));
    }
    public static int tribonacciSeries(int n){
        int[] arr = new int[n];
        arr[0]=0;
        arr[1]=0;
        arr[2] =1;
        for(int i=3; i<n; i++){
            arr[i] = arr[i-1] + arr[i-2] + arr[i-3];
        }
        return arr[n-1];
    }
}
