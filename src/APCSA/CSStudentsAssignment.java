package APCSA;

public class CSStudentsAssignment {
    public String firstName;
    public boolean playsGames;
    public double mark;
    public CSStudentsAssignment(){
        System.out.println("No Name Entered");
    }
    public CSStudentsAssignment(String name,boolean gamer,double initialMark){
        firstName = name;
        playsGames = gamer;
        mark = initialMark;
    }
    public double getMark(){
        return mark;
    }
    public boolean getPlays(){
        return playsGames;
    }
    public void setMark(double newMark){
        mark = newMark;
    }
    public void badStudent(){
        if(this.getPlays()==true){
            System.out.println("Bad student");
        } else{
            System.out.println("This is a student.");
        }
    }
    public boolean forgiveStudent(){
        if(this.getMark()>=99&&this.getPlays()==true){
            System.out.println("Let student play.");
            return true;
        } else{
            System.out.println("Yell at student");
            return false;
        }
    }
    public String randomFail(int studentNumber){
        if(studentNumber%2==0){
            return "No Fail";
        } else{
            return "Fail";
        }
    }
    public void passStudent(){
        if(this.getMark()<50){
            this.setMark(50);
        }
    }
    public String toString(){
        return firstName;
    }
}
