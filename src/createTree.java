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
    static void inOrder(Node root){
         if(root==null) return;
         inOrder(root.left);
        System.out.print(root.data);
        inOrder(root.right);
    }
    static void preOrder(Node root){
        if(root==null) return;
        System.out.print(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }
    static void postOrder(Node root){
        if(root==null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data);
    }
    static int height(Node root){
         if(root==null) return 0;
         return Math.max(height(root.left),height(root.right))+1;
    }
    static int size(Node root){
         if(root==null) return 0;
         int l = size(root.left);
         int r = size(root.right);
         return l+r;
    }
    static Scanner sc = null;
    public static void main(String[] args) {
        sc = new Scanner (System.in);
        Node root = createTreee();
//        inOrder(root);
//        System.out.println();
//        preOrder(root);
//        System.out.println();
//        postOrder(root);
        //System.out.println(height(root));
        System.out.println(size(root));
    }
}
