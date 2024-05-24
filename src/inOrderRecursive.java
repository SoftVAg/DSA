import java.util.*;
class ListNode{
    int data;
    Node left,right;
    public ListNode(int item){
        data = item;
        left = right =null;
    }
}
public class inOrderRecursive {
    Node root;
    inOrderRecursive(){
        root=null;
    }
    public void inOrder(Node root){
        if(root==null) return;
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }
    public static void main(String[] args) {
        inOrderRecursive tree = new inOrderRecursive();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(6);
        System.out.println("The preOrder traversal of it is ");
        tree.inOrder(tree.root);
    }
}
