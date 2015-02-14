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
	public double depositMoney(double depositAmount) {
		double balance = super.depositMoney(depositAmount);
		if (this.getSavingsBalance() >= 10000.00) {
			System.out.printf("You have succesufully deposit $%1.2f in your Special Saving Acount\n", depositAmount);
			System.out.printf("Saving Account balance at 10%% interest: $%1.2f \n",
					this.calculateMonthlyInterest(this.getSavingsBalance()));
		}
		return balance;
	}
	
	// Withdraw money from the Special Savings
	public double withdrawMoney(double withdrawalAmount) {
		double balance = super.withdrawMoney(withdrawalAmount);
		if(this.getSavingsBalance() >= 10000.00) {
			System.out.printf("\nYou have withdrew $%1.2f from your special saving acount\n", withdrawalAmount);
			System.out.printf("Saving Account balance at 10%% interest: $%1.2f \n",
					this.calculateMonthlyInterest(this.getSavingsBalance()));
		}
		return balance;
		
	}
	
}
