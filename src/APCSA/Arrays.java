package APCSA;

public class Arrays {
    public static void main(String[] args) {
        //An array is a data structure allowing you to hold multiple "variables" at one time

        //An array can contain only one data type
        //You must specify how many indexes when creating an array
        //You cannot modify the size of an array after it is created

        //Declaring an array of size 10:
        int[]myArray = new int[10];

        //To assign a value:
        myArray[0] = 3;
        myArray[3] = 5;

        //By default, an int array contains 0
        //String array contains null
        //To print:
        System.out.println(myArray[1]);

        //To initialize an array with values:
        int[]arr = {12,4,3,6,1,6,2174,123,-1235};

        //To traverse an array, use a for loop.
        //For each loop example:
        for(int number : arr){ //For each integer "number" in arr{Do stuff}
            System.out.println(number);
        }

        //--------------------------------------------------------------------

        //Exercises
        //#1: Swap the first and last elements in the array

        //This is wrong:
        //arr[0] = arr[arr.length-1];
        //arr[arr.length-1] = arr[0];

        int temp = arr[arr.length-1];
        arr[arr.length-1] = arr[0];
        arr[0] = temp;

        //#2: Find the min (or max) int in an array

        int smallest = arr[0];
        int smallestindex = 0;
        int index = 0;
        for(int number:arr){
            if(number<smallest){
                smallest = number;
                smallestindex = index;
            }
            index++;
        }
        System.out.println(smallest);
        System.out.println(smallestindex);

        //My method:
        /*import java.util.Arrays;
        Arrays.sort(arr);
        System.out.println(arr[0]);
         */

        //#3: Find the average of the ints in the array
        double num = 0;
        for(int number : arr){
            num+=number;
        }
        num/=arr.length;
        System.out.println(num);

        //#4: Search the array for a specific number. Print how many times the number appears
        //If it doesn't appear, print "not in array"

        int[]array = {1,2,1,4,1,5,1,7,2,8};

        int search = 1;
        int counter = 0;
        for(int number : array){
            if(number==search){
                counter++;
            }
        }
        if(counter>0){
            System.out.println(counter);
        }
        else{
            System.out.println("not in array");
        }

        //#5: Every time a number is bigger than the number before, print it and the index number out
        int[]arry = {1,10,9,8,2,3,7,6};
        for(int i=0;i<arry.length-1;i++){
            if(arry[i+1]>arry[i]){
                System.out.println(arry[i+1]+" is the number, "+(i+1)+" is the index");
            }
        }
    }
}
