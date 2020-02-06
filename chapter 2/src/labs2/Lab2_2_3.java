package labs2;
// *************************************************************
//   Distance.java
//
//   Computes the distance between two points
// *************************************************************

import java.util.Scanner;

public class Lab2_2_3
{
    public static void main (String[] args)
    {
	double x1, y1, x2, y2; // coordinates of two points
	double distance;       // distance between the points

	Scanner scan = new Scanner(System.in);

	// Read in the two points 
	System.out.print ("Enter the coordinates of the first point " +
               "(put a space between them): ");
	x1 = scan.nextDouble();
	y1 = scan.nextDouble();

	System.out.print ("Enter the coordinates of the second point: ");
	x2 = scan.nextDouble();
	y2 = scan.nextDouble();

	distance = (double) Math.pow((x1 - x2),2)+ (double) Math.pow((y1-y2),2);
	distance = Math.sqrt(distance);
	System.out.println("The distance between the first and second point is " + distance);
	

	
    }
}