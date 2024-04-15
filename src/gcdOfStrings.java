import java.util.*;
public class gcdOfStrings {
    public static boolean valid(String str1, String str2, int k){
        if(str1.length() % k > 0 && str1.length() % k >0){
            return false;
        }
        else{
            String base = str1.substring(0,k);
            return str1.replace(base, "").isEmpty() && str2.replace(base, "").isEmpty();
        }
    }
    public static String gcd(String str1, String str2){
        for(int i = Math.min(str1.length(),str2.length()); i>=1; i--){
            if(Solution.valid(str1,str2,i)){
                return str1.substring(0,i);
            }
        }
        return "";
    }
    public static void main(String[] args) {
        System.out.println(gcd("ABCABCABCABC","ABZZZ"));
    }
}
