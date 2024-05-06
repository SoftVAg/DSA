import java.util.*;
public class KokoEatingBananasBS {
    public static void main(String[] args) {
        int[] arr = {332484035,524908576,855865114,632922376,222257295,690155293,112677673,679580077,337406589,290818316,877337160,901728858,679284947,688210097,692137887,718203285,629455728,941802184};
        int h = 823855818;
        System.out.println(k(arr,h));
    }
    public static int totalHour(int[] arr, int max) {
        int totalHours = 0;
        for (int i = 0; i < arr.length; i++) {
            totalHours += Math.ceil((double) arr[i] / (double) max);
        }
        return totalHours;
    }
    public static int k(int[] arr, int h){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            max = Math.max(arr[i],max);
        }
        int low = 1;
        int high = max;
        while(low<=high){
            int mid = (low+high)/2;
            int totalH = totalHour(arr,mid);
            if(totalH<=h){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }

}
