package APCSA;
import java.util.Scanner;

public class StringsAssignment {
    public static void main(String[] args) {
        //1)
        String q1 = "Computer";
        System.out.println(q1.length());

        //2)
        String q2str1 = "hello";
        String q2str2 = "world";
        System.out.println(q2str1.concat(q2str2));

        //3)
        String q3 = "hello";
        System.out.println(q3.toUpperCase());
        System.out.println(q3.substring(0,1).toUpperCase()+q3.substring(1));

        //4)
        String q4str1 = "ki";
        String q4str2 = "rebill";
        if(q4str1.equals(q4str2)){System.out.println("The two strings are equal");}
        else if(q4str1.compareTo(q4str2)%-1==0){System.out.println(q4str1+" comes first alphabetically");}
        else{System.out.println(q4str2+" comes first alphabetically");}

        //5)
        String str = "HelloWorld";
        System.out.println(str.substring(0,5));
        //6)
        System.out.println(str.substring(3,7));
        //7)
        System.out.println(str.substring(5));

        //8)
        String q8 = "abcdefgh";
        if(q8.indexOf("cde")>=0){
            System.out.println("\"cde\" is inside the string \"abcdefgh\".");
        }

        //9)
        String q9 = "aaabbbaaacccaaa";
        int count = 0;
        while(q9.indexOf("aaa")!=-1){
            q9 = q9.substring(q9.indexOf("aaa")+3);
            count++;
        }
        System.out.println("\"aaa\" appears "+count+" times.");

        //10)
        Scanner scan = new Scanner(System.in);
        System.out.print("Letter: ");
        String letter = scan.next();
        System.out.print("Word: ");
        String word = scan.next();
        count = 0;
        while(word.indexOf(letter)!=-1){
            word = word.substring(word.indexOf(letter)+1);
            count++;
        }
        System.out.println(letter+" appears "+count+" times.");

        //11)
        System.out.print("Letter: ");
        String letter2 = scan.next();
        System.out.print("Word: ");
        String word2 = scan.next();
        for(int i=0;i<word2.length();i++){
            if(word2.substring(i,i+1).equals(letter2)){
                word2 = word2.substring(0,i)+word2.substring(i+1);
            }
        }
        System.out.println(word2);
    }
}
