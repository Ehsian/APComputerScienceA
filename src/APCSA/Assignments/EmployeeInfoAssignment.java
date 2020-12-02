package APCSA.Assignments;

public class EmployeeInfoAssignment {
    String name;
    int number;
    double wageRate = 15.0;
    double yearsWorking = 0;
    public EmployeeInfoAssignment(){
        System.out.println("Casual Employee, no name or number needed");
    }
    public EmployeeInfoAssignment(String Name,int Number){
        name = Name;
        number = Number;
    }
    public void setWageRate(int num){
        wageRate = num;
    }
    public double getWageRate(){
        return wageRate;
    }
    public boolean isSeniorEmployee(){
        return yearsWorking>10;
    }
    public double giveRaise(double raise){
        wageRate+=raise;
        return wageRate;
    }
    public double giveRaise(double raise,double yearsWorking){
        if(yearsWorking>25){raise*=2;}
        wageRate +=raise;
        return wageRate;
    }
    public String toString(){
        if(name == null){
            return "No name.";
        }
        return name;
    }
}
