package APCSA.Assignments.CasinoAssignment;

public class GuessingPlayer extends CasinoPlayer{
    public GuessingPlayer(){
        super();
        System.out.println("Playing on guest account.");
    }
    public GuessingPlayer(double money,String name){
        super(money,name);
        if(money>100){
            System.out.println("No rich people allowed. Money is capped at $100.");
            setMoney(100);
        }
    }
    private int Random(){
        return (int)(Math.random()*10)+1;
    }
    public void Play(int guess){
        if(getBet()>getMoney()){
            System.out.println("Insufficient funds to bet.");
            return;
        }
        int num = Random();
        if(guess==num){
            setMoney(getMoney()+getBet()*2);
            System.out.println("Correct! You have won "+getBet()*2+" dollars.");
        }
        else if(guess+1==num||guess-1==num){
            setMoney(getMoney()+getBet());
            System.out.println("You were very close! You have won "+getBet()+" dollars.");
            System.out.println("The number was "+num+".");
        }
        else{
            setMoney(getMoney()-getBet());
            System.out.println("Incorrect. You have lost "+getBet()+" dollars.");
            System.out.println("The number was "+num+".");
        }
    }
    public void Helper(){
        System.out.println("If your guess is the same as the number, you win double what you bet.");
        System.out.println("If your guess is one away from the number, you win the amount that you bet.");
        System.out.println("Otherwise, you lose the amount that you bet.");
    }
    public void setMoney(double money){
        if(money>100){
            System.out.println("No rich people allowed. Money is capped at $100.");
            setMoney(100);
        }
        else{
            super.setMoney(money);
        }
    }
}
