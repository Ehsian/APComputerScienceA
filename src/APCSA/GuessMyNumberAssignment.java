package APCSA;

import java.util.Scanner;

public class GuessMyNumberAssignment {
    public static void main(String[] args) {
        while(true){
            int lives = 10;
            int guessamount = 0;
            int num = (int)(Math.random()*100)+1;
            int guess = 0;
            System.out.println("Guess my random number between 1-100!");
            while(guess != num){
                System.out.println("You have "+lives+" guess(es) remaining.");
                Scanner scan = new Scanner(System.in);
                guess = scan.nextInt();
                if(guess>100 || guess <=0){
                    System.out.println("That is an invalid guess!");
                }
                else if(guess<num){
                    System.out.println("Higher!");
                    lives--;
                    guessamount++;
                }
                else if(guess>num){
                    System.out.println("Lower!");
                    lives--;
                    guessamount++;
                }
                else if(guess==num){
                    System.out.println("You guessed correctly!");
                    guessamount++;
                    System.out.println("You won using "+guessamount+" guesses.");
                }
                if(lives <= 0){
                    System.out.println("You lost!");
                    guess = num;
                }
            }
            System.out.print("Play again? (y/n) ");
            Scanner retry = new Scanner(System.in);
            String again = retry.nextLine();
            if(again.contains("y")){
                continue;
            }
            else if(again.contains("n")){
                System.out.println("Thanks for playing!");
                break;
            }
            else{
                System.out.println("I'll take that as a no.");
                break;
            }
        }
    }
}
