package APCSA.Interfaces;

public interface GamePlayer {
    //An interface should not have code ({})
    //All methods are declared abstract by default
    //Abstract methods are methods without code
    //Also called "stub methods"
    //Be default, all methods are public
    //Interfaces can not be instantiated
    //Used as blueprints
    public void move(double speed);

    public int shoot();

    public void attack(int numEnemy);
}
