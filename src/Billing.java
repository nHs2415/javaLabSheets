public class Billing {
    private Item[] storeItemList;
    private double totalAmount;
    private int cartSize;
    private int itemCount;

    public Billing(Item[] storeItemList,double totalAmount,int cartSize) {
        this.storeItemList = storeItemList;
        this.totalAmount=totalAmount;
        this.cartSize=cartSize;
        this.itemCount=0;
    }
    public void addingItem(String name,int quantity,double unitPrice){
        if (this.itemCount >= this.cartSize){
            System.out.println("The cart is almost full.You cannot add more items again.");
        }else {
            this.storeItemList[this.itemCount++]=new Item("name",quantity,unitPrice);
            System.out.println("Add item to the cart.");
        }
    }

    public void displayOrder(){
        System.out.println("*********Order Details********");
        for (int i=0;i<this.itemCount;i++){
            Item item=this.storeItemList[i];
            System.out.println(item.getName()+"\tQuantity : "+item.getQuantity()+"\tTotal Price : "+item.getTotalPrice());
        }
    }

    public double calculateBill(){
        this.totalAmount=0;
        for (int i = 0; i<this.itemCount;i++){
            this.totalAmount+=this.storeItemList[i].getTotalPrice();
        }
        return this.totalAmount;
    }

    public void printMenu(){
        System.out.println("*********Menu**********");
        System.out.println("1. Onion Dosa \t 220.00 \n" +
                           "2. Masala Dosa \t 350.00 \n" +
                           "3. Idly Set \t 120.00 \n" +
                           "4. String Hoppers \t 150.00 \n" +
                           "5. Poori Set \t 160.00 \n" +
                           "6. Tea \t 60.00 \n");
    }

}
