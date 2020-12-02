package APCSA.Assignments;

public class NestedForLoopsAssignment {
    public static void main(String[] args) {
        //1) Use a nested for loop to produce the following:
        for(int i=1;i<6;i++){ //I don't know if this is what is being asked for
            System.out.println(i+"54321");
        }
        for(int i=1;i<6;i++){ //Or this
            for(int j=5;j>0;j--){
                System.out.println(""+i+j);
            }
        }

        //2) Use a nested for loop to produce a 10x10 multiplication table
        for(int i=1;i<11;i++){
            for(int j=1;j<11;j++){
                System.out.print(i+"x"+j+"="+(i*j)+", ");
            }
            System.out.println();
        }

        //3)Use a nested for loop to produce the following:
        //a)
        for(int i=7;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        //b)
        for(int i=1;i<8;i++){
            for(int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        //c)
        for(int i=7;i>0;i--){
            for(int k=(7-i);k>0;k--){
                System.out.print(" ");
            }
            for(int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        //d) This is probably not optimal
        for(int i=1;i<5;i++){
            for(int j=i;j<4;j++){
                System.out.print(" ");
            }
            for(int k=7-(4-i)*2;k>0;k--){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=3;i>0;i--){
            for(int j=4-i;j>0;j--){
                System.out.print(" ");
            }
            for(int k=7-(4-i)*2;k>0;k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

