package APCSA.Assignments.CasinoAssignment;

public class CasinoPlayer {
    double money;
    String name;
    double bet = 0;
    public CasinoPlayer(){
        money = 100;
        name = "Guest";
    }
    public CasinoPlayer(double money,String name){
        this.money = money;
        this.name = name;
    }
    public void setMoney(double money){
        this.money = money;
    }
    public double getMoney(){
        return money;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void betAmount(double bet){
        this.bet = bet;
    }
    public double getBet(){
        return bet;
    }

}
