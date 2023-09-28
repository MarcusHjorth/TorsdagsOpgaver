public class Team{
	private String teamName;
	private int teamRank;
	private String playerNames;



	public Team(String teamName, int teamRank, String playerNames){
		this.teamName = teamName;
		this.teamRank = teamRank;
		this.playerNames = playerNames;
	}
		
	public void setRank(int teamRank){
		this.teamRank = teamRank;
	}

	public String toString(){
		return "Hold: " + teamName + " Rank: " + teamRank + " Spiller: " + playerNames;
	}
}