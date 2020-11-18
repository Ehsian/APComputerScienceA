package APCSA;

public class StaticMethods {
    //A static method allows you to run a method without creating an object first
    public static int adder(int num1,int num2){
        return num1+num2;
    }
    public static String ki(String ki){
        if(ki.equals("ki")){
            return "kiiiii!";
        }
        return "Ohpe!";
    }

    //A static variable (or class variable) is a variable related to the class but not the object.
    public static int numOfProblems = 0;
    public StaticMethods(){
        numOfProblems++;
    }
    public static int getNum(){
        return numOfProblems;
    }
}
