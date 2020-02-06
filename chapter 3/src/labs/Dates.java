package labs;
// ****************************************************************
// Dates.java
//
// Determine whether a 2nd-millenium date entered by the user
// is valid          
// ****************************************************************
import java.util.Scanner;

public class Dates
{
    public static void main (String[] args)
    {
    	int month, day, year;   //date read in from user
    	int daysInMonth;        //number of days in month read in 
    	boolean monthValid, yearValid, dayValid;  //true if input from user is valid
    	boolean leapYear;       //true if user's year is a leap year

	
    	Scanner scan = new Scanner (System.in);
	
    	System.out.println("What is the number of the day?");
    	day = scan.nextInt();
    	System.out.println("What is the number of the month?");
    	month = scan.nextInt();
    	System.out.println("What is the number of the year?");
    	year = scan.nextInt();
    

		monthValid = (month >= 1 && month <= 12);
		yearValid = (year >= 1000 && year <= 1999);
    	
    
    	leapYear = (year % 400) == 0 || ((year % 4) == 0) && ((year % 100) != 0);
    
    	if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
    	{
    		daysInMonth = 31;
    	}

    
    	else if (month == 2)
    	{
    		if (leapYear)
    		{
    			daysInMonth = 29;
    		}
    		else
    		{
    			daysInMonth = 28;
    		}
    	}
    	
    	else
    	{
    		daysInMonth = 30;
    	}
    
    	dayValid = day <= daysInMonth;
    

    	if (leapYear)
    	{
    		System.out.println("It is a leap year.");
    	}
    	if (!monthValid || !dayValid  || !yearValid)
    	{
    		System.out.println("Date is not valid");
    	}
    	else
    	{
    		System.out.println("Date is valid");
    	}
    }
    	
	//Get integer month, day, and year from user

	//Check to see if month is valid

	//Check to see if year is valid

	//Determine whether it's a leap year

	//Determine number of days in month

	//User number of days in month to check to see if day is valid

	//Determine whether date is valid and print appropriate message

    }