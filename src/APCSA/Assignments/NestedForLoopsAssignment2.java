package APCSA.Assignments;
import java.util.Scanner;

public class NestedForLoopsAssignment2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //1) Write a nested for loop that will produce the following
        for(int i=1;i<=10;i++){
            for(int j=1;j<=10;j++){
                System.out.println(i+" / "+j+" = "+(double)i/j);
            }
        }
        //2) Ask the user for 2 nums. For the range given by user, print out GCF of every number given by the user
        System.out.print("Lower number: ");
        int num1 = scan.nextInt();
        System.out.print("Higher number: ");
        int num2 = scan.nextInt();
        int GCF = 0;
        for(int i=1;i<=num1;i++){
            if(num1%i==0 && num2%i==0){
                GCF = i;
            }
        }
        System.out.println(GCF);
        //3)
        int num = 0;
        System.out.print("Low num in range: ");
        int lownum = scan.nextInt();
        System.out.print("High num in range: ");
        int highnum = scan.nextInt();
        for(int i=lownum;i<=highnum;i++){
            num = 0;
            for(int j=1;j<i;j++){
                if(i%j==0){
                    num+=j;
                }
            }
            if(num==i){
                System.out.println(i+" is a perfect number.");
            }
        }
        //4)
        for(int i=1;i<=5;i++){
            for(int j=4;j>=i;j--){
                System.out.print(".");
            }
            System.out.println(i);
        }
        //5)
        for(int i=9;i>=-1;i--){
            for(int j=1;j<10-i;j++){
                System.out.print(10-j);
            }
            System.out.println();
        }
    }
}
