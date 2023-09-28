public class Task1{
	public static void main(String args[]){
		Team team1 = new Team("American Bulls", 9, "Chad");
		Team team2 = new Team("UK Roadmens", 2, "Henry the third");
		Team team3 = new Team("Danish vikings", 1, "Bjørn the destroyer");
		Team team4 = new Team("Swedish nerds", 5, "Olaf");
		Team team5 = new Team("Bing bong", 4, "Fernando");

		//System.out.println(team1);
		//System.out.println(team2);

		team1.setRank(18);
		System.out.println(team1);
		System.out.println(team2);
		System.out.println(team3);
		System.out.println(team4);
		System.out.println(team5);
	}
}