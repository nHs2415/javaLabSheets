public class Driver {

    public static void main(String[] args) {

        KidsAccount kidsAccount=new KidsAccount(98755,"Kisai",34455.69,4000,"Suhan");

        kidsAccount.printAccountDetails();

        kidsAccount.withdrawals(3000);

        kidsAccount.deposit(5000);


    }
}
