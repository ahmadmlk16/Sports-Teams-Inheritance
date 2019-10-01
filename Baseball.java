package AhmadMalik;

public class Baseball extends Sport {
    private String worldSeries;
    public Baseball(String name, int numPerTeam, int numPlayers, int worldRank, String worldSeries) {
        super(name, numPerTeam, numPlayers, worldRank);
        this.worldSeries = worldSeries;
    }

    public String getWorldSeries() {
        return worldSeries;
    }
}

