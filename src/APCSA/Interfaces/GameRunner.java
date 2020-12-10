package APCSA.Interfaces;

public class GameRunner {
    public static void main(String[] args) {
        Game g = new Game();
        //GamePlayer p = new GamePlayer();  <-- Abstract, can not be instantiated
        g.CompanyInfo();
    }
}
