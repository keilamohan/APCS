package labs;
// ****************************************************************
//   Guess.java
//
//   Play a game where the user guesses a number from 1 to 10
//          
// ****************************************************************
import java.util.Scanner;
import java.util.Random;

public class Guess
{
    public static void main(String[] args)
    {
    	int numToGuess;       //Number the user tries to guess
	    int guess;            //The user's guess
	    int count = 0;
	    int highCount = 0, lowCount = 0;

		Scanner scan = new Scanner(System.in);
		Random generator = new Random();
		// generator.nextInt(max-min+1)+min;
		// (int) (Math.random()*(max-min+1)) +min;
		numToGuess = generator.nextInt(10)+1;
		//randomly generate the  number to guess
		

		System.out.println("Guess what number I am thinking of"); //print message asking user to enter a guess
		guess = scan.nextInt();
		
		System.out.println("You guessed " + guess); //read in the guess
		
		
		while (guess != numToGuess)
	    {
			count++;
			if (guess > numToGuess)
			{
				System.out.println("lower!");
				System.out.println("Please guess again.");
				guess = scan.nextInt();
				System.out.println("You guessed " + guess);
				highCount++;
			}
			else if (guess < numToGuess)
			{
				System.out.println("higher!");
				System.out.println("Please guess again.");
				guess = scan.nextInt();
				System.out.println("You guessed " + guess);
				lowCount++;
			}
	    }
			System.out.println("Congrats! You guessed the number right after " + count +" number of tries!"
					+ "\nYou guessed too high " + highCount + " number of times, and too low " +lowCount + " number of times");


	}

}
