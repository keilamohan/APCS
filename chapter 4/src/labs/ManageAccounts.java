package labs;
import java.text.NumberFormat;
// ****************************************************************
//   ManageAccounts.java
//
//   Use Account class to create and manage Sally and Joe's 
//   bank accounts       
// ****************************************************************

public class ManageAccounts
{
    public static void main(String[] args)
    {
	    	
    	NumberFormat money = NumberFormat.getCurrencyInstance();
		Account acct1, acct2;
		

	
		//create account1 for Sally with $1000
		acct1 = new Account(1000, "Sally", 1111);
		acct2 = new Account(500, "Joe", 1112);
	
		acct2.deposit(100);
		acct2.getBalance();
	
		System.out.println(money.format(acct2.getBalance()));
	
		acct1.withdraw(50);
		
		System.out.println(money.format(acct1.getBalance()));
		
		acct2.chargeFee();
		acct1.chargeFee();
		
		System.out.println(money.format(acct1.chargeFee()));
		System.out.println(money.format(acct2.chargeFee()));
		
		acct2.changeName("Joseph");
		
		System.out.println();
		System.out.println();
		
		System.out.println("***********************************");
		System.out.println("Account Summary");
		System.out.println(acct1.toString());
		System.out.println("***********************************");
		System.out.println();
		System.out.println("***********************************");
		System.out.println("Account Summary");
		System.out.println(acct2.toString());
		System.out.println("***********************************");
		System.out.println();
		


    }
}