package APCSA.Assignments;
import java.util.Arrays;
public class IntroTo2DArraysAssignment {
    public static void main(String[] args) {
        int[][]arr = {{6,7,12,42,900},{2,5,2,3,90},{5,2,8,22,430}};

        //1)
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]<smallest){
                    smallest = arr[i][j];
                }
            }
        }
        System.out.println("The smallest number in the array is: "+smallest);

        //2)
        if(arr.length!=arr[0].length){
            System.out.println("The 2D array is a Rectangle.");
        }
        else{
            System.out.println("The 2D array is a Square.");
        }

        //3)
        int given = 3;
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i][given-1];
        }
        System.out.println("The sum of column #"+given+" is: "+sum);

        //4)
        int largestsum = Integer.MIN_VALUE;
        int largestrow = 1;
        for(int i=0;i<arr.length;i++){
            int rowsum = 0;
            for(int j=0;j<arr[i].length;j++){
                rowsum+=arr[i][j];
            }
            if(rowsum>largestsum){
                largestsum = rowsum;
                largestrow = i+1;
            }
        }
        System.out.println("The row with the largest sum is row #"+largestrow+" at a total sum of: "+largestsum);

        //5)
        int given1 = 2;
        int given2 = 3;
        int numofgiven1 = 0;
        int numofgiven2 = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(given1==arr[i][j]){
                    numofgiven1++;
                }
                else if(given2==arr[i][j]){
                    numofgiven2++;
                }
            }
        }
        if(numofgiven1>numofgiven1){
            System.out.println(given1+" appears more often than "+given2+".");
        }
        else if(numofgiven1<numofgiven1){
            System.out.println(given2+" appears more often than "+given1+".");
        }
        else{
            System.out.println(given1+" has the same amount of appearances as "+given2+".");
        }
        System.out.println("Number of appearances of "+given1+": "+numofgiven1);
        System.out.println("Number of appearances of "+given2+": "+numofgiven2);

        //6)
        int[][]q6 = {{6,7,12,42,900},{2,5,2,3,90},{5,2,8,22,430}};
        given = 430;
        for(int i=0;i<q6.length;i++){
            for(int j=0;j<q6[i].length;j++){
                if(given==q6[i][j]&&i!=q6.length-1){
                    System.out.println(q6[i][j]);
                    System.out.println(q6[i+1][j]);
                    q6[i][j]=q6[i+1][j];
                }
                else if(given==q6[i][j]&&i==q6.length-1){
                    q6[i][j]=q6[0][j];
                }
            }
        }
        System.out.println("Original Array:");
        for(int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("New Array:");
        for(int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(q6[i]));
        }

        //7)
        boolean flag = true;
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr[i].length;j++){
                if(arr[i][j]<arr[i][j-1]){
                    flag = false;
                    break;
                }
                else if(j+1==arr[i].length&&i+1!=arr.length&&arr[i][j]>arr[i+1][0]){
                    flag = false;
                    break;
                }
            }
        }
        System.out.println("In order: "+flag);

        //8)
        int[][]q8 = {{6,7,12,42,900},{2,5,2,3,90},{5,2,8,22,430}};
        for(int i=0;i<q8.length;i++){
            for(int j=q8[i].length-1;j>=0;j--){
                if(arr[i][j]%2==0&&j+1==arr[i].length){
                    q8[i][j]=arr[i][0];
                }
                else if(arr[i][j]%2==0){
                    q8[i][j]=arr[i][j+1];
                }
            }
        }
        System.out.println("Original Array:");
        for(int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("New Array:");
        for(int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(q8[i]));
        }

        //9)
        flag = false;
        loop:
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                int num = arr[i][j];
                for(int k=i;k<arr.length;k++){
                    for(int l=j+1;l<arr[k].length;l++){
                        if(num==arr[k][l]){
                            flag = true;
                            break loop;
                        }
                    }
                }
            }
        }
        System.out.println("Has duplicates: "+flag);

        //10)
        int num = 0;
        String[][]q10 = {{"Hello","Mr","Lu"},{"Give","Me","High"},{"Mark","Please","Thanks"}};
        for(int i=0;i<q10.length;i++){
            for(int j=0;j<q10[i].length;j++){
                if(q10[i][j].length()<=3){
                    q10[i][j]=null;
                    num++;
                }
            }
        }
        System.out.println("Number of words with 3 letters or less: "+num);

        //11)
        String[][]q11 = {{"Ben","Aaron","Aaron","Bill","Rose","Mr","Arthur","Michael","Zoey","Jaden"},
                {"Jia","Butt","Lu","Wang","Liu","Lu","Chen","Yin","Lee","Law"}};
        search(q11,"Lu");
    }
    public static void search(String[][]array,String lastname){
        boolean check = false;
        for(int i=0;i<array[0].length;i++){
            if(lastname.equals(array[1][i])){
                check = true;
                System.out.println(array[0][i]+" "+array[1][i]);
            }
        }
        if(check == false){
            System.out.println("Not Found");
        }
    }
}
