package labs;
// ****************************************************************
// Sales.java
//
// Reads in and stores sales for each of 5 salespeople.  Displays
// sales entered by salesperson id and total sales for all salespeople.
//
// ****************************************************************
import java.util.Scanner;
import java.util.Arrays;

public class Sales
{
    public static void main(String[] args)
    {
	Scanner scan = new Scanner(System.in);


	System.out.println("Enter in an amount of sales people: ");
	int salespeople = scan.nextInt();
	
	int[] sales = new int[salespeople];
	int sum;
	int maxSale = 0;
	int maxId = 0;

	int minSale = 1000000;
	int minId = 0;

	for (int i=0; i<sales.length; i++)
	    {

			System.out.print("Enter sales for salesperson " + i+1 + ": ");
			sales[i] = scan.nextInt();
			if (sales[i] > maxSale)
			{
				maxSale = sales[i];
				maxId = i+1;
			}
			if (sales[i] < minSale)
			{
				minSale = sales[i];
				minId = i+1;
			}
	    }

	System.out.println("\nSalesperson   Sales");
	System.out.println("--------------------");
	sum = 0;
	for (int i=0; i<sales.length; i++)
	    {
			System.out.println("     " + i + "         " + sales[i]);
			sum += sales[i];
	    }

	
	int average = sum/SALESPEOPLE;


	System.out.println("\nTotal sales: " + sum);
	
	System.out.println("Average sales: " + average);

	System.out.println("Salesperson " + maxId + "had the highest sale with " + maxSale);
	
	System.out.println("Salesperson " + minId + "had the lowest sale with " + minSale);
	
	System.out.println("Please print a value: ");
	int val = scan.nextInt();


	int exceed[];
	int exceedId;
	for (int i =0; i< sales.length; i++)
	{
		if (sales[i] > val)
		{
			exceed[i] = sales[i];
		}

	}


	for (int i= 0; i < exceed.length; i++)
	{
		System.out.println("Salesperson " + i+1 + " exceeded the value entered with a sale of " + exceed[i]);
	}
    System.out.println("The total number of people who exceeded the value entered is " + exceed.length);
}
