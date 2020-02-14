package labs;
// ****************************************************************
// SquareTest.java
//
// Uses the Square class to read in square data and tell if 
// each square is magic.
//          
// ****************************************************************

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class SquareTest
{
    public static void main(String[] args) throws IOException
    {
    Scanner scan = new Scanner(new File("magicData"));

	int count = 1;                 //count which square we're on
	int size = scan.nextInt();     //size of next square

	//Expecting -1 at bottom of input file
	while (size != -1)
	    {

		//create a new Square of the given size
			Square a = new Square(size);
		//call its read method to read the values of the square
			a.readSquare(scan);
			System.out.println("\n******** Square " + count + " ********");
		//print the square
			a.printSquare();
		//print the sums of its rows
			int rowTotal = 0;
			for (int i = 0; i < size; i++)
			{
				rowTotal += a.sumRow(i);
			}
			System.out.println(rowTotal);
		//print the sums of its columns
			int colTotal = 0;
			for (int i= 0; i < size; i++)
			{
				colTotal += a.sumCol(i);
			}
			System.out.println(colTotal);
		//print the sum of the main diagonal
			System.out.println(a.sumMainDiag());
		//print the sum of the other diagonal
			System.out.println(a.sumOtherDiag());
		//determine and print whether it is a magic square
			System.out.println(a.magic());
		//get size of next square
			size = scan.nextInt();



			count++;
	    }

   }
}