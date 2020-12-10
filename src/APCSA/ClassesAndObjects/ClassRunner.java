package APCSA.ClassesAndObjects;

import APCSA.Assignments.ShapeCalcAssignment;

public class ClassRunner {
    public static void main(String[] args) {
        //------------------------------------------------ClassesAndMethods Runner
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

        //------------------------------------------------Static Methods Runner
        System.out.println(StaticMethods.adder(1,2));
        System.out.println(StaticMethods.ki("ki"));
        StaticMethods problem1 = new StaticMethods();
        StaticMethods problem2 = new StaticMethods();
        StaticMethods problem3 = new StaticMethods();

        System.out.println("Number of problems is "+StaticMethods.getNum());

        //------------------------------------------------Inheritance Runner
        Inheritance Arthur = new Inheritance();
        Arthur.deposit(50); //This works because deposit() is a public method
        //Arthur.programmer() does not work because programmer() is a private method
        Arthur.calcInterest(1,1);
        Rose.calcInterest(1,1);

        //Another way to declare objects:
        ClassesAndMethods Michael = new Inheritance();
        //Michael cannot run Inheritance methods but can run overwritten ClassesAndMethods methods
        //Michael can only run all methods in the superclass and overwritten methods in the subclass.
        //Michael.specialSavings();
        Arthur.specialSavings(); //This works
        Michael.calcInterest(15,15); //This will run the overwritten method in Inheritance

        //------------------------------------------------Subclass and Superclass Runner
        Subclass s = new Subclass();
        s.Superclassmethod();
        Subclass2 s2 = new Subclass2();

        //------------------------------------------------ShapeCalcAssignment Testing
        ShapeCalcAssignment.circleInfo(3);
        ShapeCalcAssignment.cylinderInfo(3,5);
        ShapeCalcAssignment shape1 = new ShapeCalcAssignment("Triangle");
        ShapeCalcAssignment shape2 = new ShapeCalcAssignment("Square");
        System.out.println("Times used: "+ShapeCalcAssignment.getNumTimesUsed());

    }
}
