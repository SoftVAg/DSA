import java.util.*;
class Pair{
    int hd;
    Node node;
     public Pair(int hd , Node node){
         this.node = node;
         this.hd = hd;
     }
}

public class createTree {
    static ArrayList<Integer> topView(Node root) {
        Queue<Pair> q = new ArrayDeque<>();
        Map<Integer, Integer> map = new TreeMap<>();
        q.add(new Pair(0, root));
        while (!q.isEmpty()) {
            Pair curr = q.poll();
            if (!map.containsKey(curr.hd)) {
                map.put(curr.hd, curr.node.data);
            }
            if (curr.node.left != null)
                q.add(new Pair(curr.hd - 1, curr.node.left));
            if (curr.node.right != null)
                q.add(new Pair(curr.hd + 1, curr.node.right));
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            list.add(entry.getValue());
        }
        return list;
    }

    static ArrayList<Integer> bottomView(Node root){
        Queue<Pair> q = new ArrayDeque<>();
        Map<Integer,Integer> map = new TreeMap<>();
        q.offer(new Pair(0,root));
        while(!q.isEmpty()){
            Pair curr = q.poll();
            map.put(curr.hd, curr.node.data);
            if(curr.node.left!=null)
                q.add(new Pair(curr.hd-1, curr.node.left));
            if(curr.node.right!=null)
                q.add(new Pair(curr.hd+1, curr.node.right));
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            list.add(entry.getValue());
        }
        return list;
    }

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
         return size(root.left)+size(root.right)+1;
    }

    static int maximumNode(Node root) {
        if (root == null) return Integer.MIN_VALUE;
        return Math.max(root.data, Math.max(maximumNode(root.left), maximumNode(root.right)));
    }

    static int minimumNode(Node root) {
        if (root == null) return Integer.MAX_VALUE;
        return Math.min(root.data, Math.min(minimumNode(root.left), minimumNode(root.right)));
    }
    static Node prev=null;
    static Node head = null;
    static void convertToDLL(Node root){
        if(root==null) return;
        convertToDLL(root.left);
        if(prev==null) head = root;
        else{
            root.left=prev;
            prev.right = root;
        }
        convertToDLL(root.right);
    }
    static int maxDiameter(Node root){
        if(root==null) return 0;
        int l = maxDiameter(root.left);
        int r= maxDiameter(root.right);
        int dia = height(root.left) + height(root.right)+1;
        return Math.max(dia, Math.max(l,r));
    }
   // static Node prev = null;
    static boolean isValid(Node root){
        if(root== null) return true;
        if(!isValid(root.left))return false;
        if(prev!=null && root.data<=prev.data) return false;
        prev=root;
        return isValid(root.right);
    }
    static boolean isValidBST(Node root, int min, int max){
        if(root==null) return true;
        if(root.data<=min || root.data>=max) return false;
        return (isValidBST(root.left,min,root.data) && isValidBST(root.right,root.data,max));
    }

    static boolean searchBST(Node root, int x){
        if(root==null) return false;
        if(root.data==x) return true;
        if(root.data<x)
            return searchBST(root.right,x);

        return searchBST(root.left,x);
    }
    static Node insertBST(Node root, int val){
        if(root==null) return new Node(val);
        if(root.data<val)
            root.right = insertBST(root.right,val);
        else if(root.data>val)
            root.left = insertBST(root.left,val);
        return root;
    }
    static Node deleteNode(Node root, int key) {
        if(root==null) return root;
        if(root.data>key)
            root.left = deleteNode(root.left,key);
        else if(root.data<key)
            root.right = deleteNode(root.right,key);
        else {
            if(root.left==null) return root.right;
            else if(root.right==null) return root.left;
            root.data= minValue(root.right);
            root.right = deleteNode(root.right,root.data);
        }
        return root;
    }
    
    static int minValue(Node root){
        int minv= root.data;
        while(root.left!=null){
            minv = root.left.data;
            root = root.left;
        }
             return minv;
    }
    static Scanner sc = null;
    public static void main(String[] args) {
        sc = new Scanner (System.in);
        Node root = createTreee();
          inOrder(root);
          System.out.println();
//        preOrder(root);
//        System.out.println();
//        postOrder(root);
//        System.out.println(height(root));
//        System.out.println(size(root));
//        System.out.println(maximumNode(root));
   //     System.out.println(minimumNode(root));
//        System.out.println(topView(root));
//        System.out.println(bottomView(root));
        //convertToDLL(root);
        //System.out.println(maxDiameter(root));
        System.out.println(isValid(root));
    }
}
