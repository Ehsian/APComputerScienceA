package APCSA;

import javax.swing.text.html.StyleSheet;

public class Mods {
    public static void main(String[] args) {
        //Mod (%) is the remainder for a division.
        //Example 1
        System.out.println(10%4);
        //Prints 2 because 10/4 = 2 R2.

        //Example 2
        System.out.println(1%5);
        //Prints 1 because 1/5 = 0 R1.

        //Example 3
        System.out.println(40%40);
        //Prints 0 because 40/40 does not have a remainder.

        //A poor use of mod is non-integer

        //What can mod be used for?
        //Example: Determining if integer is even or odd.
        //Number mod 2 will always give either 1 if odd or 0 if even.
        //Print 123 as separate digits using / and %
        int num = 123;
        System.out.println(num/100);
        System.out.println(num%100/10);
        System.out.println(num%(num/100+num%100)); //My stupid complicated answer
        System.out.println(num%10); //This is good enough lol

        //Exercise
        //Given the number of hours, print out how many days and hours
        //Example: hours = 26, print out 1 day, 2 hours
        int hours = 26;
        System.out.print(hours/24+" days, ");
        System.out.println(hours%24+" hours");

    }
}
