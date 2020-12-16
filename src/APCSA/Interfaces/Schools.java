package APCSA.Interfaces;

public class Schools implements Comparable{
    private int numStudents;

    public Schools(int num){
        numStudents = num;
    }

    public int getNumStudents(){
        return numStudents;
    }

    public int compareTo(Object obj){
        Schools other = (Schools)obj;
        return this.getNumStudents() - other.getNumStudents();
    }
}
