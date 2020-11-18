package APCSA;

public class ClassRunner {
    public static void main(String[] args) {
        //BankAccount is a class
        //A class is a blueprint, describing the behaviour of all bank accounts.

        //To declare an object, use the keyword new
        ClassesAndMethods Ben = new ClassesAndMethods();
        ClassesAndMethods Aaron = new ClassesAndMethods();
        ClassesAndMethods Zoey = new ClassesAndMethods();
        ClassesAndMethods Rose = new ClassesAndMethods(2.20);

        Aaron.setName("Ehron");
        Zoey.setName("Zoe");
        Rose.setName("Rosie");
        System.out.println(Rose);
        //Ben, Aaron, Zoey are objects (Instances of BankAccount)
        Aaron.deposit(25.50);
        System.out.println("Aaron's balance is: $"+Aaron.getBalance());
        Ben.deposit(999999999999.99);
        System.out.println("Ben's balance is: $"+Ben.getBalance());
        Aaron.calcInterest(0.6,2);

        //------------------------------------------------Static Methods
        System.out.println(StaticMethods.adder(1,2));
        System.out.println(StaticMethods.ki("ki"));
        StaticMethods problem1 = new StaticMethods();
        StaticMethods problem2 = new StaticMethods();
        StaticMethods problem3 = new StaticMethods();

        System.out.println("Number of problems is "+StaticMethods.getNum());
    }
}
