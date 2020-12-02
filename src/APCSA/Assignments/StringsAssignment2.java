package APCSA.Assignments;
import java.util.Scanner;

public class StringsAssignment2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //1) Write a program to print a word backwards twice.
        String str1 = scan.next();
        String ans1 = "";
        for(int i=str1.length();i>0;i--){
            ans1+=str1.substring(i-1,i);
        }
        System.out.println(ans1+ans1);

        //2) Write a program to count how many vowels are in a word. (Do not consider "y")
        String str2 = scan.next();
        int ans2 = 0;
        for(int i=0;i<str2.length();i++){
            if(str2.substring(i,i+1).equals("a")||str2.substring(i,i+1).equals("e")||str2.substring(i,i+1).equals("i")
            ||str2.substring(i,i+1).equals("o")||str2.substring(i,i+1).equals("u")){
                ans2+=1;
            }
        }
        System.out.println(ans2);

        //3) Write a program to combine two words by alternating after every second letter.
        String str3_1 = scan.next();
        String str3_2 = scan.next();
        String longerstr;
        if(str3_1.length()-str3_2.length()>=0){
            longerstr = str3_1;
        }
        else{
            longerstr = str3_2;
        }
        for(int i=0;i<longerstr.length();i+=2){
            try{
                System.out.print(str3_1.substring(i,i+2));
            }
            catch(Exception e){
                if(i<str3_1.length()){System.out.print(str3_1.substring(i));}
            }
            try{
                System.out.print(str3_2.substring(i,i+2));
            }
            catch(Exception e){
                if(i<str3_2.length()){System.out.print(str3_2.substring(i));}
            }
        }
        System.out.println();
        //Definitely not the intended solution but hey it works

        //4) Write a program to search and replace a given letter in a string. If the letter does not appear,
        //print "does not appear".
        String str4 = scan.next();
        String search = scan.next();
        String repl = scan.next();
        if(search.equals(repl)){
            System.out.println("You aren't changing anything...");
        }
        if(str4.replace(search, repl).equals(str4)){
            System.out.println("Does not appear");
        }
        else{
            System.out.println(str4.replace(search,repl));
        }

        //5) Write a program to determine how many letters are printed before and after the word "computer"
        //in a given string. You may assume "computer" only appears once in the string.
        String str5 = scan.next();
        System.out.print("before "+(str5.substring(0,str5.indexOf("computer")+8).length()-8)+", ");
        System.out.println("after "+(str5.substring(str5.indexOf("computer")).length()-8));
    }
}
