package APCSA;

public class Boolean {
    public static void main(String[] args) {
        //A boolean data type has only two values: true and false

        boolean aaronlu = false;
        System.out.println(aaronlu);

        //Boolean operators:
        //&& (And) - Both statements must be true
        //|| (Or) - Only one statement needs to be true
        //! (Not) - Makes boolean false

        int age = 16;
        int grade = 12;

        if(age == 16 && grade == 12){
            System.out.println("Big brain time");
        }

        //Exercise
        //You want to give an award to anyone who is under 13 years old and in grade 6 or 7
        grade = 6;
        if(age <= 13 && (grade ==6 || grade ==7)){
            System.out.println("You won an award");
        }

        //Exercise
        //You win a scholarship if you are in grade 12 and your GPA is 86% or higher
        //and you have not been absent for more than 5 days
        grade = 12;
        double GPA;
        double absences;
        GPA = 0.90;
        absences = 4;
        if(grade == 12&&GPA>=0.86&&absences<=5){
            System.out.println("You won a scholarship!");
        }

        //Exercise
        //You have to see Ms.Jones if your absences are greater than 10 or your grade is less than 70%
        //and you are in grade 10, 11, or 12.
        GPA = 0.5;
        if((absences>10||GPA<0.7)&&(grade == 10||grade ==11||grade==12)){
            System.out.println("What the ki!");
        }

        //Exercise
        //If you are not in grade 12 and your GPA is between 75% and 85%, go get tutoring in the lobby
        if(grade!=12&&(GPA >=0.75 && GPA <=0.85)){
            System.out.println("Bad at school go learn");
        }

        //Short circuit
        //If the first part of a statement evaluates the entire statement,
        //then the next part is not evaluated.

        //if (true||false) --> if the first part is true, the second part will never be executed

        //De Morgan's Laws
        //!(a&&b) is equivalent to !a || !b
        //!(a||b) is equivalent to !a && !b
    }
}
