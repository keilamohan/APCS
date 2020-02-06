package labs2;

import java.util.Random;

public class Lab2_2_2 {
	public static void main (String[]args)
	{
		int die1;
		int die2;
		int total;
		
		die1 = (int)(Math.random()*6)+1;
		die2 = (int)(Math.random()*6)+1;
		total = die1 + die2;
		
		System.out.println("The first die rolls a " + die1);
		System.out.println("The second die rolls a " + die2);
		System.out.println("The total roll is " + total);
		
		}
		
		
	}

