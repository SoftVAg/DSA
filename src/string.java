import java.util.*;

public class string {
    public static void main(String[] args) {
        String s = "TimeComplexity";
        String s1 = s.replace('i', 'b');
        System.out.println(s.length());
        System.out.println(s.toUpperCase()); // uppercase
        System.out.println(s.toLowerCase()); // lowercase
        System.out.println(s.indexOf('T')); // indexOf

        System.out.println(s);  // immutability
        //System.out.println(s1);
        StringBuilder sb = new StringBuilder("TonynGuy");
        //insertion
        sb.insert(2,'c'); //add more function-->capacity, reverse, insert, charAt, indexOf, replace, substring
       System.out.println(sb);
        System.out.println();

        sb.delete(2,4); // deletion
        System.out.println(sb);

        System.out.println(sb.substring(0,4));  //substring


        System.out.println(sb.append('e')); // append function
        System.out.println(sb.append(1));

        System.out.println(sb.length()); // length of a string
        sb.reverse(); // reverse a string
        System.out.println(sb);
        System.out.println(sb.charAt(4));   //charAt function




        }
    }
