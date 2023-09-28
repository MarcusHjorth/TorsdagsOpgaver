import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please type your name");


		String name = scanner.nextLine();

		System.out.println("Hello " + name + ", Please type your age");

		int age = scanner.nextInt();

		int retirementAge = 67;
		if (age >= retirementAge) {
			System.out.println("You should already be retired!");
		} else {
			System.out.println("You got " + (retirementAge - age) + " years left till retirement");
		}
	}
}
