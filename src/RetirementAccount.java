public class RetirementAccount extends Account{

    private int retiredYear;
    public RetirementAccount(int accountNumber, String holderName, double availableAmount,int retiredYear) {
        super(accountNumber, holderName, availableAmount);
        this.retiredYear=retiredYear;
    }

    @Override
    public void printAccountDetails() {
        super.printAccountDetails();
        System.out.println("> Retired Year     : "+this.retiredYear);
    }

    @Override
    public void withdrawals(double amount) {
        int currentYear=java.time.Year.now().getValue();
        if (currentYear>retiredYear){
            super.withdrawals(amount);
        }else {
            System.out.println("Sorry You cannot withdraw money before "+this.retiredYear+"th Year");
        }

    }
}
