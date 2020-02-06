package labs2;
// ***************************************************************
//   StringManips.java
//
//   Test several methods for manipulating String objects
// ***************************************************************

import java.util.Scanner;

public class Lab2_2_1
{
    public static void main (String[] args)
    {
    
    Scanner scan = new Scanner (System.in);
	String phrase = new String ("This is a String test.");
	
	int middle3 = phrase.length()/2;
	System.out.println(phrase.substring(middle3-1,middle3+2));
	
	
	int phraseLength;   // number of characters in the phrase String
	int middleIndex;    // index of the middle character in the String
	String firstHalf;   // first half of the phrase String
	String secondHalf;  // second half of the phrase String
	String switchedPhrase; // a new phrase with original halves switched

	// compute the length and middle index of the phrase
	phraseLength = phrase.length();
	middleIndex = phraseLength / 2;

	// get the substring for each half of the phrase
	firstHalf = phrase.substring(0,middleIndex);
	secondHalf = phrase.substring(middleIndex, phraseLength);

	// concatenate the firstHalf at the end of the secondHalf
	switchedPhrase = secondHalf.concat(firstHalf);
	switchedPhrase = switchedPhrase.replaceAll(" ", "*");
	
	
	// print information about the phrase
	System.out.println();
	System.out.println ("Original phrase: " + phrase);
	System.out.println ("Length of the phrase: " + phraseLength +
			    " characters");
	System.out.println ("Index of the middle: " + middleIndex);
	System.out.println ("Character at the middle index: " + 
			    phrase.charAt(middleIndex));
	System.out.println ("Switched phrase: " + switchedPhrase);

	System.out.println();
	
	String city = new String ();
	String state = new String ();
	
	System.out.println("Enter in your hometown city.");
	city = scan.nextLine();
	System.out.println("Enter in your hometown state.");
	state = scan.nextLine();
	
	String citystate = state.toUpperCase() + city.toLowerCase() + state.toUpperCase();
	System.out.println(citystate);
	
	
	
    }
}