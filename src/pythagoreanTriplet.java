import java.util.*;
public class pythagoreanTriplet {
    public static boolean triplet(int[] arr, int n) {
        Arrays.sort(arr);


        for(int i=n-1; i>=2; i--){
            int left=0;
            int right = i-1;

            while(left<right){
                if((arr[left]*arr[left])+(arr[right]*arr[right])==(arr[i]*arr[i])){
                    return true;
                }
                else if((arr[left]*arr[left])+(arr[right]*arr[right])<(arr[i]*arr[i])){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n+ " elements");
        boolean bn = sc.nextBoolean();
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
    }
}
