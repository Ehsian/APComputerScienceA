package APCSA.Assignments.InheritanceConstructorAssignment;

public class CompSciStudent extends SeniorStudent {

    //Error results because there is no default/no parameter constructor in the SeniorStudent class.
    //This is demonstrated through Inheritance Rule #4:
    //If no default constructor exists in the superclass AND a constructor with a parameter exists,
    //then an error will result. One of two things must be done:
    //a) Create a default constructor in the superclass (Unless your IDE already does that)
    //b) Make an explicit call to a different constructor in the superclass

    //b)
    public CompSciStudent(String name){
        super(name);
    }
}
