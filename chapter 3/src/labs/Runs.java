package labs;
// ********************************************************************
// Runs.java
//
// Finds the length of the longest run of heads in 100 flips of a coin.
// ********************************************************************

public class Runs
{
    public static void main (String[] args)
    {
	final int FLIPS = 100; // number of coin flips

	int currentRun = 0; // length of the current run of HEADS
	int maxRun = 0;     // length of the maximum run so far

	Coin myCoin = new Coin (); // Create a coin object

	// Flip the coin FLIPS times
	for (int i = 0; i < FLIPS; i++)
	    {
		myCoin.flip();
		System.out.println(myCoin.toString());
		// System.out.println(myCoin);
		// Flip the coin & print the result

		if (myCoin.isHeads())
		{
			currentRun++;
		}
		else
		{
			currentRun = 0;
		}
		
		if (currentRun > maxRun)
		{
			maxRun = currentRun;
		}

	    }
	System.out.println("The maximum run is " + maxRun);

	// Print the results

    }
}