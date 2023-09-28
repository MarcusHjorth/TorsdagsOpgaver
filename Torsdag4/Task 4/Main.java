import java.util.ArrayList;

public class Main {
	public static void main (String[] args){
		
		ArrayList<String> actions = new ArrayList();
		actions.add("Start Game");
		actions.add("Resume Game");
		actions.add("Pause Game");
		actions.add("End Game");

		System.out.println(actions);
		System.out.print(actions.get(2));
	}
}
