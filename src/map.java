import java.util.*;
public class map {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
     //  Set<String> set = new HashSet<>();
        map.put("Vedansh", 1127);
        map.put("Anubhav", 1122);
        map.put("Princy", 1121);
        map.put("Harsh", 1094);
        map.put("Pratham", 1112);
        map.put("", 1112);
        map.put("Dev", 1212);

        for (String i : map.keySet()) {  // print using for each loop
            System.out.println(i);
        }
        for(int j : map.values()){
            System.out.println(j);
        }
        for(String z : map.keySet()){
            System.out.println("Key: " + z + "value: " + map.get(z));
        }
        
        map.clear();
        System.out.println(map);

        System.out.println(map);
        map.get("Anubhav");
        System.out.println("The value is " + map.get("Vedansh"));
        System.out.println(map.containsKey("Pratham"));
        //System.out.println(map.remove("Vedansh", 1127));
        System.out.println(map.containsValue(1035));
        System.out.println(map.replace("Anubhav", 1122));
//        set = map.keySet();
//        System.out.println(set);

    }
}
