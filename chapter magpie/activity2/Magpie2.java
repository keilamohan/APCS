/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
		if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		else if (statement.indexOf("dog")>= 0 || statement.indexOf("cat") >=0)
		{
			response = "Tell me more about your pets.";
		}
		else if (statement.indexOf("Mr.")>= 0)
		{
			response = "He sounds like a good teacher.";
		}
		else if (statement.indexOf("Mrs.") >=0 
		|| statement.indexOf("Ms.") >= 0
		|| statement.indexOf("Miss.")>= 0)
		{
			response = "She sounds like a good teacher.";
		}
		else if (statement.indexOf("high school")>=0  || statement.indexOf("elementary school")>=0
				|| statement.indexOf("preschool") >=0)
		{
			response = "Tell me more about this school.";

		}
		// keywords added: high school, preschool, elementary school
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}
		else if (whichRespose ==4)
		{
			response = "Cool.";
		}
		else if (whichResponse == 5)
		{
			response = "I want to hear more!";
		}

		return response;
	}
}
// QUESTION: problems with words that contain keywords is that the response will not make sense because
// the word is not actually a keywork, like the word "know" contains the word "no", but the response for
// "no" is "why so negative", which would not make sense if someone said "I know all the state
// capitals"
