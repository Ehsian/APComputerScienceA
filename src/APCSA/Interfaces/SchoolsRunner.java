package APCSA.Interfaces;

public class SchoolsRunner {
    public static void main(String[] args) {
        Schools WPGA = new Schools(400);
        Schools Saints = new Schools(1000);
        Schools Crofton = new Schools(700);
        WPGA.compareTo(Saints);
        System.out.println(Crofton.compareTo(WPGA));
    }
}
