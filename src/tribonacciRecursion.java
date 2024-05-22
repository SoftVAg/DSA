public class tribonacciRecursion {
    public static void main(String[] args) {
        System.out.println(tribonacciSeries(10));
    }
    public static int tribonacciSeries(int n){
        if(n<=1) return n;
        return tribonacciSeries(n-1)+tribonacciSeries(n-2)+tribonacciSeries(n-3);
    }

}
