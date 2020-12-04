package APCSA.Assignments.CasinoAssignment;

public class CasinoRunner {
    public static void main(String[] args) {
        RoulettePlayer player = new RoulettePlayer(70,"Ben");
        player.betAmount(5);
        player.Helper();
        RoulettePlayer.Odds();
        player.Play(25);
        System.out.println(player.getMoney());

        GuessingPlayer player2 = new GuessingPlayer(120,"Aaron");
        player2.betAmount(1000);
        player2.Helper();
        player2.Play(5);
        player2.betAmount(10);
        player2.Play(5);
        System.out.println(player2.getMoney());
    }
}
