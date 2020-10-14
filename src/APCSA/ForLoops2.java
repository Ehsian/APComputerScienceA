package APCSA;
import java.util.Scanner;

public class ForLoops2 {
    public static void main(String[] args) {
        //1)
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        for(int i=1;i<=num;i+=2){
            System.out.println(i);
        }

        //2)
        System.out.print("How many numbers would you like to input? ");
        double sum = 0;
        int numamount = scan.nextInt();
        for(int i=0;i<numamount;i++){
            sum += scan.nextDouble();
        }
        System.out.println(sum/numamount);

        //3)
        System.out.print("Input a number: ");
        double num3 = scan.nextDouble();
        double sum3 = 0;
        for(double i=1;i<=num3;i++){
            sum3+=(1/i);
        }
        System.out.println(sum3);
    }
}
