package AhmadMalik;

public class Main {

    public static void main(String[] args) {
        Sport s1, s2, s3, s4;
        s1 = new Football("Football", 11, 22,12, "New England Patriots");
        s2 = new Hockey("Field Hockey",6, 12, 3, "Australia");
        s3 = new Basketball("Basketball", 5, 10, 7, "United States");
        s4 = new Baseball("Baseball", 9, 18, 8, "Boston Red Sox");

        System.out.println("SPORTS AND THEIR CHARACTERISTICS:");
        System.out.println("");
        System.out.println("NAME: "+s1.getName());
        System.out.println("PLAYERS PER TEAM: "+s1.getNumPerTeam());
        System.out.println("TOTAL PLAYERS: "+s1.getNumPlayers());
        System.out.println("WORLD POPULARITY RANK: "+s1.getWorldRank());
        System.out.println("WORLD CHAMPIONS: "+((Football) s1).getSuperBowl());
        System.out.println("");
        System.out.println("NAME: "+s2.getName());
        System.out.println("PLAYERS PER TEAM: "+s2.getNumPerTeam());
        System.out.println("TOTAL PLAYERS: "+s2.getNumPlayers());
        System.out.println("WORLD POPULARITY RANK: "+s2.getWorldRank());
        System.out.println("WORLD CHAMPIONS: "+((Hockey) s2).getFIH());
        System.out.println("");
        System.out.println("NAME: "+s3.getName());
        System.out.println("PLAYERS PER TEAM: "+s3.getNumPerTeam());
        System.out.println("TOTAL PLAYERS: "+s3.getNumPlayers());
        System.out.println("WORLD POPULARITY RANK: "+s3.getWorldRank());
        System.out.println("WORLD CHAMPIONS: "+((Basketball) s3).getFIBA());
        System.out.println("");
        System.out.println("NAME: "+s4.getName());
        System.out.println("PLAYERS PER TEAM: "+s4.getNumPerTeam());
        System.out.println("TOTAL PLAYERS: "+s4.getNumPlayers());
        System.out.println("WORLD POPULARITY RANK: "+s4.getWorldRank());
        System.out.println("WORLD CHAMPIONS: "+((Baseball) s4).getWorldSeries());


}
}