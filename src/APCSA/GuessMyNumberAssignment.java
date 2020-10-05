package APCSA;

import java.util.Scanner;

public class GuessMyNumberAssignment {
    public static void main(String[] args) {
        while(true){
            boolean easy = false;
            int lives = 10;
            int guessamount = 0;
            int num = (int)(Math.random()*100)+1;
            int guess = 0;
            int toolow = 0;
            int toohigh = 0;

            System.out.println("Choose your difficulty: (e)asy, (m)edium, or (h)ard");
            Scanner scan = new Scanner(System.in);
            String difficulty = scan.nextLine();
            if(difficulty.contains("e")){
                easy = true;
            }
            else if(difficulty.contains("m")){
                easy = false;
            }
            else if(difficulty.contains("h")){
                easy = false;
                lives = 5;
            }
            else{
                continue;
            }


            System.out.println("Guess my random number between 1-100!");
            while(guess != num){
                System.out.println("You have "+lives+" guess(es) remaining.");
                Scanner ingamescan = new Scanner(System.in);
                guess = ingamescan.nextInt();
                if(guess>100 || guess <=0){
                    System.out.println("That is an invalid guess!");
                }
                else if(guess<num){
                    System.out.println("Higher!");
                    lives--;
                    guessamount++;
                    toolow++;
                    if(easy==true){
                        if((int)Math.floor(Math.abs((guess-num)/10))*10 == 0){System.out.println("You are very close!");}
                        else{
                            System.out.println("Your guess is at least "+(int)Math.floor(Math.abs((guess-num)/10))*10+" away!");
                            //If it prints exactly how close you are, you can get the answer far too easily.
                        }
                    }
                }
                else if(guess>num){
                    System.out.println("Lower!");
                    lives--;
                    guessamount++;
                    toohigh++;
                    if(easy==true){
                        if((int)Math.floor(Math.abs((guess-num)/10))*10 == 0){System.out.println("You are very close!");}
                        else{
                            System.out.println("Your guess is at least "+(int)Math.floor(Math.abs((guess-num)/10))*10+" away!");
                            //If it prints exactly how close you are, you can get the answer far too easily.
                        }
                    }
                }
                else if(guess==num){
                    System.out.println("You guessed correctly!");
                    guessamount++;
                    System.out.println("You won using "+guessamount+" guesses.");
                    System.out.println("Statistics:");
                    System.out.println("You guessed too high "+toohigh+" time(s) and too low "+toolow+" time(s)");
                }
                if(lives <= 0){
                    System.out.println("You lost!");
                    System.out.println("The number was "+num+".");
                    System.out.println("Statistics:");
                    System.out.println("You guessed too high "+toohigh+" time(s) and too low "+toolow+" time(s)");
                    guess = num;
                }
            }
            System.out.print("Play again? (y/n) ");
            Scanner retryscan = new Scanner(System.in);
            String again = retryscan.nextLine();
            if(again.contains("y")){
                continue;
            }
            else if(again.contains("n")){
                System.out.println("Thanks for playing!");
                break;
            }
            else{
                System.out.println("I'll take that as a no.");
                System.out.println("Thanks for playing!");
                break;
            }
        }
    }
}
