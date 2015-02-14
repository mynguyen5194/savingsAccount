package savingsAccount;

public class SavingsAccount {
	private static double annualInterestRate;
	private double savingsBalance;
	
	public SavingsAccount() {}
	
	public SavingsAccount(double SavingsBalance) {
		savingsBalance = SavingsBalance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public static void setAnnualInterestRate(double annualInterestRate) {
		SavingsAccount.annualInterestRate = annualInterestRate;
	}

	public double getSavingsBalance() {
		return savingsBalance;
	}

	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	
	// Get the monthly interest
	public void getMothlyInterest (double balance, String saver) {
		System.out.printf("Balance of " + saver + " at " + (this.getAnnualInterestRate() * 100)
				+ "%% interest rate: $%1.2f \n", this.calculateMonthlyInterest(balance));
	}
		
	// Calculate the monthly interest 
	protected double calculateMonthlyInterest (double balance) {	
		double monthlyInterest = (balance * annualInterestRate) / 12;
		this.savingsBalance += monthlyInterest; 
		return this.savingsBalance;
	}
	
	// Set the annualInterestRate to a new value
	public static void modifyInterestRate (double newValue) {
		annualInterestRate = newValue;
	}
	
	// Deposit money into the Saving Accounts
	public double depositMoney(double depositAmount, String saver) {
		this.savingsBalance += depositAmount;
		if (this.getSavingsBalance() < 10000.00) {
			System.out.printf("An amount of $%1.2f was successfully deposited in " 
							+ saver + "'s Saving Account\n", depositAmount );
			System.out.printf("Saving Account balance at 4%% interest rate: $%1.2f \n\n",
					this.calculateMonthlyInterest(this.getSavingsBalance()));
		}
		return this.savingsBalance;
	}
	
	// Withdraw money from the Savings Account
	public double withdrawMoney(double withdrawalAmount, String saver) {
		this.savingsBalance -= withdrawalAmount;
		if (this.getSavingsBalance() < 10000.00) {
			System.out.printf("An amount of $%1.2f was withdrew from "
							+ saver + "'s Saving Account\n", withdrawalAmount);
			System.out.printf("Saving Account balance at 4%% interest rate: $%1.2f \n\n",
					this.calculateMonthlyInterest(this.getSavingsBalance()));
		}
		return this.getSavingsBalance();
	}
}
