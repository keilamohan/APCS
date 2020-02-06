package labs1;
// *******************************************************************
//   PlusTest.java
// 
//   Demonstrate the different behaviors of the + operator
// *******************************************************************

public class Lab2_3
{
    // -------------------------------------------------
    // main prints some expressions using the + operator
    // -------------------------------------------------
    public static void main (String[] args)
    {
	System.out.println ("This is a long string that is the " +
			        "concatenation of two shorter strings.");

	System.out.println ("The first computer was invented about " + 55 +
			        " years ago.");
// Add spaces in the sentence
	System.out.println ("8 plus 5 is " + 8 + 5);

	System.out.println ("8 plus 5 is " + (8 + 5));

	System.out.println (8 + 5 + " equals 8 plus 5.");

// The computer printed "8 plus 5 is 85", "8 plus 5 is 13", "13 equals 8 plus 5".
// These three statements show the different ways to use + in Java. The first and
// last statement show how it can be used arithmetically, and the second statement
// shows how it can be used for string concatenation.
	
	System.out.println ("-----------------------------");

		int Robins = 10;
		int Cannaries = 13;
		System.out.println("Ten Robins plus " + Cannaries + " cannaries is " + (Robins + Cannaries) + " birds");

    }
}