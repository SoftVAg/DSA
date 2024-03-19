import java.util.*;
public class reverseVowels {

    public static String reverseVowels(String s){
        char[] ch1= s.toCharArray();
        int i = 0;
        int j=s.length()-1;

        while(i<=j) {
            if (!isVowel(ch1[i]))
                i++;
            else if (!isVowel(ch1[j]))
                j--;
            else {
                char temp = ch1[i];
                ch1[i] = ch1[j];
                ch1[j] = temp;
                i++;
                j--;
            }
        }
        return s.valueOf(ch1);
    }
    public static boolean isVowel(char ch){
        return (ch == 'a' ||ch == 'e' || ch == 'i' ||ch == 'o' ||ch == 'u' ||ch == 'A' ||ch == 'E' ||ch == 'I' ||ch == 'O' ||ch == 'U' )? true: false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();   //boolean, int

        System.out.println(reverseVowels(s));
    }
}
