package APCSA;
import java.util.Scanner;

public class ForLoopsAssignment {
    public static void main(String[] args) {
        //1) Print out all numbers from 100 down to 1 that are odd.
        for(int i=99;i>0;i-=2){
            System.out.println(i);
        }
        //2) Print out all numbers from 1 to 100 that are divisible by 12.
        for(int i=1;i<=100;i++){
            if(i%12==0){
                System.out.println(i);
            }
        }
        //3) Print out all numbers from 500 to 1000, but any number that is divisible by 10 should be doubled.
        for(int i=500;i<=1000;i++){
            if(i%10==0){
                System.out.println(i*2);
            }
            else{
                System.out.println(i);
            }
        }
        //4) Ask the user for a number smaller than 10. Print out numbers from 10 down to the user number.
        Scanner scan = new Scanner(System.in);
        System.out.print("Input number less than 10: ");
        int num4 = scan.nextInt();
        for(int i=10;i>=num4;i--){
            System.out.println(i);
        }
        //5) Ask the user for two numbers. Print out all the numbers between the two numbers (inclusive).
        System.out.print("Input low number: ");
        int num5a = scan.nextInt();
        System.out.print("Input high number: ");
        int num5b = scan.nextInt();
        for(int i=num5a;i<=num5b;i++){
            System.out.println(i);
        }
        //6) Ask the user for two numbers between 1 and 100. Print out all numbers between 1 and 100 except those 2 numbers.
        System.out.println("Input 2 numbers between 1 and 100.");
        int num6a = scan.nextInt();
        int num6b = scan.nextInt();
        for(int i=1;i<101;i++){
            if(i==num6a||i==num6b){
                continue;
            }
            else{
                System.out.println(i);
            }
        }
        //7) Ask the user for a number between 1 and 100. Determine if the number is a prime number or not.
        System.out.print("Input a number between 1 and 100: ");
        int num7 = scan.nextInt();
        boolean isprime = true;
        for(int i=2;i<=Math.sqrt(100);i++){
            if(num7%i==0&&num7!=i){
                isprime = false;
            }
        }
        if(isprime==true){
            System.out.println(num7+" is prime.");
        }
        else{
            System.out.println(num7+" is not prime");
        }
        //8) Ask the user for a number. Add up all the numbers from 1 to that number.
        System.out.print("Input a number: ");
        int num8 = scan.nextInt();
        int sum8=0;
        for(int i=1;i<=num8;i++){
            sum8+=i;
        }
        System.out.println(sum8);
        //9) Ask the user for a number. Calculate the factorial up to that number.
        System.out.print("Input a number (Factorial): ");
        int num9 = scan.nextInt();
        for (int i=num9-1; i >= 1; i--) {
            num9 *= i;
        }
        System.out.println(num9);
        //10) Print out all numbers from 500 to 1000. Place an "X" beside numbers divisible by 5, a "Y" beside numbers divisible by 12, and a "Z" beside numbers divisible by both.
        for(int i=500;i<=1000;i++){
            if(i%60==0){
                System.out.println(i+"Z");
            }
            else if(i%12==0){
                System.out.println(i+"Y");
            }
            else if(i%5==0){
                System.out.println(i+"X");
            }
            else{
                System.out.println(i);
            }
        }
    }
}
