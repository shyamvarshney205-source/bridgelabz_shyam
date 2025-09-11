// CartItem.java
public class CartItem {
    // Attributes
    String itemName;
    double price;
    int quantity;

    // Constructor
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to get total price for this item
    public double getTotalPrice() {
        return price * quantity;
    }

    // Method to display item details
    public void displayItem() {
        System.out.println(itemName + " - $" + price + " x " + quantity + " = $" + getTotalPrice());
    }
}
