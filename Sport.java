package AhmadMalik;

public class Sport {
    private String name;
    private int numPerTeam;
    private int numPlayers;
    private int worldRank;

    public Sport(String name, int numPerTeam, int numPlayers, int worldRank) {
        this.name = name;
        this.numPerTeam = numPerTeam;
        this.numPlayers = numPlayers;
        this.worldRank = worldRank;
    }

    public String getName() {
        return name;
    }

    public int getNumPerTeam() {
        return numPerTeam;
    }

    public int getNumPlayers() {
        return numPlayers;
    }

    public int getWorldRank() {
        return worldRank;
    }
}
