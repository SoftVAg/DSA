import java.util.*;
public class Dota2Senate {
    public static void main(String[] args) {
        String senate = "DDRRR";
        System.out.println(predictPartyVictory(senate));
    }
    public static String predictPartyVictory(String senate) {
        Queue<Integer> qr=new LinkedList<>();
        Queue<Integer> qd=new LinkedList<>();
        int n=senate.length();
        for(int i=0;i<senate.length();i++){
            if(senate.charAt(i)=='R') qr.add(i);
            else qd.add(i);
        }

        while(!qr.isEmpty() && !qd.isEmpty()){
            int a=qr.poll();
            int b=qd.poll();
            if(a<b) qr.add(a+n);
            else qd.add(b+n);
        }
        if(qr.size()>qd.size()) return "Radiant";
        else return "Dire";
    }
}
