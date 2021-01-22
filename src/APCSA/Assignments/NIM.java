package APCSA.Assignments;
import java.io.*;
import java.util.*;
public class NIM {
    public static void main(String[] args) throws IOException{
        int group;
        int amount;
        String loser = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Number of players: ");
        int players = Integer.parseInt(br.readLine());
        String[]names = new String[players];
        for(int i=0;i<players;i++){
            System.out.print("Player "+(i+1)+" name: ");
            names[i]=br.readLine();
        }
        int g1amount = (int)(Math.random()*7)+1;
        int g2amount = (int)(Math.random()*7)+1;
        int g3amount = (int)(Math.random()*7)+1;
        int g4amount = (int)(Math.random()*7)+1;
        int g5amount = (int)(Math.random()*7)+1;
        String[]Group1 = new String[g1amount];
        String[]Group2 = new String[g2amount];
        String[]Group3 = new String[g3amount];
        String[]Group4 = new String[g4amount];
        String[]Group5 = new String[g5amount];
        Arrays.fill(Group1,"o");Arrays.fill(Group2,"o");Arrays.fill(Group3,"o");
        Arrays.fill(Group4,"o");Arrays.fill(Group5,"o");

        while(true){
            for(int i=0;i<players;i++){
                System.out.println("Group 1:\n"+Arrays.toString(Group1));
                System.out.println("Group 2:\n"+Arrays.toString(Group2));
                System.out.println("Group 3:\n"+Arrays.toString(Group3));
                System.out.println("Group 4:\n"+Arrays.toString(Group4));
                System.out.println("Group 5:\n"+Arrays.toString(Group5));
                System.out.println();
                loser = names[i];
                //Input, validity check (Still errors if they input string)
                while(true) {
                    System.out.println(names[i] + "'s turn");
                    System.out.print("Group #(1-5): ");
                    group = Integer.parseInt(br.readLine());
                    if(group<1||group>5){
                        System.out.println("Please select a valid group number.");
                        continue;
                    } else if(group==1&&g1amount==0){
                        System.out.println("This group is empty. Please select a different one.");
                        continue;
                    } else if(group==2&&g2amount==0){
                        System.out.println("This group is empty. Please select a different one.");
                        continue;
                    } else if(group==3&&g3amount==0){
                        System.out.println("This group is empty. Please select a different one.");
                        continue;
                    } else if(group==4&&g4amount==0){
                        System.out.println("This group is empty. Please select a different one.");
                        continue;
                    } else if(group==5&&g5amount==0){
                        System.out.println("This group is empty. Please select a different one.");
                        continue;
                    }
                    System.out.print("Amount of \"o\"s to remove: ");
                    amount = Integer.parseInt(br.readLine());
                    if(amount<1){
                        System.out.println("Please select a positive integer.");
                    } else if(group==1&&g1amount<amount){
                        System.out.println("The number you entered is too high. It must be at most "+g1amount+".");
                    } else if(group==2&&g2amount<amount){
                        System.out.println("The number you entered is too high. It must be at most "+g2amount+".");
                    } else if(group==3&&g3amount<amount){
                        System.out.println("The number you entered is too high. It must be at most "+g3amount+".");
                    } else if(group==4&&g4amount<amount){
                        System.out.println("The number you entered is too high. It must be at most "+g4amount+".");
                    } else if(group==5&&g5amount<amount){
                        System.out.println("The number you entered is too high. It must be at most "+g5amount+".");
                    }
                    else{
                        break;
                    }
                }
                //Game
                switch(group){
                    case 1:
                        for(int j=Group1.length-1;j>=0;j--){
                            if(amount==0){
                                break;
                            }
                            if(Group1[j].equals("o")){
                                Group1[j]="";
                                g1amount--;
                                amount--;
                            }
                        }
                    case 2:
                        for(int j=Group2.length-1;j>=0;j--){
                            if(amount==0){
                                break;
                            }
                            if(Group2[j].equals("o")){
                                Group2[j]="";
                                g2amount--;
                                amount--;
                            }
                        }
                    case 3:
                        for(int j=Group3.length-1;j>=0;j--){
                            if(amount==0){
                                break;
                            }
                            if(Group3[j].equals("o")){
                                Group3[j]="";
                                g3amount--;
                                amount--;
                            }
                        }
                    case 4:
                        for(int j=Group4.length-1;j>=0;j--){
                            if(amount==0){
                                break;
                            }
                            if(Group4[j].equals("o")){
                                Group4[j]="";
                                g4amount--;
                                amount--;
                            }
                        }
                    case 5:
                        for(int j=Group5.length-1;j>=0;j--){
                            if(amount==0){
                                break;
                            }
                            if(Group5[j].equals("o")){
                                Group5[j]="";
                                g5amount--;
                                amount--;
                            }
                        }
                }
                if(g1amount==0&&g2amount==0&&g3amount==0&&g4amount==0&&g5amount==0){
                    break;
                }
            }
            if(g1amount==0&&g2amount==0&&g3amount==0&&g4amount==0&&g5amount==0){
                System.out.println(loser+" has removed the last of the \"o\"s, therefore they lose.");
                break;
            }
        }
    }
}
