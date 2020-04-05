import java.util.Scanner;

/**
 * A simple class to run the Magpie class.
 * @author Laurie White
 * @version April 2012
 */
public class MagpieRunner2
{

	/**
	 * Create a Magpie, give it user input, and print its replies.
	 */
	public static void main(String[] args)
	{
		Magpie2 maggie = new Magpie2();
		
		System.out.println (maggie.getGreeting());
		final Scanner in = new Scanner (System.in);

		String statement = in.nextLine();
		final String statementTrim = statement.trim();
		final int statementLength = statementTrim.length();
		
		if (statementLength >=1)
		{
			while (!statement.equals("Bye"))
			{
				System.out.println (maggie.getResponse(statement));
				statement = in.nextLine();
			}
		}
		else if (statementLength ==0)
		{
			System.out.println("Say something, please.");
			
		
		}
	}

}
