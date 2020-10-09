package APCSA;
import java.util.Scanner;

public class ForLoops {
    //Quizzes: Next week Boolean, weak after If, While
    public static void main(String[] args) {
        //For loops have start and end.
        //Start, end condition, and increment.

        //for loop
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        //increment can be changed
        for (int i = 0; i < 10; i += 2) {
            System.out.println(i);
        }

        //Counting down
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        //Exercise:
        //Print out all numbers divisible by 5 between 50 and 100(inclusive)

        for (int i = 50; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }

        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }

        //Exercise 2:
        //Ask the user for a number
        //Print all odd numbers from 1 to that number
        Scanner scan = new Scanner(System.in);
        int maxnum = scan.nextInt();
        for (int i = 1; i <= maxnum; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
        //Exercise 3:
        //Ask user for a number
        //Determine if prime or not
        int primeornot = scan.nextInt();
        boolean flag = true;
        for (int i = 2; i < Math.sqrt(primeornot); i++) {
            if (primeornot % i == 0) {
                System.out.println("Not Prime");
                flag = false;
                break;
            }
        }
        if (flag == true) {
            System.out.println("Prime");
        }

        //Exercise 3:
        //if user gives a number, give factorial of number
        int factorialscan = scan.nextInt();
        for (int i = factorialscan-1; i >= 1; i--) {
            factorialscan *= i;
        }
        System.out.println(factorialscan);

        //Exercise 4:
        //User enters 2 numbers. Get GCF.
        int gcf1 = scan.nextInt();
        int gcf2 = scan.nextInt();
        int GCF = 0;
        for(int i = 1;i<=gcf1;i++){
            if(gcf1%i == 0 && gcf2%i == 0){
                GCF = i;
            }
        }
        System.out.println(GCF);
    }
}
