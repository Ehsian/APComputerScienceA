package APCSA.Assignments.InheritanceAssignment;

public class HockeyStatistics extends SportsStatistics{
    public int pointsScored(){
        return getMajor() + getMinor();
    }
    public double pointsPerGame(){
        return (double)pointsScored()/getGamesPlayed();
    }
}
