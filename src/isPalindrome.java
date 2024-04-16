import java.util.*;
public class isPalindrome {
    static boolean palindrome(String s1) {

        int left = 0;
        int right = s1.length() - 1;
        if (left >= right) {
            return true;
        }
        if (s1.charAt(left) == (s1.charAt(right))) {
            left++;
            right--;
        }
        else{
            return false;
        }
            return palindrome(s1.substring(left, right+1));
        }

    public static void main(String[] args) {
        System.out.println(palindrome("RADAR"));
    }
}

