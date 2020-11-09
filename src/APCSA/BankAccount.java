package APCSA;

public class BankAccount {
    //Check BankAccountRunner class to find syntax and usage

    public double balance;
    //Methods are functions of a class
    //They allow objects to execute commands

    //A public method is available to all classes
    public void deposit(double amount){
        balance += amount;
    }

    public double getBalance(){
        return balance;
    }

    public void calcInterest(double rate, double time){
        double interest = balance * rate * time;
        System.out.println(interest);
    }
}
