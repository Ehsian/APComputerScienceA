package APCSA.Assignments;
import java.util.Arrays;
public class SudokuSolver {
    public static final int[][] sudoku = { //This sudoku can be replaced by any traditional 9x9 sudoku board
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
        System.out.println("Original: ");
        printArray(sudoku);
        copyArray(test);
        System.out.println();
        System.out.println("Filled: ");
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
                if(test[row][column]==0){ //Checks for empty value in the board
                    for(int i=1;i<=9;i++){ //This for loop and its contents checks which numbers can possibly be in that empty value.
                        if(!inRow(i,row)&&!inColumn(i,column)&&!inBox(i,row,column)){
                            test[row][column]=i;
                            if(solve()){ //If the number "i" is correct, it can run to the very end, which allows this to return true.
                                return true;
                            }
                            else{ //Otherwise, solve() would return false, meaning that the current "i" won't work, so we can continue the for loop.
                                test[row][column] = 0;
                            }
                        }
                    }
                    return false; //This is here for the recursion above (line 45). It will return false if "i" doesn't work.
                }
            }
        }
        return true; //This will only return true once the entire board has been filled in, i.e. solved.
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
        int row = rownum - rownum%3; //This line determines the first row index of the box that the number is in. (Boxes: 012,345,678 <- First ones = 0,3,6)
        int column = colnum - colnum%3; //Continued from above - E.g. 8th element -> 8-8%3 = 8-2 = 6 -> index 6 is starting point
        for(int i=row;i<row+3;i++){ //Straightforward scan of box to compare values
            for(int j=column;j<column+3;j++){
                if(test[i][j]==num){
                    return true;
                }
            }
        }
        return false;
    }
}