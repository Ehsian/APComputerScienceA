package APCSA.Assignments;
import java.util.Arrays;
public class SudokuSolver {
    public static final int[][] sudoku = {
            {0,0,1,6,3,8,0,0,2},
            {4,0,3,9,5,0,0,0,0},
            {0,0,0,4,7,0,3,1,9},
            {0,0,9,0,0,7,5,0,0},
            {0,0,4,0,0,5,0,0,8},
            {5,1,8,0,0,4,0,0,7},
            {8,0,0,0,2,0,0,7,4},
            {0,0,2,7,4,0,0,0,5},
            {0,4,7,0,8,9,0,6,0}
    };
    public static int[][] test = new int[9][9];
    public static void main(String[] args) {
        printArray(sudoku);
        copyArray(test);
        System.out.println();
        solve();
        printArray(test);
    }
    public static void printArray(int[][]array){ //I got lazy and didn't want to write these lines for testing
        for(int[]ary : array){
            System.out.println(Arrays.toString(ary));
        }
        System.out.println();
    }
    public static void copyArray(int[][]test){ //Same as above
        for(int i=0;i<sudoku.length;i++){
            for(int j=0;j<sudoku.length;j++){
                test[j][i]=sudoku[j][i];
            }
        }
    }
    public static boolean solve(){
        for(int row=0;row<9;row++){
            for(int column=0;column<9;column++){
                if(test[row][column]==0){
                    for(int i=1;i<=9;i++){
                        if(!inRow(i,row)&&!inColumn(i,column)&&!inBox(i,row,column)){
                            test[row][column]=i;
                            if(solve()){
                                return true;
                            }
                            else{
                                test[row][column] = 0;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean inRow(int num, int rownum){ //Checks if the number is already present in the row
        for(int column=0;column<9;column++){
            if(test[rownum][column]==num){
                return true;
            }
        }
        return false;
    }
    public static boolean inColumn(int num, int colnum){
        for(int row=0;row<9;row++){
            if(test[row][colnum]==num){
                return true;
            }
        }
        return false;
    }
    public static boolean inBox(int num,int rownum, int colnum){
        int row = rownum - rownum%3;
        int column = colnum - colnum%3;
        for(int i=row;i<row+3;i++){
            for(int j=column;j<column+3;j++){
                if(test[i][j]==num){
                    return true;
                }
            }
        }
        return false;
    }
}