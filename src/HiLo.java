import java.util.Scanner;
public class HiLo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Create the number for user to guess  
		int theNumber = (int)(Math.random()*100 + 1);
		System.out.println(theNumber);
		int guess = 0;
		System.out.println("Guess a number between 1 - 100:");
		guess = scan.nextInt();
		while(theNumber != guess) {
			System.out.println("No! Try agane?");
			continue;
		}
		if (theNumber == guess) {
			System.out.println("You WIN!");
		}

	}

}
