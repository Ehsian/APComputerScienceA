package APCSA;

public class Strings {
    public static void main(String[] args) {
        //To declare a string
        String str= "Bruce";
        String str2 = new String("Bruce");

        //When testing for equality use .equals() and not ==
        if(str.equals(str2)){System.out.println("equal");}

        //Useful String Methods
        //concat - Joins two strings together
        String str3 = "Bill";
        String str4 = "Renee";
        System.out.println(str3.concat(str4));

        //length - Returns length of string
        String str5 = "Rose";
        System.out.println(str5.length());

        //equalsIgnoreCase(String)
        //toLowerCase()
        //toUpperCase()
        //replace(oldchar,newchar)

        //compareTo - Compares two strings and returns an int
        //Negative means it comes before (alphabetically)
        //Positive means it comes after (alphabetically)
        //Capital letters come before lowercase
        String str6 = "Edison";
        String str7 = "Arthur";
        int result = str6.compareTo(str7);
        System.out.println(result);

        //indexOf - Returns index/position of first occurrence of the letter or word you specify in a string
        //Note: indexes start from 0
        String str8 = "Michael";
        System.out.println(str8.indexOf("h")); //returns 3
        String str9 = "Justintintin";
        System.out.println(str9.indexOf("tin")); //returns 3
        //Returns -1 if not in the string
        String str10 = "Zoey";
        System.out.println(str10.indexOf("a")); //returns -1

        //substring - returns part of the string from start (inclusive) to end (exclusive)
        String str11 = "Arthur";
        System.out.println(str11.substring(2,4)); //returns "th"
        System.out.println(str11.substring(1)); //returns "rthur"
        //no error if you go one over the length because the last number is exclusive
        System.out.println(str11.substring(5,6)); //returns "r"
        //error if you go over the length
        //System.out.println(str11.substring(4,7)); - Returns an "IndexOutOfBoundsException"
        //Possible multiple choice question - Which of the following returns an "IndexOutOfBoundsException"?

        //Print out each letter one by one
        String str12 = "Jaden";
        for(int i=0;i<str12.length();i++){
            System.out.println(str12.substring(i,i+1));
            //or System.out.println(str12.charAt(i));
        }

        //Practice Exercise #1
        //Print out how many times a given letter appears in a string
        String str13 = "Derek";
        int count = 0;
        for(int i=0;i<str13.length();i++){
            if(str13.substring(i,i+1).equals("e")){
                count++;
            }
            //or if(Character.toString(str13.charAt(i)).equals("e")){count++;}
        }
        System.out.println(count);

        //Practice Exercise #2
        //Write the replace function

        String str14 = "bruceandcole";
        String letter = "e";
        String replacement = "x";
        String newstr14 = "";

        for(int i=0;i<str14.length();i++){
            if(str14.substring(i,i+1).equals(letter)){
                str14 = str14.substring(0,i)+replacement+str14.substring(i+1);
            }
            /* My Solution Below
            if(str14.substring(i,i+1).equals(letter)){
                newstr14+="x";
            }
            else{
                newstr14+=str14.substring(i,i+1);
            }
            */
        }
        System.out.println(str14);
        //System.out.println(newstr14);
    }
}
