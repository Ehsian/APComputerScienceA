package APCSA.Assignments.ArrayLists1Assignment;
import java.util.ArrayList;
import java.util.Arrays;
public class CookieOrderRunner {
    public static void main(String[] args) {
        GradCookieOrder chocochip = new GradCookieOrder("Chocolate Chip",38);
        GradCookieOrder doublechocochip = new GradCookieOrder("Double Chocolate Chip",32);
        GradCookieOrder oatraisin = new GradCookieOrder("Oatmeal Raisin",0);
        GradCookieOrder mint = new GradCookieOrder("Mint Chocolate Chip",10);
        GradCookieOrder ginger = new GradCookieOrder("Gingerbread",28);
        GradCookieOrder[]temp = {chocochip,doublechocochip,oatraisin,mint,ginger};
        ArrayList<GradCookieOrder>CookieOrders = new ArrayList<>(Arrays.asList(temp));
        String mostorders = "";
        int num = 0;
        for(GradCookieOrder order : CookieOrders){
            if(order.getOrders()>num){
                mostorders = order.getName();
                num = order.getOrders();
            }
        }
        System.out.println(mostorders+": "+num);
        num = 7;
        for(int i=0;i<CookieOrders.size();i++){
            if(CookieOrders.get(i).getOrders()<num){
                CookieOrders.remove(i);
            }
        }
        System.out.println("Size: "+CookieOrders.size());
        for(GradCookieOrder order : CookieOrders){
            System.out.println(order.getName());
        }
    }
}
