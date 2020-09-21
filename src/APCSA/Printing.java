package APCSA;

public class Printing {
    public static void main(String[] args) {
        // <-- This writes a comment
        /*
        This makes everything in between a comment
        (useful for long chunk of comments)
         */
        System.out.print("Goodbye, cruel world. "); //Prints content on run
        System.out.println("No you!"); //Prints content then jumps to new line. \n functions the same.
        System.out.println("...");

        System.out.println(3+5); //You can also print math.
        /*
        * multiplies
        / divides
        (But you knew that already)
        Note: dividing integer by integer returns integer.
        Enter decimal numbers in order to be more precise.
        */
        System.out.println(9/10);//This will return 0.
        System.out.println(9.0/10.0);//This is correct.

        System.out.println("Hello "+"world!");//You can also add strings together.
        System.out.println("Hello there"+123+456);//Prints everything as string
        System.out.println(123+456+"Goodbye there");//Adds 123 and 456 first, treats as int not string
        System.out.println(20%7);//% = Remainder in division (mod)
    }
}
