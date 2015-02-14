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
	public double getMothlyInterest (double balance) {
		
		return this.calculateMonthlyInterest(balance);
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
	
	// Deposit some money into the Saving Accounts
	public double depositMoney(double depositAmount) {
		this.savingsBalance += depositAmount;
		if (this.getSavingsBalance() < 10000.00) {
			System.out.printf("An amount of $%1.2f was sucessfully deposited in your Saving Account\n", + depositAmount );
			System.out.printf("Saving Account balance at 4%% interest: $%1.2f \n",
					this.calculateMonthlyInterest(this.getSavingsBalance()));
		}
		return this.savingsBalance;
	}
	
	// Withdraw some money from the Savings Account
	public double withdrawMoney(double withdrawalAmount) {
		this.savingsBalance -= withdrawalAmount;
		if (this.getSavingsBalance() < 10000.00) {
			System.out.printf("\nAn amount of $%1.2f was withdrew from your Saving Account\n", withdrawalAmount);
			System.out.printf("Saving Account balance at 4%% interest: $%1.2f \n",
					this.calculateMonthlyInterest(this.getSavingsBalance()));
		}
		return (this.getSavingsBalance());
	}
}
