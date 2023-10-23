public class Customer {

    private String name;
    private Billing billing;

    public Customer(String name,Billing cartSize){
        this.name=name;
        this.billing=new Billing(cartSize);

    }
}
