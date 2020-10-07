package APCSA;
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Random rand = new Random();
        String[] choices = {"Rock", "Paper", "Scissors"};
        int playerchoice = 0;
        Scanner scan = new Scanner(System.in);
        int wins = 0;
        int draws = 0;
        int losses = 0;

        System.out.print("Enter your name: ");
        String name = scan.next();
        while(true){
            int computerchoice = rand.nextInt(choices.length);
            System.out.print("(R)ock, (P)aper, or (S)cissors? ");
            String scanchoice = scan.next().toLowerCase();
            if(scanchoice.contains("r")){
                playerchoice = 0;
            }
            else if(scanchoice.contains("p")){
                playerchoice = 1;
            }
            else if(scanchoice.contains("s")){
                playerchoice = 2;
            }
            else{
                System.out.println("Invalid Input! (Please input 'R', 'P', or 'S'.)");
                continue;
            }
            System.out.println("Computer chose "+choices[computerchoice]+".");
            if(computerchoice==playerchoice){
                System.out.println("It's a draw!");
                draws++;
            }
            else if(computerchoice==0&&playerchoice==1||computerchoice==1&&playerchoice==2||computerchoice==2&&playerchoice==0){
                System.out.println("You won!");
                wins++;
            }
            else{
                System.out.println("You lost!");
                losses++;
            }
            System.out.print("Play again? (y/n): ");
            String again = scan.next();
            if(again.contains("y")){
                System.out.println("Current Score: "+wins+" win(s), "+losses+" loss(es), "+draws+" draw(s).");
                continue;
            }
            else{
                System.out.println("Thanks for playing!");
                System.out.println(name+" ended with: "+wins+" win(s), "+losses+" loss(es), "+draws+" draw(s).");
                break;
            }
        }
    }
}
