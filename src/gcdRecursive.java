import java.util.*;
public class gcdRecursive {
    public static String gcdRecursiv(String str1, String str2){
        if(!(str1+str2).equals(str2+str1)){
            return "";
        }
        return str1.substring(0,gcd(str1.length(),str2.length()));
    }
    static int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }

    public static void main(String[] args) {
        System.out.println(gcdRecursiv("ABABABABAB", "ABAB"));
    }
}
