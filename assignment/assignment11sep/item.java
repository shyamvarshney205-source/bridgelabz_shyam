// Item.java
public class item {
    // Attributes
    int itemCode;
    String itemName;
    double price;

    // Constructor
    public item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to display item details
    public void displayDetails() {
        System.out.println("Item Details:");
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per unit: $" + price);
    }

    // Method to calculate total cost for a given quantity
    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    // Main method to test the Item class
    public static void main(String[] args) {
        // Create an Item object
        item item1 = new item(1001, "Wireless Mouse", 25.99);

        // Display item details
        item1.displayDetails();

        // Calculate and display total cost for a given quantity
        int quantity = 3;  // Example quantity
        double totalCost = item1.calculateTotalCost(quantity);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: $" + totalCost);
    }
}

