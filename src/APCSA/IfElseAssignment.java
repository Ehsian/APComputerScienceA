package APCSA;

import java.util.Scanner;

public class IfElseAssignment {
    public static void main(String[] args) {
        //1)
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        if(input>100){
            System.out.println("greater than 100");
        }
        else{
            System.out.println("less than 100");//though this runs if input is 100 too. Have to do as stated in question though.
        }
        //2)
        String q2 = scan.next();
        if(q2.contentEquals("password")){
            System.out.println("correct");
        }
        else{
            System.out.println("incorrect");
        }
        //3)
        int q3 = scan.nextInt();
        if(Math.pow((int)Math.sqrt(q3),2)==q3){
            System.out.println("perfect square");
        }
        else{
            System.out.println("not perfect square");
        }
        //4)
        int q4 = scan.nextInt();
        if(q4%3 == 0){
            System.out.println("divisible by 3");
        }
        else{
            System.out.println("not divisible by 3");
        }
        //5)
        int q5 = scan.nextInt();
        if(q5%35 == 0){
            System.out.println("divisible by 5 and 7");
        }
        else if(q5%5 == 0){
            System.out.println("divisible by 5 only");
        }
        else if(q5%7 == 0){
            System.out.println("divisible by 7 only");
        }
        else{
            System.out.println("not divisible by 5 or 7");
        }
        //6)
        double percent = scan.nextDouble();
        if(percent >= 86 && percent<=100){
            System.out.println("A");
        }
        else if(percent >= 73 && percent < 86){
            System.out.println("B");
        }
        else if(percent <73 && percent >=50){
            System.out.println("C");
        }
        else if(percent <50 && percent >=0){
            System.out.println("F");
        }
        else{
            System.out.println("error");
        }
        //7)
        int q7 = scan.nextInt();
        if(q7 == 0){
            System.out.println("zero");
        }
        if(q7/-1==Math.abs(q7)){
            System.out.print("negative ");
        }
        else{
            System.out.print("positive ");
        }
        if(q7%2 == 0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
        //8)
        int num = (int)(Math.random()*100)+1;
        int q8 = scan.nextInt();
        System.out.println(num);
        System.out.println(q8);
        if(q8>100 || q8<1){
            System.out.println("Invalid Input!");
        }
        else if(q8==num){
            System.out.println("Equal");
        }
        else if(q8>num){
            System.out.println("User input number is greater. ("+q8+">"+num+")");
        }
        else{
            System.out.println("Randomly generated number is greater. ("+num+">"+q8+")");
        }
        //9)
        int q9num1 = scan.nextInt();
        int q9num2 = scan.nextInt();
        int q9num3 = scan.nextInt();
        if(q9num1>=q9num2 && q9num1>=q9num3){
            System.out.println(q9num1+" is the biggest integer.");
        }
        else if(q9num2>=q9num1 && q9num2>=q9num3){
            System.out.println(q9num2+" is the biggest integer.");
        }
        else{
            System.out.println(q9num3+" is the biggest integer.");
        }
        //10)
        int q10num1 = scan.nextInt();
        int q10num2 = scan.nextByte();
        if(q10num1%10==q10num2%10){
            System.out.println("The last digit of both numbers are equal");
        }
        else{
            System.out.println("The last digit of both numbers are not equal.");
        }
    }
}
