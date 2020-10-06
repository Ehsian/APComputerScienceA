package APCSA;

import java.util.Scanner;
//java.util.* imports everything from java.util
public class UserInput {
    public static void main(String[] args) {
        int num;
        //double mydouble;
        //String str;
        System.out.print("Enter an integer: ");
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();

        System.out.println("You entered " + num);

        /*
        Scanning doubles and strings:
        mydouble = scan.nextDouble();
        str = scan.nextLine();
        */

        //Exercise
        //Create a program that allows the user to enter a percentage then output the letter grade.
        //A = 86-100, B = 73-85, C = under 73

        double percent = 0;
        System.out.print("Enter your grade as a percentage.");
        percent = scan.nextDouble();
        if(percent >= 86 && percent<=100){
            System.out.println("A");
        }
        else if(percent >= 73 && percent < 86){
            System.out.println("B");
        }
        else if(percent <73.0 && percent >=50){
            System.out.println("C");
        }
        else if(percent <50 && percent >=0){
            System.out.println("F");
        }
        else{
            System.out.println("Idiot. You can't have that mark.");
        }

        //Challenge Exercise:
        //Create two random numbers for the user to add
        //If they get it right, print "congratulations"
        //If they get it wrong, keep asking until they get it right


        int lownum = 1;
        int highnum = 10;
        int range = highnum - lownum + 1;

        int num1 = (int)(Math.random()*range)+lownum;
        int num2 = (int)(Math.random()*range)+lownum;
        int ans = num1+num2;
        boolean flag = true;

        while(flag == true){
            System.out.print("What is "+num1+" + "+num2+"?");
            num = scan.nextInt();
            if(num == ans){
                System.out.println("Correct!");
                flag = false;
            }
            else{
                System.out.println("Incorrect!");
            }
        }
    }
}
