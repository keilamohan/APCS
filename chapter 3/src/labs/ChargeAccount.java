package labs;
import java.util.Scanner;
import java.text.NumberFormat;

public class ChargeAccount
{
   public static void main (String[] args)
   {
	   int prevBal, newBal;
	   double interest, totalBal, minPayment;
	   
	   Scanner scan = new Scanner (System.in);
	   System.out.println("What is the previous balance? ");
	   prevBal = scan.nextInt();
	   
	   System.out.println("Do you have any charges from this month?");
	   newBal = scan.nextInt();
	   
	   if (prevBal == 0)
	   {
		   interest = 0;
	   }
	   else
	   {
		   interest = 0.02 * (newBal + prevBal);
	   }
	   
	   totalBal = newBal + prevBal + interest;
	   
	   if (totalBal < 50)
	   {
		   minPayment = totalBal;
	   }
	   else if (totalBal <= 300)
	   {
		   minPayment = 50;
	   }
	   else
	   {
		   minPayment = 0.2 * totalBal;
	   }
	   
	   NumberFormat money = NumberFormat.getCurrencyInstance();
	   
	   
	   System.out.println();
	   System.out.println("CS CARD International Statement");
	   System.out.println("================================");
	   System.out.println();
	   System.out.println("Previous Balance:     " + money.format(prevBal));
	   System.out.println("Additional Charges:   " + money.format(newBal));
	   System.out.println("Interest:             " + money.format(interest));
	   System.out.println();
	   System.out.println("New Balance:          " + money.format(totalBal));
	   System.out.println();
	   System.out.println("Minimum Payment:      " + money.format(minPayment));
	   

   }
}