package APCSA;

public class CasinoPlayerAssignment {
    public double balance;
    public String name;
    public CasinoPlayerAssignment(String playerName){
        name = playerName;
    }
    public CasinoPlayerAssignment(double initialBalance){
        balance = initialBalance;
    }
    public CasinoPlayerAssignment(String playerName, double initialBalance){
        name = playerName;
        balance = initialBalance;
    }
    public void setBalance(double newBalance){
        balance = newBalance;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        balance+=amount;
    }
    public void withdraw(double amount){
        if(checkBalance(amount)){
            balance-=amount;
        }
    }
    public static int randInt(int low,int high){
        return (int)(Math.random()*(high-low+1)+low);
    }
    private boolean checkBet(double bet){
        return bet>=0&&bet<=balance;
    }
    private boolean checkBet(double bet,double maximum){
        return bet>=0&&bet<=balance&&bet<=maximum;
    }
    private boolean checkBalance(double amount){
        return balance-amount>=0;
    }
}
