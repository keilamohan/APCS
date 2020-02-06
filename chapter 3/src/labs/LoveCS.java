package labs;
// ****************************************************************
//   LoveCS.java
//
//   Use a while loop to print many messages declaring your 
//   passion for computer science
// ****************************************************************
import java.util.Scanner;
public class LoveCS
{
    public static void main(String[] args)
    {
    	Scanner scan = new Scanner(System.in);
    	
    	System.out.println("How many times should the message be printed?");
    	
    	int limit = scan.nextInt();

    	int count = 1;
    	int sum = count;

    	while (count <= limit){
    		System.out.println(count + " I love Computer Science!!");
    		count++;
    		sum += count;
    	}
    	System.out.print("Printed this message " + count + " times.");
    	System.out.print(" The sum of the numbers from 1 to "+ count + " is " + sum);
    	
    }
}