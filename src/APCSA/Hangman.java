package APCSA;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Hangman {
    public static void main(String[] args) {
        ArrayList<String> guessed = new ArrayList<>();
        ArrayList<String> words = new ArrayList<>();
        words.add("hello");words.add("mister");words.add("lu");words.add("please");words.add("give");words.add("high");words.add("mark");
        int lives;
        boolean win;
        Scanner scan = new Scanner(System.in);
        String guess;
        String word;
        while(true) {
            guessed.clear();
            System.out.println("(S)ingleplayer, (C)ustom, or (Q)uit?");
            String start = scan.next();
            if(start.toLowerCase().charAt(0)=='s'){
                lives = 6;
                word = words.get(new Random().nextInt(words.size()));
            }
            else if(start.toLowerCase().charAt(0)=='c'){
                System.out.print("Input number of lives: ");
                lives = scan.nextInt();
                System.out.println("Input a word (Guesser look away!)");
                word = scan.next();
                words.add(word);
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nHiding word... (Do not scroll up)!\n");
            }
            else if(start.toLowerCase().charAt(0)=='q'){
                System.out.println("Quitting...");
                break;
            }
            else{
                continue;
            }
            while(lives>0){
                win=true;
                for(int i=0;i<word.length();i++){
                    if(guessed.contains(word.substring(i,i+1))){
                        System.out.print(word.substring(i,i+1));
                    }
                    else{
                        win=false;
                        System.out.print("_");
                    }
                }
                System.out.println();
                if(win==true){
                    System.out.println("You win!");
                    break;
                }
                System.out.print("\nInput your guess: ");
                guess = scan.next();
                if(guessed.contains(guess)){
                    System.out.println("You already guessed that!");
                    continue;
                }
                else if(guess.length()>1){
                    guessed.add(guess);
                    if(guess.equalsIgnoreCase(word.toLowerCase())){
                        System.out.println("You win!");
                        break;
                    }
                    else{
                        lives--;
                        System.out.println("Incorrect! You have "+lives+" lives remaining.");
                    }
                }
                else{
                    guessed.add(guess);
                    if(word.indexOf(guess)==-1){
                        lives--;
                        System.out.println("Incorrect! You have "+lives+" lives remaining.");
                    }
                }
                if(lives<=0){
                    System.out.println("You lost!");
                    break;
                }
            }
        }
    }
}
