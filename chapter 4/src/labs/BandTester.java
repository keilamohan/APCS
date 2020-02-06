package labs;
import java.util.Scanner;

public class BandTester 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter in the name of the first band booster: ");
		BandBooster person1 = new BandBooster(scan.nextLine());
		System.out.println("Enter in the name of the second band booster: ");
		BandBooster person2 = new BandBooster(scan.nextLine());
		
		for(int i = 1; i <=3; i++)
		{
			System.out.println("Enter in the number of boxes " + person1.getName() + " has sold this week: ");
			person1.updateSales(scan.nextInt());
			System.out.println("Enter in the number of boxes " + person2.getName() + " has sold this week: ");
			person2.updateSales(scan.nextInt());
		}
		
		System.out.println(person1.toString());
		System.out.println(person2.toString());
	}

}
