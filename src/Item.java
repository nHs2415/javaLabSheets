public class Item {
    private String name;
    private int quantity;
    private double totalPrice;

    public Item(String name,int quantity,double unitPrice) {
        this.name = name;
        this.quantity=quantity;
        this.totalPrice=quantity*unitPrice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

}
