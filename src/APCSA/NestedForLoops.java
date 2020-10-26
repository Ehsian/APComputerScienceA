package APCSA;

public class NestedForLoops {
    public static void main(String[] args) {
        //Adding from 1x1 to 10x10
        int num = 0;
        for(int i=1;i<11;i++) {
            for (int j=1; j<11; j++) {
                num += (j*i);
            }
        }
        System.out.println(num);

        //Printing
        /*
        xxxxx
        xxxx
        xxx
        xx
        x
         */
        for(int i=0;i<5;i++){
            for(int j=0;j<5-i;j++){
                System.out.print("x");
            }
            System.out.println();
        }

        //Practice Exercise 1
        //Write a nested for loop to print the following:
        //11111
        //2222
        //333
        //44
        //5

        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print(i);
            }
            System.out.println();
        }

        //Practice Exercise 2
        //Write a nested for loop that prints the following
        //5! = 5 x 4 x 3 x 2 x 1
        //4! = 4 x 3 x 2 x 1
        //etc
        for(int i=5;i>0;i--){
            System.out.print(i+"! = ");
            for(int j=i;j>0;j--){
                System.out.print(j+" x ");
            }
            System.out.println("\b\b");
        }

        //Practice Exercise 3
        //Write a nested for loop to print:
        //xaaaa
        //xxaaa
        //xxxaa
        //xxxxa
        //xxxxx
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("x");
            }
            for(int k=5-i;k>0;k--){
                System.out.print("a");
            }
            System.out.println();
        }
    }
}
