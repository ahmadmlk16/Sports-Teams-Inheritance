package AhmadMalik;

public class Basketball extends Sport {
 private String FIBA;
    public Basketball(String name, int numPerTeam, int numPlayers, int worldRank, String FIBA) {
        super(name, numPerTeam, numPlayers, worldRank);
        this.FIBA = FIBA;
    }

    public String getFIBA() {
        return FIBA;
    }
}
