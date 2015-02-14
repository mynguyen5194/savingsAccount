package driver;

import savingsAccount.*;

public class SavingsAccountTest {

	public static void main(String[] args) {
		
		SavingsAccount saver1 = new SavingsAccount(2000.00);
		SavingsAccount saver2 = new SavingsAccount(3000.00);
		
		
		SavingsAccount.modifyInterestRate(0.04);
		saver1.getMothlyInterest(saver1.getSavingsBalance(), "Saver1");
		saver2.getMothlyInterest(saver2.getSavingsBalance(), "Saver2");
		
		SavingsAccount.modifyInterestRate(0.05);
		saver1.getMothlyInterest(saver1.getSavingsBalance(), "Saver1");
		saver2.getMothlyInterest(saver2.getSavingsBalance(), "Saver2");
		
		
		/*
		SavingsAccount saver1 = new SpecialSavings(2000);
		
		saver1.depositMoney(9000);
		saver1.withdrawMoney(500);
		
		SavingsAccount saver2 = new SpecialSavings(3000);
		
		saver2.depositMoney(7000);
		*/
		
	}
}



/*
 * Output:
 * 
 * Part 1:
Balance of Saver 1 at 4% interest rate: $2006.67
Balance of Saver 2 at 4% interest rate: $3010.00

Balance of Saver 1 at 5% interest rate: $2015.03
Balance of Saver 2 at 5% interest rate: $3022.54

 */