package APCSA.Assignments;
import java.util.Random;
import java.util.Scanner;

public class SlotMachineAssignment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int money = 100;
        int bet;
        int num1,num2,num3;
        while(true){
            System.out.println("You have $"+money+".");
            System.out.print("Input your bet: ");
            bet = scan.nextInt();
            if(bet>money){
                System.out.println("You have insufficient funds. Please input a new bet.");
                continue;
            }
            else if(bet<=0){
                System.out.println("You can't bet that! Please input a new bet.");
                continue;
            }
            num1 = rand.nextInt(4)+1; //+1 because nextInt starts from 0
            num2 = rand.nextInt(4)+1;
            num3 = rand.nextInt(4)+1;
            System.out.println("Numbers rolled: "+num1+", "+num2+", "+num3);
            if(num1==num2&&num1==num3){
                System.out.println("All 3 numbers are the same!\nYou won $"+bet*5+"!"); //I think x10 is too much
                money += bet*5;
            }
            else if(num1==num2||num2==num3||num1==num3){
                System.out.println("2 of the numbers are the same!\nYou won $"+bet+"!"); //I think x2 is too much
                money += bet;
            }
            else{
                System.out.println("None of the numbers are the same.\nYou lost $"+bet+".");
                money -= bet;
            }
            if(money<=0){
                System.out.println("You have gone bankrupt and can no longer afford to play.");
                break;
            }
            System.out.println("You now have $"+money+".");
            System.out.print("Play again? (y/n): ");
            String again = scan.next();
            if(again.contains("y")){
                continue;
            }
            else {
                System.out.println("Thanks for playing!");
                System.out.println("You ended with $"+money+".");
                break;
            }
        }
    }
}
