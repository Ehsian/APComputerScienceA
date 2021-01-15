package APCSA.Assignments;
import java.util.Arrays;
public class ArraysAssignment {
    public static void main(String[] args) {
        int[]array = {5,6,9,10,4,30,6,15,18,20,22,6,1,1,2,5,19};
        //1)
        int[]array1 = {5,6,9,10,4,30,6,15,18,20,22,6,1,1,2,5}; //Assume given array is even
        int largest = 0;
        int largestindex = 0;
        for(int i=0;i<array1.length;i+=2){
            if(array1[i]+array1[i+1]>largest){
                largest = array1[i]+array1[i+1];
                largestindex = i;
            }
        }
        System.out.println("Sum: "+largest);
        System.out.println("Indexes: "+largestindex+", "+(largestindex+1));

        //2)
        int q2 = 38; //Can be replaced with any positive integer
        int sum = 0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
            if(sum>=q2){
                System.out.println("Element number: "+i);
                System.out.println("Sum: "+sum);
                break;
            }
        }

        //3)
        int ans3 = 0;
        for(int i=1;i<array.length-1;i++){
            if(Math.abs(array[i]-array[i-1])<=5&&Math.abs(array[i]-array[i+1])<=5){
                ans3++;
            }
        }
        System.out.println(ans3);

        //4)
        String ans4 = "";
        int mostoccurences = 0;
        for(int i=0;i<array.length;i++){
            int occurences = 0;
            for(int j=i+1;j<array.length;j++){
                if(array[i]==array[j]){
                    occurences++;
                }
            }
            if(occurences>mostoccurences){
                ans4 = ""+array[i];
                mostoccurences = occurences;
            }
            else if(occurences==mostoccurences){
                ans4+=" "+array[i];
            }
        }
        System.out.println("Integer(s): "+ans4);
        System.out.println("Appearances: "+mostoccurences);

        //5)
        System.out.println(percentEven(array));

        //6)
        System.out.println(minGap(array));

        //7)
        int[]q7a = {1,2,3,4,5};
        int[]q7b = {123,234,345,456,567};
        swapAll(q7a,q7b);
        System.out.println(Arrays.toString(q7a));
        System.out.println(Arrays.toString(q7b));

        //8)
        int[]q7 = {18,7,4,24,11};
        System.out.println(Arrays.toString(stretch(q7)));
    }
    //5)
    public static double percentEven(int[] array){
        int even = 0;
        for(int number:array){
            if(number%2==0){
                even++;
            }
        }
        return (double)even/array.length;
    }

    //6)
    public static int minGap(int[] array){
        int mingap = Integer.MAX_VALUE;
        if(array.length<2){
            return 0;
        }
        for(int i=0;i<array.length-1;i++){
            if(Math.abs(array[i+1]-array[i])<mingap){
                mingap = Math.abs(array[i+1]-array[i]);
            }
        }
        return mingap;
    }

    //7)
    public static void swapAll(int[]array1, int[]array2){
        int[]temp = new int[array1.length];
        for(int i=0;i<array1.length;i++){
            temp[i] = array1[i];
        }
        for(int i=0;i<array1.length;i++){
            array1[i] = array2[i];
        }
        for(int i=0;i<array1.length;i++){
            array2[i] = temp[i];
        }
    }

    //8)
    public static int[] stretch(int[]array){
        int[]newarray = new int[array.length*2];
        int index = 0;
        for(int i=0;i<newarray.length;i+=2){
            newarray[i+1]=array[index]/2;
            newarray[i]=array[index]-array[index]/2;
            index++;
        }
        return newarray;
    }
}
