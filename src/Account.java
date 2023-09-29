public abstract class Account {
    private int accountNumber;
    private String holderName;
    private double availableAmount;

    public Account(int accountNumber,String holderName,double availableAmount){
        this.accountNumber=accountNumber;
        this.holderName=holderName;
        this.availableAmount=availableAmount;
    }

    public int getAccountNumber() {

        return accountNumber;
    }

    public String getHolderName() {

        return holderName;
    }

    public void setAvailableAmount(double availableAmount) {

        this.availableAmount = availableAmount;
    }

    public double getAvailableAmount() {

        return availableAmount;
    }

    public void printAccountDetails(){

        System.out.println(">>>>>Account Details<<<<<");
        System.out.println("> Account Number         : "+this.getAccountNumber()+
                         "\n> Account Holder\'s Name  : "+this.getHolderName()+
                         "\n> Available Amount       : "+this.getAvailableAmount());
    }

    public void deposit(double amount){
        this.availableAmount+=amount;
        System.out.println("> Current Balance        : "+this.availableAmount);
        System.out.println();
    }

    public void withdrawals(double amount){
        if (this.availableAmount>=amount){
            this.availableAmount-=amount;
            System.out.println("Congratulations......Withdrawing Successfully.....");
            System.out.println("> Current Balance : "+this.availableAmount);
        }else {
            System.out.println("Sorry insufficient balance...");
        }

    }
}
