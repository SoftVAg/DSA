import java.util.*;
public class array2D {
    static  void  printArray(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows ");
        int r = sc.nextInt();
        System.out.println("Enter no. of columns ");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];  //total r*c

        System.out.println("Enter "+ r*c +" elements");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j] = sc.nextInt();
            }
        }
//        int[][] arr = { {1,2,3},
//                         {4,5,6},
//                        {7,8,9},
//                        };
       printArray(arr);
    }
}
