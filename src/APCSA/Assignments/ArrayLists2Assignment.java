package APCSA.Assignments;
import java.util.*;
public class ArrayLists2Assignment {
    public static void main(String[] args) {
        //Part 1
        String[]q1temp = {"Ben","Aaron","Bill","Rose","Jaden","Cole","Bruce","Justin","Zoey","Lu"};
        ArrayList<String>names = new ArrayList<>(Arrays.asList(q1temp));
        //1)
        int number = 0;
        for(String name : names){
            if(name.length()>=4&&name.length()<=7){
                number++;
            }
        }
        System.out.println("Number of 4-7 letter names: "+number);

        //2)
        String longest = "";
        for(String name : names){
            if(name.length()>longest.length()){
                longest = name;
            }
        }
        System.out.println("Longest name: "+longest);

        //3)
        String shortest = names.get(0);
        for(String name : names){
            if(name.length()<shortest.length()){
                shortest = name;
            }
        }
        names.remove(shortest);
        names.add(shortest);
        //4)
        number = 0;
        ArrayList<String>temp = new ArrayList<>();
        for(String name : names){
            if(name.length()>=6){
                temp.add(name);
                number++;
            }
        }
        for(String name : temp){
            names.remove(name);
        }
        System.out.println("Number of removed names: "+number);
        System.out.print("New ArrayList: ");
        for(String name : names){
            System.out.print(name + " ");
        }
        System.out.println();

        //5)
        String givenletter = "B";
        ArrayList<String>newarraylist = new ArrayList<>();
        for(String name : names){
            if(name.substring(0,1).equalsIgnoreCase(givenletter)){
                newarraylist.add(name);
            }
        }
        System.out.print("Names that start with "+givenletter+": ");
        for(String name : newarraylist){
            System.out.print(name + " ");
        }
        System.out.println();

        //Part 2
        Integer[]q2temp = {4,1,13,77,11,47,5,6,2,404,7,101,20,8};
        ArrayList<Integer>list = new ArrayList<>(Arrays.asList(q2temp));

        //1)
        int given = 4;
        int remainder = list.size()%given;
        for(int i=list.size()-1-remainder;i>=0;i-=given){
            list.remove(i);
        }
        System.out.println("ArrayList with every nth number removed:");
        for(Integer num : list){
            System.out.print(num + " ");
        }
        System.out.println();

        //2)
        for(int i=0;i<list.size()-1;i+=2){
            list.add(i+1,-1);
        }
        System.out.println("ArrayList with \"-1\" added between every number:");
        for(int num : list){
            System.out.print(num + " ");
        }
        System.out.println();

        //3)
        ArrayList<Integer>q3 = new ArrayList<>();
        for(int i=list.size()-1;i>=0;i--){
            q3.add(list.get(i));
        }
        System.out.print("Flipped ArrayList: ");
        for(int num : q3){
            System.out.print(num + " ");
        }
        System.out.println();
        for(int i=0;i<list.size()/2;i++){
            int endnum = list.get(list.size()-1-i);
            list.set(list.size()-1-i,list.get(i));
            list.set(i,endnum);
        }
        System.out.println("Flipped ArrayList (without creating new ArrayList): ");
        for(int num : list){
            System.out.print(num + " ");
        }
        System.out.println();

        //4)
        ArrayList<Integer>q4 = new ArrayList<>();
        for(int num : list){
            q4.add(num);
        }
        for(int i=q4.size()-1;i>=0;i--){
            for(int j=i-1;j>=0;j--){
                if(q4.get(i)==q4.get(j)){
                    q4.remove(i);
                }
            }
        }
        System.out.println("ArrayList w/o duplicates (traverse backwards): ");
        for(int num : q4){
            System.out.print(num + " ");
        }
        System.out.println();

        int i = 0;
        loop:while(i<list.size()){
            for(int j=list.size()-1;j>i;j--){
                if(list.get(i)==list.get(j)){
                    list.remove(j);
                    continue loop;
                }
            }
            i++;
        }
        System.out.println("ArrayList w/o duplicates (traverse forwards): ");
        for(int num : list){
            System.out.print(num + " ");
        }
        System.out.println();

        //5)
        Integer[]q5temp1 = {1,2,3,4,5,6};
        Integer[]q5temp2 = {10,9,8,7,6,5,4};
        ArrayList<Integer>q5a = new ArrayList<>(Arrays.asList(q5temp1));
        ArrayList<Integer>q5b = new ArrayList<>(Arrays.asList(q5temp2));
        System.out.print("Integers that are the same in both lists: ");
        for(int num1 : q5a){
            for(int num2 : q5b){
                if(num1==num2){
                    System.out.print(num1+" ");
                }
            }
        }
        System.out.println();
    }
}
