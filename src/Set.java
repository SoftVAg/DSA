import java.util.*;
public class Set {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Gucci");
        set.add("Prada");
        set.add("Louis Vuittton");
        set.add("Balenciaga");
        set.add("Adidas");
        set.add("Adidas");
        System.out.println(set);
//        for(String i: set){
//            System.out.println(i);
//        }
        System.out.println(set.size());
//      Object[] arr = set.toArray();
//        for(int j = 0; j<arr.length; j++){
//            System.out.println(arr[j]);
//        }
       boolean res = (set.contains("String"))? true : false;
        }



//        Iterator value = set.iterator();
//        while(value.hasNext()){
//            System.out.println(value.next());
//        }



    }

