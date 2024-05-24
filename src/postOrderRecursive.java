import java.util.*;
class TreeNode{
    int data;
    Node left,right;
    public TreeNode(int item){
        data = item;
        left = right = null;
    }
}
public class postOrderRecursive {
    Node root;
    postOrderRecursive(){
        root=null;
    }
    public void postOrder(Node root){
        if(root==null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);
    }
    public static void main(String[] args) {
        postOrderRecursive tree = new postOrderRecursive();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(6);
        System.out.println("The preOrder traversal of it is ");
        tree.postOrder(tree.root);
    }
}
