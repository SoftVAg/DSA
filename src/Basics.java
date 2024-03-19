
import java.util.*;
public class Basics {
    public static void main(String[] args) {

        //ternary operation
        int number =13;
        String result  = (number % 2 == 0)?"Even number": "odd number";  //ternary operator
        System.out.println(result);

        // typecasting
        int myInt = 23;
        double Double = 234.6543;
        double myDouble = myInt; // Automatic casting: int to double Widecasting
        int  narrowcasting = (int) Double; // narrowCasting

        System.out.println(myInt);      // Outputs 23
        System.out.println(myDouble);   // Outputs 23.0
        System.out.println(narrowcasting);

        // Switch statements
        int day = 4;
        switch (day){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("may");
                break;
        }

        // while loop
        int i=0;
        int j=5;
         while(i<j){
             if(i>j) System.out.println(true);
             else System.out.println(false);
             i++;
         }

         //nested loops pattern
       for(int k=0; k<=5; k++){
           for(int l=0; l<=k; l++){
               System.out.print("*");
           }
           System.out.println();
       }

       //for each loop
       int[] arr = {23,6,456,67,37,3763}; //integer array
       for(int s: arr){
           System.out.println(s);
       }

       //for each loop
        String[] names = {"Harshi","Ashvik","Saurabh"}; //String array
        for(String q: names){
           System.out.println(q);
       }

        //Mathematics
        int n1= 2345;
        int n2= 76543;
        float f2= -6543.654f;
        double d1 = 23.9876543;
        double d2 = 2.857333345;
        System.out.println(Math.min(n1,n2)); // maximum
        System.out.println(Math.max(n1,n2)); // minimum
        System.out.println(Math.abs(f2)); // absolute value
        System.out.println(Math.addExact(n1,n2)); // exact addition
        System.out.println(Math.decrementExact(n2)); //decrement by -1
        System.out.println(Math.log10(d1)); //log value


        //break and continue
        for (int a = 0; a < 10; a++) {
            // Terminate the loop when i is 5
            if (a == 5)
                break;
            System.out.println("a: " + a);
        }
        System.out.println("Out of Loop");


        for(int z=0; z<5; z++){
            if(z==2)
                continue;
            System.out.print(z+ " ");
        }
    }
}