package labs2;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Lab2_2_4
{
    // ---------------------------------------------------
    //  main reads in the price per pound of a deli item
    //  and number of ounces of a deli item then computes
    //  the total price and prints a "label" for the item
    //  --------------------------------------------------

    public static void main (String[] args)
    {
        final double OUNCES_PER_POUND = 16.0;

        double pricePerPound;  // price per pound
        double weightOunces;   // weight in ounces
        double weight;         // weight in pounds  
        double totalPrice;     // total price for the item
      
        Scanner scan = new Scanner(System.in);

        NumberFormat money = NumberFormat.getCurrencyInstance();
        DecimalFormat fmt = new DecimalFormat("#.##");
        


        // prompt the user and read in each input
        System.out.println ("Welcome to the CS Deli!!\n ");
        
        System.out.print ("Enter the price per pound of your item: ");
        pricePerPound = scan.nextDouble();

        System.out.print ("Enter the weight (ounces): ");
        weightOunces = scan.nextDouble();

        // Convert ounces to pounds and compute the total price
        weight = weightOunces / OUNCES_PER_POUND;
        totalPrice = pricePerPound * weight;
        
        
        System.out.println();
        System.out.println("***** CS Deli *****");
        System.out.println();
        System.out.println("Unit Price: " + money.format(pricePerPound) + " per pound");
        System.out.println("Weight: " +fmt.format(weight) + " pounds");
        System.out.println();
        System.out.println("TOTAl:" + money.format(totalPrice));
        



    }
}