import java.util.Scanner;
public class MadLibs {

	public static void main(String[] args) {
		// Create object of scanner class
		Scanner scan = new Scanner(System.in);
		String a = "I will be ";
		String playAgane = "";
		do {
			String col = "";
			String prof = "";
			System.out.println("Enter your favorit color?");
			col = scan.next();
			System.out.println("Enter your favorit profession?");
			prof = scan.next();
			System.out.println(a + " " + col + " " + prof);
			System.out.println("Would you like play agane (y/n)?");
			playAgane = scan.next();
		}while (playAgane.equalsIgnoreCase("y"));
		System.out.println("Thank you for good game! Bye bye!");
		scan.close();
	}
	
}
