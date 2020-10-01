package APCSA;

public class IfStatements {
    public static void main(String[] args) {
        //One-line vs Multi-line if statement
        //One-line if statements do not require braces {}
        //Multiple line does

        int aaron = -1;
        if(aaron < 0) System.out.println("One line if statement.");

        if(aaron < 0){
            System.out.println("This is a multi-line if statement.");
            System.out.println("Here is the second line");
        }

        if(aaron > 0){
            System.out.println("This won't happen so...");
        }
        else if(aaron == 0){
            System.out.println("Aaron is 0");
        }
        else{
            System.out.println("This line gets executed.");
        }

        //This isn't in class but use this in some situations instead :>
        switch(aaron){ //Good in situations where you would have to make a bunch of if statements with ==
            case 0: //Equivalent to if(aaron == 0){}
                System.out.println("Aaron is 0");
                break;
            case 1:
                System.out.println("Aaron is 1");
                break;
            case -1:
                System.out.println("Aaron is -1");
                break;
        }
    }
}
