package APCSA.Assignments;
import java.util.Arrays;
public class IntroToArraysAssignment {
    public static void main(String[] args) {
        int[]array = new int[20];
        for(int i=0;i<array.length;i++){
            array[i] = (int)(Math.random()*10);
            System.out.print(array[i]+" ");
        }
        System.out.println();
        //1)
        int sum = 0;
        for(int number : array){
            sum+=number;
        }
        System.out.println("Sum: "+sum);
        //2)
        System.out.println("Average: "+(double)sum/array.length);
        //3)
        for(int i=array.length-1;i>=0;i--){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        //4)
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        int[]temp = new int[20];
        for(int i=0;i<array.length;i++){
            temp[i] = array[i];
        }
        temp[0] = array[19];
        temp[19] = array[0];
        for(int number : temp){
            System.out.print(number+" ");
        }
        System.out.println();
        //5)
        int smallest = array[0];
        for(int number:array){
            if(number<smallest){
                smallest = number;
            }
        }
        System.out.println("Smallest number is: "+smallest);
        //Easier way below
        Arrays.sort(temp);
        System.out.println("Smallest number is: "+temp[0]);
        //6)
        sum = 0;
        int[]q6 = new int[20];
        for(int i=0;i<array.length;i++){
            if(i%2==1){
                q6[i] = -array[i];
            }
            else{
                q6[i] = array[i];
            }
            sum+=q6[i];
            System.out.print(q6[i]+" ");
        }
        System.out.println();
        System.out.println("Sum: "+sum);
        //7)
        int num = 0;
        for(int number : array){
            if(number%2==1){
                num++;
            }
        }
        System.out.println("Odd Number Appearances: "+num);
        //8)
        sum = 0;
        for(int number:array){
            if(number<10){
                sum+=number*2;
            }
            else{
                sum+=number;
            }
        }
        System.out.println("Sum: "+sum);
        //9)
        int search = 1;
        int counter = 0;
        for(int number : array){
            if(number==search){
                counter++;
            }
        }
        if(counter>0){
            System.out.println("Number of appearances of the number \"1\": "+counter);
        }
        else{
            System.out.println("not in array");
        }
        //10)
        int sum1 = 0;
        int sum2 = 0;
        for(int i=0;i<20;i++){
            if(i<10){
                sum1+=array[i];
            }
            else{
                sum2+=array[i];
            }
        }
        System.out.println("Sum of first 10 numbers: "+sum1);
        System.out.println("Sum of last 10 numbers: "+sum2);
        if(sum1>sum2){
            System.out.println("The first 10 numbers added together is greater.");
        }
        else if(sum2>sum1){
            System.out.println("The last 10 numbers added together is greater.");
        }
        else{
            System.out.println("The sums of the first 10 and last 10 are the same.");
        }
        //11)
        search = 5;
        int nums1 = 0;
        int nums2 = 0;
        for(int i=0;i<20;i++){
            if(i<10&&array[i]<=search){
                nums1++;
            }
            else if(i>=10&&array[i]<=search){
                nums2++;
            }
        }
        System.out.println("First 10 elements: "+nums1);
        System.out.println("Last 10 elements: "+nums2);
        //12)
        for(int i=0;i<array.length-1;i++){
            if(array[i+1]>array[i]){
                System.out.println(array[i+1]+" is the number, "+(i+1)+" is the index");
            }
        }
        //13)
        search = 8;
        for(int i=0;i<20;i++){
            for(int j=i+1;j<20;j++){
                if(array[i]+array[j]==search){
                    System.out.println(array[i]+" "+array[j]);
                }
            }
        }
        //14)
        int[]q14 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        q14[(int)(Math.random()*20)] = 0;
        for(int i=0;i<20;i++){
            if(q14[i]==0){
                System.out.println("Missing number: "+i);
            }
        }
        //15)
        int[]q15 = {-1,-2,-3,-4,-5,-6,-7,-8,-9,-10,1,2,3,4,5,6,7,8,9,10};
        int[]negative = new int[10];
        int[]positive = new int[10];
        int thisisacrappysolution = 0;
        for(int number:q15){
            if(number<0){
                for(int i=0;i<10;i++){
                    if(negative[i]==0){
                        negative[i]=number;
                        break;
                    }
                }
            }
            else{
                for(int i=0;i<10;i++){
                    if(positive[i]==0){
                        positive[i]=number;
                        break;
                    }
                }
            }
        }
        for(int i=0;i<10;i++){
            q15[thisisacrappysolution]=positive[i];
            q15[thisisacrappysolution+1]=negative[i];
            thisisacrappysolution+=2;
        }
        for(int number:q15){
            System.out.print(number+" ");
        }
        System.out.println();
        //16)
        int[]ary = {1,7,3,6,2,8,9,3};
        for(int i=0;i<ary.length;i++){
            for(int j=i+1;j<ary.length;j++){
                if(ary[i]==ary[j]){
                    System.out.println(ary[i]+" is the duplicate.");
                }
            }
        }
        //17)
        //Technically, this is a question that can easily be done using a Set.
        //(Sets are like arrays except they do not allow duplicates.)

        //Afternote: This isn't the cleanest but the intention was to remove duplicates without
        //sorting first.
        int[]q17 = {1,1,3,3,5,1,7,2,8,5,9};
        Integer[]q17temp = new Integer[q17.length];
        boolean hasnumber;
        int countnulls = 0;
        for(int i=0;i<q17.length;i++){
            hasnumber = false;
            for(Integer number:q17temp){
                if(number==null){
                    continue;
                }
                if(number==q17[i]){
                    hasnumber = true;
                    break;
                }
            }
            if(hasnumber==false){
                for(int j=0;j<q17.length;j++){
                    if(q17temp[j]==null){
                        q17temp[j]=q17[i];
                        break;
                    }
                }
            }
        }
        for(Integer number:q17temp){
            if(number==null){
                countnulls++;
            }
        }
        int[]q17ans = new int[q17.length-countnulls];
        for(int i=0;i<q17ans.length;i++){
            q17ans[i]=q17temp[i];
        }
        for(int number:q17ans){
            System.out.print(number+" ");
        }
        System.out.println();

        //18)
        int[]q18 = {1,7,2,9,9,4,5,5,32,32,7,1,3,2,3};
        int check = 0;
        for(int i:q18){
            check=0;
            for(int j:q18){
                if(i==j){
                    check++;
                }
            }
            if(check==1){
                System.out.println("The non-duplicate number is: "+i);
                break;
            }
        }
    }
}
