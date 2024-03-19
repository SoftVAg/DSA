import java.util.*;
public class arrayList2D {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(1);
        a1.add(2);
        a1.add(3);
        a1.add(4);

        ArrayList<Integer> a2 = new ArrayList<>();
        a2.add(5);
        a2.add(6);
        a2.add(7);
        a2.add(8);

        ArrayList<Integer> a3 = new ArrayList<>();
        a3.add(9);
        a3.add(10);
        a3.add(11);
        a3.add(12);


        ArrayList<ArrayList<Integer>> main = new ArrayList<>();
        main.add(a1);
        main.add(a2);
        main.add(a3);
        System.out.println(main);
    }
}
