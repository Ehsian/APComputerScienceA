package APCSA.Assignments.InheritanceAssignment;
class SportsStatistics {
    private int major;
    private int minor;
    private int gamesPlayed;
    public SportsStatistics(){

    }
    public SportsStatistics(int initialmajor, int initialminor){
        major = initialmajor;
        minor = initialminor;
    }

    public int getMajor() {
        return major;
    }

    public int getMinor() {
        return minor;
    }
    public int pointsScored(){
        return major+minor;
    }
    public int getGamesPlayed(){
        return gamesPlayed;
    }
}