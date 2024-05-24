import java.util.*;

class Node{
    int data;
    Node left,right;
    public Node(int item){
        data = item;
        left = right =null;
    }
}

public class preOrderRecursive {
Node root;
    preOrderRecursive(){
        root=null;
    }
    public void preOrder(Node root) {
        if (root == null) return;
        System.out.println(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        preOrderRecursive tree = new preOrderRecursive();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(6);
        System.out.println("The preOrder traversal of it is ");
        tree.preOrder(tree.root);
    }
}

