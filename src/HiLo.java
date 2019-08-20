import java.util.Scanner;

public class HiLo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String playAgane = "";
		do {
			// Create the number for user to guess
			int theNumber = (int) (Math.random() * 100 + 1);
			System.out.println(theNumber);
			int guess = 0;
			int count = 0;
			while (theNumber != guess) {
				System.out.println("Guess a number between 1 - 100:");
				guess = scan.nextInt();
				count++; // Move counter
				if (guess < 1 || guess > 100) {
					System.out.println("Incorrect number");
				} else if (guess < theNumber) {
					System.out.println("More");
					System.out.println("Try agane?");
				} else if (guess > theNumber) {
					System.out.println("Less");
					System.out.println("No! Try agane?");
				} else {
					System.out.println("You WIN!");
					if (count/1 == 1 ) {
						System.out.println("You used " + count + " move");
					}else
					System.out.println("You used " + count + " moves");

				}
			} // End of loop "while"
			System.out.println("Would you like to play agane (y/n)?");
			playAgane = scan.next();
		} while (playAgane.equalsIgnoreCase("y")); // End of loop "do while96"
		System.out.println("Thank you for good game! Goodbye!");
		scan.close();
	}
}
