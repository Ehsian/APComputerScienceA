package APCSA;

public class MathOperators {
    public static void main(String[] args) {
        //The built-in Math object contains many useful operators

        //Square root
        System.out.println(Math.sqrt(2));

        //Absolute Value
        System.out.println(Math.abs(-2));

        //Exponents
        System.out.println(Math.pow(2,3)); //2^3

        //Random - Returns a decimal number between 0 (inclusive) and 1 (non-inclusive)
        System.out.println(Math.random());

        System.out.println(Math.random()*10); //Truncate to get int between 0-10

        int lownum = 5;
        int highnum = 10;
        int range = highnum - lownum + 1;
        System.out.println((int)(Math.random()*range)+lownum);

        /*
            -Material for next quiz:
            -Printing
            -Mods
            -MathOperators & Random
         */
    }
}
