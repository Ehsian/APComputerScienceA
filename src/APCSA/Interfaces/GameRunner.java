package APCSA.Interfaces;

public class GameRunner {
    public static void main(String[] args) {
        Game g = new Game();
        //GamePlayer p = new GamePlayer();  <-- Abstract, can not be instantiated
        g.CompanyInfo();

        //It is possible to declare:
        //Interface name = new Class();
        //as long as the class implements the interface stub methods
        //However you cannot do:
        //Interface inter = new Interface because the methods do not contain code
        GamePlayer inter = new Game();
        inter.move(10);
    }
}
