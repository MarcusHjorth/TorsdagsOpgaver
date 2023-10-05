import java.util.ArrayList;
import java.util.Scanner;

public class GameMenu{

	ArrayList<String> actions = new ArrayList();

	public GameMenu(ArrayList<String> actions) {
		this.actions = actions;
	}

	public void displayMenu(){
		System.out.println("GameMenu: ");
		for ( int i = 0 ; i < actions.size(); i++ ){
			System.out.println(( i ) + ". " + actions.get(i));
		}
	}

	public String getAction(){
		System.out.println("Type a number to choose an action");
		displayMenu();

		Scanner scanner = new Scanner(System.in);
		String choice = scanner.nextLine();

		return choice; 
	}
}