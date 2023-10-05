import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main (String[] args){
		
		ArrayList<String> menuItems = new ArrayList<String>();
		menuItems.add("Start Game");
		menuItems.add("Resume Game");
		menuItems.add("Pause Game");
		menuItems.add("End Game");

		//System.out.println(menuItems);
		//System.out.print(menuItems.get(2));

		GameMenu gameMenu = new GameMenu(menuItems);
		gameMenu.displayMenu();
	

		String userChoice = gameMenu.getAction();

		int choice = Integer.parseInt(userChoice);
		doAction(choice);

	}

	public static void doAction(int action){
		switch(action){
			case 1: 
				System.out.println("Starting game now");
				break;
			case 2: 
				System.out.println("Resume");
				break;
			case 3: 
				System.out.println("Pausing game");
				break;
			case 4: 
				System.out.println("End game");
				break;
		}
	}
}
