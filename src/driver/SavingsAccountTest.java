package driver;

import savingsAccount.*;

public class SavingsAccountTest {

	public static void main(String[] args) {
		/*
		// Part 1:
		SavingsAccount saver1 = new SavingsAccount(2000.00);
		SavingsAccount saver2 = new SavingsAccount(3000.00);
		
		
		SavingsAccount.modifyInterestRate(0.04);
		saver1.getMothlyInterest(saver1.getSavingsBalance(), "Saver1");
		saver2.getMothlyInterest(saver2.getSavingsBalance(), "Saver2");
		
		SavingsAccount.modifyInterestRate(0.05);
		saver1.getMothlyInterest(saver1.getSavingsBalance(), "Saver1");
		saver2.getMothlyInterest(saver2.getSavingsBalance(), "Saver2");
		*/
		
		// Part 2:
		SavingsAccount saver1 = new SpecialSavings(2000);
		
		saver1.depositMoney(7000, "Saver1");
		saver1.withdrawMoney(500, "Saver1");
		
		SavingsAccount saver2 = new SpecialSavings(3000);
		
		saver2.depositMoney(8000, "Saver2");
		saver2.withdrawMoney(100, "Saver2");
		saver2.withdrawMoney(2000, "Saver2");
		
	}
}



/*
 * Output:
 * 
 * Part 1:
Balance of Saver1 at 4.0% interest rate: $2006.67 
Balance of Saver2 at 4.0% interest rate: $3010.00 
Balance of Saver1 at 5.0% interest rate: $2015.03 
Balance of Saver2 at 5.0% interest rate: $3022.54 

 * Part 2:
An amount of $7000.00 was successfully deposited in Saver1's Saving Account
Saving Account balance at 4% interest rate: $9030.00 

An amount of $500.00 was withdrew from Saver1's Saving Account
Saving Account balance at 4% interest rate: $8558.43 

You have successfully deposited $8000.00 in Saver2's Special Saving Account 
Special Saving Account balance at 10% interest rate: $11091.67 

You have withdrew $100.00 from Saver2's Special Saving Account 
Special Saving Account balance at 10% interest rate: $11083.26 

An amount of $2000.00 was withdrew from Saver2's Saving Account
Saving Account balance at 4% interest rate: $9113.54 

 */