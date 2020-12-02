package APCSA.Assignments;

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
        //F = C/5*9+32
        int tempC = 28;
        System.out.println(tempC/5*9+32);

        //12)
        //86400 seconds in a day
        double seconds = 38800;
        System.out.println(seconds/86400 + " days");

        //13)
        //1.609km in a mile
        double miles = 500;
        System.out.println(miles*1.609);

        //14)
        //2.54cm in an inch
        double feet = 5;
        double inches = 3;
        System.out.println((feet*12+inches)*2.54);

        //15)
        //2.205 pounds in a kilogram
        min = 100;
        max = 150;
        range = max - min + 1;

        System.out.println(((int)(Math.random() * range)+min)/2.205);

        //OUTPUT:
        /*
        1) -1100
        2) 5
        3) 1.4142135623730951
        4) 3.1197348228454238E35
        5) 50
        6) 2273.204030303546
        7) 7
        8) 4091
        9) 35
        10) 0
        10) 6
        11) 77
        12) 0.44907407407407407 days
        13) 804.5
        14) 160.02
        15) 59.86394557823129
        */
    }
}
