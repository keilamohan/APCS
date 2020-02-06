package labs2;

import java.util.Scanner;

public class Lab2_2_5
{

    public static void main (String[] args)
    {
		
    	Scanner scan = new Scanner (System.in);
    	System.out.println("Please enter in a number.");
    	int integer = scan.nextInt();
    	
    	System.out.println();
    	
    	
    	System.out.println (integer + " in binary is " + Integer.toBinaryString(integer));
    	System.out.println (integer + " in octal is " + Integer.toBinaryString(integer));
    	System.out.println (integer + " in hexadecimal is " + Integer.toBinaryString(integer));
    	
    	System.out.println("The maximum integer value is " + Integer.MAX_VALUE);
    	System.out.println("The minimum integer value is " + Integer.MIN_VALUE);
    	
    	System.out.println("Please enter in two decimal integers.");
    	
    	String integer1 = scan.next();
    	String integer2 = scan.next();
    	
    	int int1 = Integer.parseInt(integer1);
    	int int2 = Integer.parseInt(integer2);
    	System.out.println(integer1 + " plus " + integer2 + " equals " + (int1+int2));
    	
    }
}