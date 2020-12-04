package APCSA.Assignments.InheritanceConstructorAssignment;

public class InheritanceConstructorRunner {
    public static void main(String[] args) {
        PotentialWPGAStudent Aaron = new PotentialWPGAStudent();
        //2) Prints "WPGA Student" because of inheritance rule #3 -
        //super() will be automatically called from the subclass.

        PrimaryStudent Rose = new PrimaryStudent(); //"No constructor" printed
        PrimaryStudent Bill = new PrimaryStudent("Bill",1); //"No constructor" printed
        //"No constructor" is printed because super() does not have any parameters, therefore it only
        //calls the default constructor in the superclass. In order to give parameters to the superclass,
        //I should change super(); to super(name,grade);
    }
}
