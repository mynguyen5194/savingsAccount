package savingsAccount;

public class SpecialSavings extends SavingsAccount {
	
	public SpecialSavings() {}
	
	public SpecialSavings(double SavingBalance) {
		super(SavingBalance);
	}
	
	protected double calculateMonthlyInterest(double balance) {
		double monthlyInterest = 0;
		
		if (super.getSavingsBalance() >= 10000.00) {
			super.modifyInterestRate(0.10);
			monthlyInterest = super.calculateMonthlyInterest(balance);
		}
		else {
			super.modifyInterestRate(0.04);
			monthlyInterest = super.calculateMonthlyInterest(balance);
		}
		
		return monthlyInterest;
	}
	
	// Deposit money into the Special Savings
	public double depositMoney(double depositAmount, String saver) {
		double balance = super.depositMoney(depositAmount, saver);
		if (this.getSavingsBalance() >= 10000.00) {
			System.out.printf("You have successfully deposited $%1.2f in " 
							+ saver + "'s Special Saving Account \n", depositAmount);
			System.out.printf("Special Saving Account balance at 10%% interest rate: $%1.2f \n\n",
					this.calculateMonthlyInterest(this.getSavingsBalance()));
		}
		return balance;
	}
	
	// Withdraw money from the Special Savings
	public double withdrawMoney(double withdrawalAmount, String saver) {
		double balance = super.withdrawMoney(withdrawalAmount, saver);
		if(this.getSavingsBalance() >= 10000.00) {
			System.out.printf("You have withdrew $%1.2f from "
							+ saver + "'s Special Saving Account \n", withdrawalAmount);
			System.out.printf("Special Saving Account balance at 10%% interest rate: $%1.2f \n\n",
					this.calculateMonthlyInterest(this.getSavingsBalance()));
		}
		return balance;
	}
}
