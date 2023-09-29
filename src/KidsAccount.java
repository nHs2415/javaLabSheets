public class KidsAccount extends SavingsAccount{

    private String guardianName;

    public KidsAccount(int accountNumber, String holderName, double availableAmount, double withdrawals,String guardianName) {
        super(accountNumber, holderName, availableAmount, withdrawals);
        this.guardianName=guardianName;
    }

    @Override
    public void printAccountDetails() {
        super.printAccountDetails();
        System.out.println("> Guardian\'s Name        : "+this.guardianName);
    }

    @Override
    public void withdrawals(double amount) {
        if (this.getHolderName().equals(this.guardianName)) {
            super.withdrawals(amount);
        }else {
            System.out.println("Sorry Only Guardian can be withdraw money...");
        }


    }
}
