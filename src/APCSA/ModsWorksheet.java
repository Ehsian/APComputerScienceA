package APCSA;

public class ModsWorksheet {
    public static void main(String[] args) {
        //Answers to APCSA Mods Worksheet

        /*
        1) 1
        2) 2
        3) 6
        4) 0
        5) 0
        6) 3
        7) 1
        8) 0
        9) 0
        */

        //10) How can you use mod to determine if a number is odd or even?
        int num = 2591; //Can be any number
        num%=2;
        if(num==0){System.out.println("Even");}
        else if(num==1){System.out.println("Odd");}
        //Written answer: num %= 2; <-- If remainder == 0, it is even. If remainder == 1, it is odd.

        //11) Write a print statement and mod to retrieve the first digit, the second digit,
        //and the last digit of a three digit integer.
        int number = 123; //Can be any 3 digit integer
        System.out.println(number/100);
        System.out.println(number%100/10);
        System.out.println(number%10);

        //12)Given a certain number of hours, convert it to days with the number of hours left over.
        int hours = 100; //Can be any integer
        System.out.println(hours/24+" days, "+hours%24+" hours.");

        //13)Why is using an irrational number in a mod operation not an effective use of mod?
        //Answer: What is the point of using decimals if you are trying to find remainders?
    }
}
