package labs;
import java.util.Scanner;


public class Comparisons {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		Comparable one;
		Comparable two;
		Comparable three;
		
		System.out.println("Please enter in 3 Strings.\nEnter string one:");
		one = scan.nextLine();
		System.out.println("Enter string two:");
		two = scan.nextLine();
		System.out.println("Enter string three:");
		three = scan.nextLine();
		
		System.out.println("The largest string is " + Compare3.largest(one, two, three));
		System.out.println();
		
		System.out.println("Please enter in 3 integer values.\nEnter integer one:");
		one = scan.nextLine();
		System.out.println("Enter integer two:");
		two = scan.nextLine();
		System.out.println("Enter integer three:");
		three = scan.nextLine();

		System.out.println("The largest integer is " + Compare3.largest(one, two, three));
	}

}
