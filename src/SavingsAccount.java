public class SavingsAccount extends Account{
    private double withdrawalsLimit;

    public SavingsAccount(int accountNumber, String holderName, double availableAmount,double withdrawalsLimit) {
        super(accountNumber, holderName, availableAmount);
        this.withdrawalsLimit=withdrawalsLimit;
    }

    @Override
    public void printAccountDetails() {
        super.printAccountDetails();

    }

    @Override
    public void withdrawals(double amount) {
        if (amount<=this.withdrawalsLimit){
            super.withdrawals(amount);
        }else {
            System.out.println("Sorry you cannot withdraw....Enter the amount that not exceed Rs. "+this.withdrawalsLimit+".00");
        }
    }
}
