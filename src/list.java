import java.sql.Array;
import java.util.*;
public class list {
    public static void main(String[] args) {
    LinkedList<String> brands = new LinkedList<>();
    brands.add("Samsung");
    brands.add("Vivo");
    brands.add("Realme");
    brands.add("Apple");

    ListIterator<String> itr =  brands.listIterator();
        while(itr.hasNext()){ // forward direction
            System.out.println(itr.next());
        }
        while(itr.hasPrevious()){   // backward direction
            System.out.println(itr.previous());
        }


      // System.out.println(brands);
//    brands.add(2,"Xiaomi");
//        System.out.println("The new list is : " + brands);
//    brands.set(1,"Grape");
//        System.out.println(brands);
//        Collection<String> collect = new ArrayList<>();
//        collect.add("Great");
//        collect.add("Vivo");
//        collect.add("Realme");
//        collect.add("Apple");
//
//        brands.addAll(collect);
//        System.out.println(brands);
//        brands.addFirst("Oppo");
//        brands.addLast("Nippo");
//        System.out.println(brands);
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(6);
        list1.add(76);
        list1.add(726);
        list1.add(0,986);
        list1.add(2);
        list1.add(23);
        list1.add(345);

     //   boolean ans = (list1.contains(22))? true : false ;
       // System.out.println(ans);
//    ans =
//        if(ans)
//            System.out.println("The list contains 2");
//        else
//            System.out.println("The list does not contains 2");


       //Iterator- limited to forward direction (only read and remove operations)
//        Iterator<Integer> it = list1.iterator();
//        while(it.hasNext()){
//            int i = it.next();
//            if(i<50){
//                it.remove();
//            }
//        }
      //  System.out.println(list1);

        // ListIterator -> both forward and backward direction(create, read, update, delete(CRUD))


    }
}
