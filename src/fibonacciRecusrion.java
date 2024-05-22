import java.util.*;
public class fibonacciRecusrion {
    public static void main(String[] args) {
       // int n =10;
        System.out.println(fibonacciSeries(10));
    }
    public static int fibonacciSeries(int n){
        if(n<=1) return n;
        return fibonacciSeries(n-1)+fibonacciSeries(n-2);
    }

}
