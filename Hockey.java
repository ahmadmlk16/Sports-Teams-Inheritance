package AhmadMalik;

public class Hockey extends Sport {
    private String FIH;
    public Hockey(String name, int numPerTeam, int numPlayers, int worldRank, String FIH) {
        super(name, numPerTeam, numPlayers, worldRank);
        this.FIH = FIH;
    }

    public String getFIH() {
        return FIH;
    }
}
