package APCSA.Assignments;
import java.util.Arrays;
public class TwoDimensionalArrays {
    public static void main(String[] args) {
        //1)
        int[][]magicsquare = {{16,3,2,13},{5,10,11,8},{9,6,7,12},{4,15,14,1}};
        System.out.println(isMagic(magicsquare));

        //2)
        String[]key = {"D","B","D","C","C","D","A","E","A","D"};
        String[][]answers = new String[10][8];
        for(int j=0;j<8;j++){
            for(int i=0;i<10;i++){
                if((int)(Math.random()*5)==0){
                    answers[i][j]="A";
                } else if((int)(Math.random()*5)==1){
                    answers[i][j]="B";
                } else if((int)(Math.random()*5)==2){
                    answers[i][j]="C";
                } else if((int)(Math.random()*5)==3){
                    answers[i][j]="D";
                } else{
                    answers[i][j]="E";
                }
            }
        }
        for(int j=0;j<8;j++){
            int num = 0;
            for(int i=0;i<10;i++){
                if(answers[i][j].equals(key[i])){
                    num++;
                }
            }
            System.out.println("Student "+j+": "+num+" correct answers");
        }

        //3)
        int[][]q3 = new int[5][5];
        int num = 1;
        for(int j=0;j<5;j++){
            for(int i=0;i<5;i++){
                q3[i][j]=num;
                num++;
            }
        }
        int q3num = q3.length;
        int q3x = -1;
        int q3y = 0;
        while(true){
            for(int j=0;j<q3num;j++){
                q3x++;
                System.out.print(q3[q3x][q3y]+" ");
            }
            q3num--;
            if(q3num==0){
                break;
            }
            for(int j=0;j<q3num;j++){
                q3y++;
                System.out.print(q3[q3x][q3y]+" ");
            }
            for(int j=0;j<q3num;j++){
                q3x--;
                System.out.print(q3[q3x][q3y]+" ");
            }
            q3num--;
            if(q3num==0){
                break;
            }
            for(int j=0;j<q3num;j++){
                q3y--;
                System.out.print(q3[q3x][q3y]+" ");
            }
        }
        System.out.println();

        //4)
        double closest = Integer.MAX_VALUE;
        double[][]coords = {{-1,3},{-1,-1},{1,1},{2,0.5},{2,-1},{3,3},{4,2},{4,-0.5}};
        double[] point1 = coords[0];
        double[] point2 = coords[1];
        for(int i=0;i<coords.length;i++){
            for(int j=i+1;j<coords.length;j++){
                double xdistance = Math.abs(coords[i][0]-coords[j][0]);
                double ydistance = Math.abs(coords[i][1]-coords[j][1]);
                double distance = Math.sqrt(Math.pow(xdistance,2)+Math.pow(ydistance,2));
                if(distance<closest){
                    closest = distance;
                    point1 = coords[i];
                    point2 = coords[j];
                }
            }
        }
        System.out.println("The 2 closest points are "+Arrays.toString(point1)+" and "+ Arrays.toString(point2)+".");
        System.out.println("The distance between the points was "+closest);

        //5)
        int[][]q5 = new int[4][5];
        num = 1;
        for(int j=0;j<q5.length;j++){
            for(int i=0;i<q5[0].length;i++){
                q5[j][i]=num;
                num++;
            }
        }
        int[][]q5new = new int[q5[0].length][q5.length];
        for(int j=0;j<q5[0].length;j++){
            for(int i=0;i<q5.length;i++){
                q5new[j][i]=q5[i][j];
            }
        }
        System.out.println("Before: ");
        for(int[]row : q5){
            for(int number : row){
                System.out.print(number+" ");
            }
            System.out.println();
        }
        System.out.println("After: ");
        for(int[]row : q5new){
            for(int number : row){
                System.out.print(number+" ");
            }
            System.out.println();
        }

        //6)
        int[][]q6 = {{10,12,7,3,12},{3,10,6,2,8},{18,24,17,6,10},{15,21,10,8,12},{1,18,22,4,15}};
        System.out.print("Numbers:");
        for(int i=0;i<q6.length;i++){
            int largestj = q6[i][0];
            int largestji = 0;
            boolean check = true;
            for(int j=0;j<q6[0].length;j++){
                if(q6[i][j]>largestj){
                    largestj = q6[i][j];
                    largestji = j;
                }
            }
            for(int k=0;k<q6.length;k++){
                if(q6[k][largestji]<largestj){
                    check = false;
                    break;
                }
            }
            if(check==true){
                System.out.print(" "+largestj);
            }
        }
        for(int i=0;i<q6.length;i++){
            int smallestj = q6[i][0];
            int smallestji = 0;
            boolean check = true;
            for(int j=0;j<q6[0].length;j++){
                if(q6[i][j]<smallestj){
                    smallestj = q6[i][j];
                    smallestji = j;
                }
            }
            for(int k=0;k<q6.length;k++){
                if(q6[k][smallestji]>smallestj){
                    check = false;
                    break;
                }
            }
            if(check==true){
                System.out.print(" "+smallestj);
            }
        }

        //7)
        int[][]q7 = {{1,2,3,4},{6,7,8,9},{11,12,13,14},{16,17,18,19}};
        int column = 0;
        for(int i=0;i<q7.length*2;i++){
            if(i-q7.length>0){
                column = i-q7.length;
            }
            int elementcount = Math.min(Math.min(i,q7.length),q7.length-column);
            for(int j=0;j<elementcount;j++){
                System.out.print(q7[Math.min(q7.length,i)-j-1][column+j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean isMagic(int[][]array){
        int num = 0;
        for(int i=0;i<4;i++){
            num+=array[0][i];
        }
        for(int i=0;i<4;i++){
            int temp1 = 0;
            int temp2 = 0;
            int temp3 = 0;
            int temp4 = 0;
            for(int j=0;j<4;j++){
                temp4 = 0;
                temp1+=array[j][i];
                temp2+=array[i][j];
                temp3+=array[j][j];
                for(int k=3;k>=0;k--){
                    temp4+=array[j][k];
                }
            }
            if(temp1!=num||temp2!=num||temp3!=num||temp4!=num){
                return false;
            }
        }
        return true;
    }
}
