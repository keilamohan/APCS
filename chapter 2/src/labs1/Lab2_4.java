package labs1;
//**********************************************************
//  Circle.java
//
//  Print the area of a circle with two different radii
//**********************************************************

import java.util.Scanner;

public class Lab2_4
{
	public static void main(String[] args)
    {

     
     final double PI = 3.14159;
	 Scanner scan = new Scanner (System.in);
     
     System.out.println("Please enter a value for the radius.");
     int radius1 = scan.nextInt();
     double area1 = PI * radius1 * radius1;
     double circumference1 = (2 * radius1) * PI;
     
     
     
     System.out.println("The area of a circle with radius " + radius1 +
        " is " + area1);
     System.out.println("The circumference of a circle with radius " + radius1 + " is " + circumference1);
     
     System.out.println();
     
     
     int radius2 = 2 * radius1;
     double area2 = PI * radius2 * radius2;
     double circumference2 = (2 * radius2) * PI;
     
     System.out.println("The area of a circle with radius " + radius2 +
        " is " + area2);
     System.out.println("The circumference of a circle with radius " + radius2 + " is " + circumference2);
     
     System.out.println();
     
     
     double areafactor = area2 / area1; 
     System.out.println("When the radius is doubled, the area grows by a factor of " + areafactor);
     
     double circumferencefactor = circumference2 / circumference1;
     System.out.println("When the radius is doubled, the area grows by a factor of " + circumferencefactor);
     
     // Yes the result from above holds.
    }
}