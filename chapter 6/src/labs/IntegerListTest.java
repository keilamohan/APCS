package labs;
// ****************************************************************

// IntegerListTest.java
//
// Provide a menu-driven tester for the IntegerList class.
//          
// ****************************************************************
import java.util.Scanner;

public class IntegerListTest
{
    static IntegerList list = new IntegerList(10);
    static Scanner scan = new Scanner(System.in);

    //-------------------------------------------------------
    // Create a list, then repeatedly print the menu and do what the
    // user asks until they quit
    //-------------------------------------------------------
    public static void main(String[] args)
    {
	printMenu();
	int choice = scan.nextInt();
	while (choice != 0)
	    {
		dispatch(choice);
		printMenu();
		choice = scan.nextInt();
	    }
    }

    //--------------------------------------
    // Do what the menu item calls for
    //--------------------------------------
    public static void dispatch(int choice)
    {
	int loc;
	switch(choice)
	    {
	    case 0: 
		System.out.println("Bye!");
		break;
	    case 1:
		System.out.println("How big should the list be?");
		int size = scan.nextInt();
		list = new IntegerList(size);
		list.randomize();
		break;
	    case 2:
		list.print();
		break;
	    case 3:
			System.out.println("What element would you like to add?");
			int element = scan.nextInt();
			list.addElement(element);
			break;
	    case 4:
			System.out.println("What element would you like to remove?");
			int element2 = scan.nextInt();
			list.removeFirst(element2);
			break;
	    case 5:
			System.out.println("What element would you like to remove?");
			int element3 = scan.nextInt();
			list.removeAll(element3);
			break;
		default:
		System.out.println("Sorry, invalid choice");
	    }
    }

   
    //----------------------------
    // Print the user's choices
    //----------------------------
    public static void printMenu()
    {
	System.out.println("\n   Menu   ");
	System.out.println("   ====");
	System.out.println("0: Quit");
	System.out.println("1: Create a new list (** do this first!! **)");
	System.out.println("2: Print the list");
	System.out.println("3: Add element to list");
	System.out.println("4: Remove element from the list");
	System.out.println("5: Remove all occurence of element from the list");
	System.out.print("\nEnter your choice: ");
    }
}