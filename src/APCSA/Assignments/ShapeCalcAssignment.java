package APCSA.Assignments;

public class ShapeCalcAssignment {
    public static int numTimesUsed;
    public ShapeCalcAssignment(){
        numTimesUsed++;
    }
    public ShapeCalcAssignment(String shapeName){
        numTimesUsed++;
    }
    public static void circleInfo(double radius){
        System.out.println("Circumference: "+3.14159*2*radius+" or "+2*radius+"π");
        System.out.println("Area: "+3.14159*Math.pow(radius,2)+" or "+Math.pow(radius,2)+"π");
    }
    public static void rectangleInfo(double length,double width){
        System.out.println("Perimeter: "+(2*length+2*width));
        System.out.println("Area: "+length*width);
    }
    public static void cylinderInfo(double radius,double height){
        //homework sheet says there needs to be a width parameter but cylinder calculations don't need width I believe...
        System.out.println("Surface Area: "+(2*3.14159*radius*height+2*3.14159*Math.pow(radius,2)));
        System.out.println("Volume: "+3.14159*Math.pow(radius,2)*height);
    }
    public static int getNumTimesUsed(){
        return numTimesUsed;
    }
    //Why was it useful to make getNumTimesUsed static? Explain.
    //It is useful because if it is static, I won't have to first create an object in order to use the method.
    //If it wasn't static, getNumTimesUsed would always be greater than 0 because I have to declare at least one object
    //first in order to use getNumTimesUsed. Also, making it static just makes it more convenient in general.
}
