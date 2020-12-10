package APCSA.ClassesAndObjects;

public class Subclass extends Superclass{
    public Subclass(){
        super(); //Unnecessary (Constructor Inheritance Rule #3 (shown below))
        //super(200);
        System.out.println("Subclass constructor");
    }

    public void AaronLu(){
        super.SuperclassMethod();
    }

    public void Superclassmethod(){
        System.out.println("okkkkkayyyy");
        super.SuperclassMethod();
    }
    //Constructor Inheritance Rules
    //#1: super() is used to inherit constructors. super() must be called first.
    //super.method is used to inherit parts of a method
    //super.method does not need to be written first

    //#2: A subclass without a constructor makes an automatic call to a no parameter/
    //default constructor of the superclass

    //#3: If no explicit super(parameter) call is made, super() is automatically called from
    //any subclass constructor. If super(parameter) is explicitly called, super() will not be called.

    //#4: If no default constructor exists in the superclass AND a constructor with a parameter exists,
    //then an error will result. One of two things must be done:
    //a) Create a default constructor in the superclass (Unless your IDE already does that)
    //b) Make an explicit call to a different constructor in the superclass
}
