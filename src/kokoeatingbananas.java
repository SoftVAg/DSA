import java.util.*;
public class kokoeatingbananas {
    public static void main(String[] args) {
        int[] arr = {3, 6, 7, 11};
        int h = 8;
        System.out.println(k(arr,h));
    }

    public static int Max(int arr[]){
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(arr[i], max);
        }
        return max;
    }

        public static int totalHour(int arr[], int max) {
            int totalHours = 0;
            for (int i = 0; i < arr.length; i++) {
                totalHours += (int) Math.ceil((double) arr[i] / (double) max);
            }
            return totalHours;
        }
        public static int k(int arr[], int h){
            int max = Max(arr);
            for(int i=1; i<=max; i++){
                int k = totalHour(arr,i);
                if(k<=h){
                    return i;
                }
            }
            return max;
        }

    }

