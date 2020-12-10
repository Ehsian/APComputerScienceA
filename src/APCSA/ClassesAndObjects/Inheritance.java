package APCSA.ClassesAndObjects;

public class Inheritance extends ClassesAndMethods {
    //Inheritance class inherits all the public methods of the ClassesAndMethods class

    //Superclass: The class inherited from (In this case, ClassesAndMethods)

    //Subclass: The class that inherits (In this case, Inheritance)
    //Subclasses can only inherit from one superclass
    //There can be unlimited subclasses

    //Methods can be overridden
    //Overriding a method means the subclass method will be run instead of the superclass method
    public void calcInterest(double rate,double time){
        double interest = balance*rate*time;
        interest += 10; //Interest bonus for this subclass
        System.out.println("Interest is: "+interest+".");
    }
    //What is the difference between overriding and overloading?
        //Overriding is re-writing a method from the superclass
        //Overloading means having different types or numbers of parameters in a method header

    //Classes can inherit continuously
        //Example:
        //ClassesAndMethods -> Inheritance -> SuperInheritance
    //The very top class is Object
    //All classes inherit from Object

    public void specialSavings(){
        //Method for example purposes (Check ClassRunner)
    }
}
