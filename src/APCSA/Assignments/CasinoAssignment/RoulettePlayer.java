package APCSA.Assignments.CasinoAssignment;

public class RoulettePlayer extends GuessingPlayer{
    public RoulettePlayer(){
        super();
    }
    public RoulettePlayer(double money,String name){
        super(money,name);
    }
    private int Random(){
        return (int)(Math.random()*39)+1;
    }
    public void Play(int guess){
        if(getBet()*5>getMoney()){
            System.out.println("Insufficient funds to bet.");
            return;
        }
        int num = Random();
        if(guess==num){
            setMoney(getMoney()+getBet()*10);
            System.out.println("Correct! You have won "+getBet()*10+" dollars.");
        }
        else if(guess>=1&&guess<=13&&num>=1&&num<=13||guess>=14&&guess<=26&&num>=14&&num<=26||guess>=27&&guess<=39&&num>=27&&num<=39){
            setMoney(getMoney()+getBet()*2);
            System.out.println("Close! You have won "+getBet()*2+" dollars.");
            System.out.println("The number was "+num+".");
        }
        else if(guess%2==0&&num%2==0||guess%2==1&&num%2==1){
            setMoney(getMoney()+getBet());
            System.out.println("Similar enough! You have won "+getBet()+" dollars.");
            System.out.println("The number was "+num+".");
        }
        else{
            setMoney(getMoney()-getBet()*5);
            System.out.println("Incorrect. You have lost "+getBet()*5+" dollars.");
            System.out.println("The number was "+num+".");
        }
    }
    public void Helper(){
        System.out.println("If your guess is the same as the number, you win 10 times what you bet.");
        System.out.println("If your guess is in the same range as the number, you win 2 times what you bet.");
        System.out.println("(Ranges: 1-13, 14-26, 27-39)");
        System.out.println("If your guess and the number are both even/odd, you win the amount that you bet.");
        System.out.println("Otherwise, you lose 5 times the amount that you bet.");
    }
    public static void Odds(){
        System.out.println("Exact number: 1/39");
        System.out.println("Same range: 1/3");
        System.out.println("Even: 19/39");
        System.out.println("Odd: 20/39");
    }
}
