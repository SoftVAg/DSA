import java.util.*;
public class createTree {
     static Node createTreee(){
         Node root = null;
         System.out.println("Enter data ");
         int data = sc.nextInt();
         if(data ==-1) return null;
         root = new Node(data);
         System.out.println("Enter left for " + data);
         root.left = createTreee();
         System.out.println("Enter right for " + data);
         root.right = createTreee();
         return root;
    }
    static Scanner sc = null;
    public static void main(String[] args) {
        sc = new Scanner (System.in);
        Node root = createTreee();
    }
}
