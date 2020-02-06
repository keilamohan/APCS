package labs;

import java.util.Scanner;
public class Factorials
{
    public static void main(String[] args)
    {
    	Scanner scan = new Scanner(System.in);
    	
    	int num;
    	int factorial=1;
    	
    	System.out.println("Please enter a non-negative integer.");
    	num = scan.nextInt();
    	
    	while (num < 0)
    	{
    		System.out.println("A non-negative integer is required. Please enter in another number.");
    		num = scan.nextInt();
    		
    	}
    	if ( num>0)
    	{
    		while (num>1)
    		{
    			factorial *= num--;
    		}
    	}

    	else
    	{
    		factorial = 1;
    	}
    	System.out.println(factorial);
    			
    	}
    	

}