import java.util.*;

public class stockBuyandSell {
     ArrayList<ArrayList<Integer> > stockBuySell(int A[], int n) {
         // code here

         n = A.length;
         ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
         int buy = 0;
         int sell = 0;
         for (int i = 0; i < n - 1; i++) {
             if (A[i + 1] > A[i]) {
                 sell++;
             } else {
                 if (sell > buy) {
                     ArrayList<Integer> temp = new ArrayList<>();
                     temp.add(buy);
                     temp.add(sell);
                     ans.add(temp);
                 }
                 buy = i + 1;
                 sell = i + 1;
             }
         }
         if (sell > buy) {
             ArrayList<Integer> temp = new ArrayList<>();
             temp.add(buy);
             temp.add(sell);
             ans.add(temp);
         }
         return ans;
     }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter size of array: ");
         int n = sc.nextInt();
         int[] A = new int[n];
        System.out.println("Enter " +n+ " elements");
         for(int i=0; i<n; i++){
             A[i] = sc.nextInt();
         }
        stockBuyandSell sb = new stockBuyandSell();
        System.out.println(sb.stockBuySell(A,n));
        }
    }


