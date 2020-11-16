package APCSA;

public class BankAccountRunner {
    public static void main(String[] args) {
        //BankAccount is a class
        //A class is a blueprint, describing the behaviour of all bank accounts.

        //To declare an object, use the keyword new
        BankAccount Ben = new BankAccount();
        BankAccount Aaron = new BankAccount();
        BankAccount Zoey = new BankAccount();
        BankAccount Rose = new BankAccount(2.20);
        //Ben, Aaron, Zoey are objects (Instances of BankAccount)
        Aaron.deposit(25.50);
        System.out.println("Aaron's balance is: $"+Aaron.getBalance());
        Ben.deposit(999999999999.99);
        System.out.println("Ben's balance is: $"+Ben.getBalance());
        Aaron.calcInterest(0.6,2);
    }
}
