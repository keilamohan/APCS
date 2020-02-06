package labs;

import java.util.Scanner;


public class ReverseArray {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("How many values would you like?");
		int[] currentArray = new int[scan.nextInt()];
		fillArray(currentArray,scan);
		printArray(currentArray);
		reverseArray(currentArray);
		printArray(currentArray);
	}

	public static void fillArray(int[] arr, Scanner scan)
	{
		for(int spot = 0; spot < arr.length; spot++)
		{
			System.out.println("Please enter value "+(spot+1)+":");
			arr[spot] = scan.nextInt();
		}
		//Arrays.toString(arr);
	}
	public static void reverseArray(int[] arr)
	{
		for(int spot = 0; spot < arr.length/2; spot++)
		{
			//take current spot and switch with current spot from end
			int temp = arr[spot];
			arr[spot] = arr[arr.length-1-spot];
			arr[arr.length-1-spot] = temp;
		}
		
	}
	
	public static void printArray(int[] arr)
	{
		System.out.print("["+ arr[0]);
		for(int spot = 1; spot < arr.length; spot++)
		{
			System.out.print(", "+arr[spot]);
			
		}
		System.out.println("]");
		
	}
}
