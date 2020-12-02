package APCSA.Assignments.InheritanceAssignment;

public class FootballStatistics extends SportsStatistics {
    public int pointsScored(){
        return getMajor()*7+getMinor()*3;
    }
    public double pointsPerGame(){
        return (double)pointsScored()/getGamesPlayed();
    }
}
