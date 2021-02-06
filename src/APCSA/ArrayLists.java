package APCSA;
import java.util.*; //Imports everything from java.util (unnecessary)
import java.util.ArrayList; //Required
public class ArrayLists {
    public static void main(String[] args) {
        //An Arraylist can only contain objects, not primitive data
        //An Arraylist is dynamic
        //You do not need to declare the size beforehand
        //It grows or shrinks as needed

        //To declare an Arraylist, you must specify the object
        ArrayList<String> list = new ArrayList<>();

        //To add items, use add
        list.add("Hi");
        list.add("Ice cream");
        list.add("snake");

        //To traverse the list, use get and size
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        //An enhanced for loop or for each loop allows you to traverse the array
        for(String str : list){
            System.out.println(str);
        }

        //Methods for removing all instances of item from list
        //This type of question is common on the AP exam

        //Method 1: Traverse arraylist from end
        for(int i=list.size()-1;i>=0;i--){
            if(list.get(i).equals("snake")){
                list.remove(i);
            }
        }

        //Method 2: Only move forwards if the search does not match
        int j = 0;
        while(j<list.size()){
            if(list.get(j).equals("snake")){
                list.remove(j);
            }
            else{
                j++;
            }
        }

        //-----------------------------------------------------------------

        //A common way to declare an ArrayList is using the List interface
        List<String>whateverList = new ArrayList<>();

        //You cannot use primitive data in an ArrayList
        //ArrayList<int> intList = new ArrayList<>(); <- Does not work

        //ArrayLists can only hold objects, hence the use of Wrapper classes
        ArrayList<Integer>intList = new ArrayList<>();
        Integer num1 = 32;
        Integer num2 = 23;
        Integer num3 = 1;
        intList.add(num1);
        intList.add(num2);
        intList.add(num3);

        for(int i : intList){
            System.out.print(i + " ");
        }
        System.out.println();

        //------------------------------------------------------------------

        //ArrayList Assignment - Practice #1
        ArrayList<String>animals = new ArrayList<>();
        animals.add("cat");
        animals.add("dog");
        animals.add("bird");
        animals.add("mouse");
        animals.add("elephant");
        for(String s : animals){
            System.out.print(s + " ");
        }
        animals.add(animals.indexOf("dog")+1,"fish");
        animals.set(animals.indexOf("mouse"),"pig");
        animals.remove(animals.indexOf("dog"));
        System.out.println(animals.size());
        for(String s : animals){
            System.out.print(s + " ");
        }
    }
}
