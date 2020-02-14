package labs;

import java.util.Scanner;

public class ShopStimulate
{
    public static void main(String[] args)
    {

        String shop = "y";
        Scanner scan = new Scanner(System.in);
        int total = 0;

        while(shop.equalsIgnoreCase("y"))
        {
            System.out.println("What item would you like to add to the cart?");
            String itemName1 = scan.nextLine();

            System.out.println("How much is your item?");
            int price1 = scan.nextInt();

            System.out.println("How many of this item did you purchase?");
            int num1 = scan.nextInt();


            Item item1 = new Item(itemName1, price1, num1);

            item1.toString();

            System.out.println("Would you like to continue shopping? (y/n)");
            shop = scan.nextLine();

            total += price1*num1;
        }

        System.out.println("Please pay $" + total);

    }
}