import java.util.*;
public class frequencyCharArray {
    public static void main(String[] args) {
        String s = "I am learning coding";
        int[] arr = new int[26];
        s = s.toLowerCase();
        for(int i =0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch)) {
                arr[ch - 'a'] += 1;
            }
        }
        for(int i =0; i<26; i++){
            if(arr[i]!=0){
                char ch = (char) (i+'a');
                System.out.println(ch + " = " + arr[i]);
            }
        }
    }
}
