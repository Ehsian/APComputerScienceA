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
    }
}
