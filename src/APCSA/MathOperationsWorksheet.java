package APCSA;

public class MathOperationsWorksheet {
    public static void main(String[] args) {
        //1)
        System.out.println(3-48*23+16/10);

        //2)
        System.out.println(12%7);

        //3)
        System.out.println(Math.sqrt(2));

        //4)
        System.out.println(Math.pow(7,42));

        //5)
        System.out.println(Math.abs(-50));

        //6)
        System.out.println((-2+Math.sqrt(8))*Math.pow(14,3));

        //---------------------------------------------------------
        int min; //For question 7-10
        int max; //For question 7-10
        int range; //For question 7-10

        //7)
        min = 1;
        max = 10;
        range = max - min + 1;

        System.out.println((int) (Math.random() * range)+min);

        //8)
        min = 1000;
        max = 8000;
        range = max - min + 1;

        System.out.println((int) (Math.random() * range)+min);

        //9)
        min = 25;
        max = 75;
        range = max - min + 1;

        System.out.println((int) (Math.random() * range)+min);

        //10)
        min = 0;
        max = 9;
        range = max - min + 1;

        System.out.println((int) (Math.random() * range)+min);
        //OR
        System.out.println((int)(Math.random()*10));

        //11)
        int tempC = 28;
        System.out.println(tempC/5*9+32);

        //12)
        //86400 seconds in a day
        double seconds = 38800;
        System.out.println(seconds/86400 + " days");

        //13)
        double miles = 500;
        System.out.println(miles*1.609);

        //14)
        double feet = 5;
        double inches = 3;
        System.out.println((feet*12+inches)*2.54);

        //15)
        min = 100;
        max = 150;
        range = max - min + 1;

        System.out.println(((int)(Math.random() * range)+min)/2.205);
    }
}
