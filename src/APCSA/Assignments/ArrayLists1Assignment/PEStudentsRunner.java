package APCSA.Assignments.ArrayLists1Assignment;
import java.util.ArrayList;
import java.util.Arrays;
public class PEStudentsRunner {
    public static void main(String[] args) {
        PEStudents Ben = new PEStudents("Ben",2);
        PEStudents Aaron = new PEStudents("Aaron",5);
        PEStudents Bill = new PEStudents("Bill",10);
        PEStudents Rose = new PEStudents("Rose",7);
        PEStudents Cole = new PEStudents("Cole",90);
        PEStudents[]temp = {Ben,Aaron,Bill,Rose,Cole};
        ArrayList<PEStudents>PEStudentsList = new ArrayList<>(Arrays.asList(temp));
        int average = 0;
        for(PEStudents student : PEStudentsList){
            average+=student.getBenchPress();
        }
        System.out.println(average/=PEStudentsList.size());
        String search = "Ben";
        boolean flag = true;
        for(PEStudents student : PEStudentsList){
            if(student.getName().equals("Ben")){
                System.out.println(student.getName()+": "+student.getBenchPress());
                flag = false;
            }
        }
        if(flag){
            System.out.println("not found");
        }
        average = 0;
        for(PEStudents student : PEStudentsList){
            student.BenchPress+=5;
            average+=student.getBenchPress();
        }
        System.out.println(average/=PEStudentsList.size());
    }
}
