public class CricketTeamMake {
    public static void main(String cricket[]) {
        CricketTeam cricketTeam = new CricketTeam();

        cricketTeam.addPlayerNames("Virat Kohli");
        cricketTeam.addPlayerNames("Rohit Sharma");
        cricketTeam.addPlayerNames("Ms Dhoni");
        cricketTeam.addPlayerNames("Pandya brothers");
        cricketTeam.addPlayerNames("Ashwin");
        cricketTeam.addPlayerNames("Jadeja");
        cricketTeam.addPlayerNames("Kishan");
        cricketTeam.addPlayerNames("Tendulkar");
        cricketTeam.addPlayerNames("Kishan"); 
        cricketTeam.addPlayerNames("Bhuvaneshwar");
        cricketTeam.addPlayerNames("Raina");

        cricketTeam.getPlayerName();

        cricketTeam.addPlayerNames("Sanjay");

        String aatagara = cricketTeam.searchForPlayer("Raina");
        System.out.println("Player you selected: " + aatagara);

        cricketTeam.deleteByPlayerName("Ashwin");
    }
}
