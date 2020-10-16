package APCSA;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class GreedyPigs {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.print("Input number of players: ");
        boolean gameactive = true;
        boolean cont = true;
        int temp=0;
        int turn=0;
        int players = scan.nextInt();
        int[] scores = new int[players];
        while(gameactive==true){
            for(int i=0;i<players;i++){
                System.out.println("Score (Starting from first player and ending on last):\n"+Arrays.toString(scores));
                System.out.println("Player "+(i+1)+"'s turn!");
                cont = true;
                temp = 0;
                turn = 0;
                while(cont==true){
                    int num1 = rand.nextInt(6)+1;
                    System.out.println("Rolled a "+num1);
                    int num2 = rand.nextInt(6)+1;
                    System.out.println("Rolled a "+num2);
                    if(num1==6&&num2==6){
                        if(turn==0){
                            System.out.println("Rolling a 6 on the first try doesn't count. Rerolling...");
                            continue;
                        }
                        else{
                            System.out.println("Player "+(i+1)+" rolled double 6's, therefore their score was reset.");
                            scores[i] = 0;
                            cont = false;
                            continue;
                        }
                    }
                    else if(num1==6||num2==6){
                        if(turn==0){
                            System.out.println("Rolling a 6 on the first try doesn't count. Rerolling...");
                            continue;
                        }
                        else{
                            System.out.println("Player "+(i+1)+" rolled a 6, therefore they don't gain anything this round.");
                            temp = 0;
                            cont = false;
                            continue;
                        }
                    }
                    else{
                        turn++;
                        temp+=(num1+num2);
                        System.out.println("Total this turn: "+temp);
                        if((scores[i]+temp)>=100){
                            gameactive=false;
                            break;
                        }
                    }
                    System.out.print("Player "+(i+1)+", Roll Again? (y/n)");
                    String again = scan.next();
                    if(again.contains("y")){
                        cont=true;
                    }
                    else{
                        cont = false;
                    }
                }
                scores[i]+=temp;
                if(gameactive==false){
                    System.out.println("Player "+(i+1)+" wins!");
                }
            }
        }
    }
}
