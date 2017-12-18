
public class NFLPlayerDriver {

	public static void main(String[] args) {
		// Declare player2 object with arguments
		NFLPlayer player1 = new NFLPlayer("Myles", "Garrett", "Texas A&M", "DE", 76, 272, "12/19/1995", 22, 4.64, 41.0);
		NFLPlayer player2 = new NFLPlayer("Mitchell", "Trubisky", "North Carolina", "QB", 74, 222, "8/20/1994", 23,
				4.25, 27.5);
		NFLPlayer player3 = new NFLPlayer("Solomon", "Thomas", "Standard", "DE", 75, 273, "8/26/1995", 22, 4.69, 35.0);
		NFLPlayer player4 = new NFLPlayer("Leonard", "Fournette", "LSU", "RB", 72, 240, "1/18/1995", 22, 4.51, 28.5);
		NFLPlayer player5 = new NFLPlayer("Corey", "Davis", "Western Michigan", "WR", 75, 209, "1/11/1995", 22, 4.38,
				36.2);
		NFLPlayer player6 = new NFLPlayer("Jamal", "Adams", "LSU", "S", 72, 214, "10/17/95", 22, 4.56, 31.5);

		NFLPlayerManager playerDraft = new NFLPlayerManager();

		playerDraft.addnflPlayer(player1.toString());
		playerDraft.addnflPlayer(player2.toString());
		playerDraft.addnflPlayer(player3.toString());
		playerDraft.addnflPlayer(player4.toString());
		playerDraft.addnflPlayer(player5.toString());
		playerDraft.addnflPlayer(player6.toString());

		System.out.println("Number of players in draft: " + playerDraft.getNumberOfnflPlayers());
		String[] playersArray = playerDraft.getnflPlayers();
		int x = 1;
		for (int i = 0; i < playerDraft.getNumberOfnflPlayers(); i++) {
			System.out.println(x++ + " - " + playersArray[i] + ", ");
		} // End of For Loop

	} // End of Main method
} // End of NFLPlayerDriver
