// 10/03/2011

import java.util.Random;
import java.util.Scanner;

public class RandomGame {
	public static void main(String[] args) {
		Random generator = new Random();
		Scanner scan = new Scanner(System.in);
		
		// Get a random number between 1 and 20
		int value = generator.nextInt(20) + 1;
	
		
		
		// Repeatedly ask user for values
		int guess = 0;
		int counter = 0;
		
		do {
			// Ask user for guess
			
			System.out.print("Pick a number between 1 and 20: ");
			guess = scan.nextInt();

			// Determine if it's too high, too low, or correct
			
			if (guess < value)
				System.out.println("Too low");
		
			else if (guess > value) 
				System.out.println("Too high");
			
			else 
				System.out.println("Correct!");
			
			// Add one to the number of guesses
			counter = counter + 1;
			// counter = counter++ 		Exactly the same as: counter = counter + 1;
			
		} while (guess != value);
			
		
		// Print number of guesses
		System.out.println("You took "+counter+" guesses.");
		
		
		
	}
}