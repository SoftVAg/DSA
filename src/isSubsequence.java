import java.util.*;
public class isSubsequence {
    public static boolean stringSubsequence(String s1,String s2) {

        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        int i = 0;
        int j = 0;

        while (i < s1.length() && j < s2.length()) {
            if (ch1[i] == ch2[j]) {
                i++;
                j++;
            }
                else{
                    j++;
                }
            }
            if (i == s1.length()) {
                return true;
            }

            return false;
        }

        public static void main(String[] args) {
            String  s2 = "Harshi";
            String  s1 ="amsi";
            System.out.println(stringSubsequence(s1,s2));
    }
}
