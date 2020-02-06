package labs;
// ***************************************************************
//   Salary.java
//   Computes the raise and new salary for an employee
// ***************************************************************
import java.util.Scanner;
import java.text.NumberFormat;

public class Salary
{
   public static void main (String[] args)
   {
      double currentSalary;  // current annual salary
      String rating;         // performance rating
      double raise;          // dollar amount of the raise
      double newSalary;

	   Scanner scan = new Scanner(System.in);

      // Get the current salary and performance rating
      System.out.print ("Enter the current salary: ");
      currentSalary = scan.nextDouble();
      System.out.print ("Enter the performance rating: ");
      rating = scan.next();

      // Compute the raise -- Use if ... else ...
      	if (rating.equals("Excellent"))
      	{
      		raise = currentSalary * 0.06;
      	}
      	else if (rating.equals("Good"))
      	{
      		raise = currentSalary * 0.04;
      	}
      	else
      	{
      		raise = currentSalary * 0.015;
      	}
      	
      	newSalary = currentSalary + raise;
      	NumberFormat money = NumberFormat.getCurrencyInstance();

      // Print the results
      System.out.println ();
      
      System.out.println ("Amount of your raise: " + money.format(raise));
      System.out.println ("Your new salary: " + money.format(newSalary));
   }
}