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
     
     static ArrayList<Integer> topView(Node root) {
        Queue<Pair> q = new ArrayDeque<>();
        Map<Integer, Integer> map = new TreeMap<>();
        q.add(new Pair(0, root));
        while (!q.isEmpty()) {
            Pair curr = q.poll();
            map.put(curr.hd, curr.node.data);
            
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
         System.out.println(topView(root));
         System.out.println(bottomView(root));
    }
     
}
