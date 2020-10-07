package APCSA;
import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        //1)
        int q1 = 1000;
        while(q1 >= 500){
            System.out.print(q1+" ");
            q1--;
        }
        System.out.println();

        //2)
        int q2 = 100;
        while(q2<=200){
            System.out.print(q2+" ");
            q2+=2;
        }
        System.out.println();

        //3)
        int q3 = 15;
        while(q3<=75){
            System.out.print(q3+" ");
            q3+=15;
        }
        System.out.println();

        //4)
        System.out.print("Insert any positive number: ");
        Scanner scan = new Scanner(System.in);
        double q4 = scan.nextDouble();
        int q4timesran = 0;
        while(q4>=1){
            q4 /= 2;
            q4timesran++;
        }
        System.out.println("Loop has been run "+q4timesran+" times.");

        //5)
        System.out.print("Input positive numbers. Input -1 to stop collecting info: ");
        double q5ans = 0;
        double q5 = 0;
        int q5timesran = 0;
        while(q5!=-1){
            q5 = scan.nextDouble();
            if(q5==-1){
                continue;
            }
            else{
                q5ans+=q5;
                q5timesran++;
            }
        }
        q5ans/=q5timesran;
        System.out.println("Average: "+q5ans);

        //6)
        System.out.println("Input an integer 5 times.");
        int q6timesran = 0;
        int q6 = 0;
        while(q6timesran<5){
            q6 += scan.nextInt();
            q6timesran++;
        }
        System.out.println("Sum: "+q6);

        //7)
        int q7 = 0;
        int q7pass = 1234;
        int q7ans = 0;
        System.out.println("Enter a 4 digit number.");
        while(q7pass!=q7){
            q7 = scan.nextInt();
            q7ans++;
            if(q7!=q7pass){
                System.out.println("Incorrect! Keep guessing!");
            }
        }
        System.out.println("Correct! Attempts: "+q7ans);

        //8)
        int q8;
        int q8pass = 1234;
        int lives = 5;
        System.out.println("Enter your 4 digit passcode.");
        while(lives>0){
            System.out.println("You have "+lives+" chances remaining.");
            q8 = scan.nextInt();
            if(q8pass == q8){
                System.out.println("Correct.");
                break;
            }
            else{
                lives--;
                System.out.println("Incorrect.");
                if(lives == 0){
                    System.out.println("This account has been locked.");
                }
            }
        }
    }
}
