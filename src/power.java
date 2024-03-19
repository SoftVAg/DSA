import java.util.*;

public class power {
    public static void main(String[] args) {
//        double[] X = {2,1,6};
//        double[] Y = {1,5};
//        int count = 0;
//        for(int i =0; i<X.length; i++){
//            for(int j = 0; j<Y.length; j++){
//                if(Math.pow(X[i],Y[j]) > Math.pow(Y[j],X[i])){
//                    count++;
//                }
//            }
//        }
//        System.out.println(count);
        // Your code here
        int[] arr = {1,2,3,4,10,4,2,3,1};
        int sum1 = 0;
        int sum2 = 0;
        int left = 0;
        int right = arr.length - 1;
        int m = left + (right - left) / 2;

        while (left <= m - 1 && right >= m + 1) {
            if(left<=m){
                sum1 += arr[left];
            }
            if(right>=m) {
                sum2 += arr[right];
            }
        }
            if (sum1 == sum2) {
                System.out.println(m + 1);
            }
        }
    }
