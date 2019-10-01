package AhmadMalik;

public class Football extends Sport {

   private String superBowl;

    public Football(String name, int numPerTeam, int numPlayers, int worldRank, String superBowl) {
        super(name, numPerTeam, numPlayers, worldRank);
        this.superBowl = superBowl;
    }

    public String getSuperBowl() {
        return superBowl;
    }
}
