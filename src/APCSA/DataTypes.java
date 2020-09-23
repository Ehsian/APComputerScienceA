package APCSA;

public class DataTypes {
    public static void main(String[] args) {
        //Primitive data - Single memory space, single value

        //Objects - Multiple pieces of information, multiple methods

        //3 Primitive data types needed for this class
        //int, double, boolean, (float?)

        int a = 1;

        // "=" is an assignment statement
        // "==" tests equality

        if(a == 1){
            System.out.println(a + " is equal to 1");
        }

        a = 10; //Sets a to 10
        a = a + 10; //Now a is 20
        if(a == 20){
            System.out.println(a + " is now equal to 20");
        }

        //Special operators:

        //++
        //a++ is equivalent to a += 1

        a++; //Added 1 to a. It is now 21.
        a--; //Subtracted 1 from a. It is back to 20.

        a+=10; //+= is equivalent to a = a + 10. A is now 30
        a-=10; //a is 20
        a*=10; //a is 200
        a/=10; //a is 20

        //Note: There is a minimum and maximum value to int.

        //Lowest possible int:
        System.out.println(Integer.MIN_VALUE);
        //Highest possible int:
        System.out.println(Integer.MAX_VALUE);

        //"final" prevents data from being changed.
        final double gravity = 9.8;

        //Casting - Allows you to "cast" or change a data type

        int zoey = 5;
        double bill = 2.5;

        //valid
        bill = zoey;
        System.out.println(bill);

        //invalid
        //zoey = bill;

        //Cast
        zoey = (int)bill;

        //Note: Casting a double will truncate the data
        //Truncate does not mean round, it will cut off data after the decimal
        bill = 3.14159;
        zoey = (int)bill;
        System.out.println(zoey);

        int arthur = 0;
        double ben = 1.1;
        double michael = 2.3;

        arthur = (int)ben/(int)michael;
        System.out.println(arthur);

        arthur = (int)(ben/michael);
        //vs
        arthur = (int)ben/(int)michael;
        //must choose between truncating after operation or truncating both nums before operation
    }
}
