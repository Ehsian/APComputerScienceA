package APCSA;

import java.util.Arrays;

public class TwoDimensionalArrays {
    public static void main(String[] args) {
        //A 2-D array is a grid
        //We reference row first, column second
        int[][]arr = new int[10][10];
        int[][]map = {{6,7,12,42,900},{2,5,2,3,90},{5,2,8,22,430}};
        //Referencing 2nd row, 3rd column:
        System.out.println(map[1][2]);

        //To traverse a 2D array, use a nested for loop
        for(int i=0;i<map.length;i++){
            for(int j=0;j<map[i].length;j++){
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }

        //--------------------------------------------------------------------------
        //Find the smallest/biggest int in the array
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<map.length;i++){
            for(int j=0;j<map[i].length;j++){
                if(map[i][j]<smallest){
                    smallest = map[i][j];
                }
            }
        }
        System.out.println("The smallest number in the 2D array is: "+smallest);

        //Exercises:
        //1) Print out the sum of each column
        //Row major order means traversing the array by rows
        //Column major order means traversing the array by columns
        int sum=0;
        for(int i=0;i<map[0].length;i++){
            for(int j=0;j<map.length;j++){
                sum+=map[j][i];
            }
            System.out.println("Sum of column #"+i+" is: "+sum);
            sum=0;
        }

        //2)
        //Given an integer, replace the value with the one below
        //If it is the last row, replace with first row
        int given = 430;
        for(int i=0;i<map.length;i++){
            for(int j=0;j<map[i].length;j++){
                if(given==map[i][j]&&i!=map.length-1){
                    System.out.println(map[i][j]);
                    System.out.println(map[i+1][j]);
                    map[i][j]=map[i+1][j];
                }
                else if(given==map[i][j]&&i==map.length-1){
                    map[i][j]=map[0][j];
                }
            }
        }
        System.out.println("New Array:");
        for(int i=0;i<map.length;i++){
            System.out.println(Arrays.toString(map[i]));
        }
    }
}
