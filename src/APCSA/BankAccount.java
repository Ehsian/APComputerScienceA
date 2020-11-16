package APCSA;

public class BankAccount {
    //Check BankAccountRunner class to find syntax and usage
    public double balance;

    public BankAccount(){}
    //Constructors allow code to be written immediately when an object is created
    public BankAccount(double initialDeposit){
        balance = initialDeposit;
    }

    //Methods are functions of a class
    //They allow objects to execute commands

    //A public method is available to all classes
    public void deposit(double amount){
        balance += amount;
    }

    public double getBalance(){
        return balance;
    }

    //comments that say what a method is to do:
    //Precondition: Date and time must be positive.
    //Postcondition: It will calculate simple interest.
    public void calcInterest(double rate, double time){
        double interest = balance * rate * time;
        System.out.println(interest);
    }

    //Overloading: When you write a method with the exact same name, but the parameters must be different.
    //Either different number or different type

    public void calcInterest(double rate, double time, boolean compound){
        if(compound==true){
            //Do compound interest calculation
        }
    }

    //Variable scope
    //Variable declared with {} are only valid within
    public void method1(){
        int x=1;
        System.out.println(x);
    }
    public void method2(){
        //System.out.println(x); <-- Error results because the scope of x is within method1
    }
}
