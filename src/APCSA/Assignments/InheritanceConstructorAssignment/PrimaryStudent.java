package APCSA.Assignments.InheritanceConstructorAssignment;

public class PrimaryStudent extends JuniorStudent{
    public PrimaryStudent(){
        super();
        System.out.println("Primary Student");
        //super(); - Call to super must be first line in constructor, this would cause error
    }
    public PrimaryStudent(String name,int grade){
        super();
        System.out.println("Primary Student");
        //super(); - Call to super must be first line in constructor, this would cause error
    }
}
