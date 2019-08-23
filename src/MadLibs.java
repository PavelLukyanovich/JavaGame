import java.util.Scanner;
public class MadLibs {

	public static void main(String[] args) {
		// Create object of scanner class
		Scanner scan = new Scanner(System.in);
		String a = "I will be ";
		String playAgane = "";
		// Start game
		do {
			String col = "";
			String prof = "";
			System.out.println("Enter your favorite color?");
			col = scan.next(); // Game ask user enter favorite color
			System.out.println("Enter your favorite profession?");
			prof = scan.next(); // Game ask user enter favorite profession
			System.out.println(a + " " + col + " " + prof); // Result String
			System.out.println("Would you like to play tagane (y/n)?");
			playAgane = scan.next();
		}while (playAgane.equalsIgnoreCase("y"));
		System.out.println("Thank you for good game! Bye bye!");
		scan.close();
	}
	
}
