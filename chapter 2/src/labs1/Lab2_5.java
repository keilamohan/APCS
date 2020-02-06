package labs1;
//***************************************************************
//File: Paint.java
//
//Purpose: Determine how much paint is needed to paint the walls 
//of a room given its length, width, and height
//***************************************************************

import java.util.Scanner;

public class Lab2_5
{

    public static void main(String[] args)
    {
        final int COVERAGE = 350;  //paint covers 350 sq ft/gal
        
    	Scanner scan = new Scanner (System.in);
        System.out.println("Please enter a value for the length.");
        int length = scan.nextInt();
        
        System.out.println("Please enter a value for the width.");
        int width = scan.nextInt();
        
        System.out.println("Please enter a value for the height.");
        int height = scan.nextInt();
        
        System.out.println("Please enter a value for the number of doors.");
        int doors = scan.nextInt();
        
        System.out.println("Please enter a value for the number of windows.");
        int windows = scan.nextInt();
        
        System.out.println();
        
        int totalSquareFeet1 = (length * height) * 2 + (width * height) * 2;
        int totalSquareFeet2 = totalSquareFeet1 - (20 * doors) - (15 * windows);
        
        int paint = totalSquareFeet2 / COVERAGE;
        
        System.out.println("The length of the room is " + length);
        System.out.println("The width of the room is " + width);
        System.out.println("The height of the room is" + height);
        System.out.println("The number of gallons of paint needed is " + paint);
        
        
        
    }
}