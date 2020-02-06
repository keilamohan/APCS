package labs;
import java.util.Scanner;

public class LazyDays
{
   public static void main (String[] args)
   {
	   Scanner scan = new Scanner (System.in);
	   int temp;
	   String activity = new String();
	   System.out.println("What is the temperature in degrees Fahrenheit to find the appropriate activity?");
	   temp = scan.nextInt();
	   
	   if (95 >= temp && temp >= 80)
	   {
		   activity = "swimming";
	   }
	   else if (60 <= temp && temp < 80)
	   {
		   activity = "tennis";
	   }
	   else if (40 <= temp && temp < 60)
	   {
		   activity = "golf";
	   }
	   else if (20 <= temp && temp < 40)
	   {
		   activity = "skiing";
	   }
	   else if (temp < 20 || temp > 95)
	   {
		   activity = "Visit our shops!";
	   }

	   System.out.println(activity);
   }
}