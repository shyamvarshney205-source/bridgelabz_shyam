public class Product {
    // Static variable shared by all products
    private static double discount = 0.0; // discount percentage, e.g., 10.0 means 10%

    // Instance variables
    private String productName;
    private double price;
    private int quantity;
    private final String productID;  // final variable ensures unique ID cannot be changed

    // Constructor using 'this' to resolve ambiguity
    public Product(String productName, double price, int quantity, String productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    // Static method to update discount for all products
    public static void updateDiscount(double newDiscount) {
        if (newDiscount >= 0 && newDiscount <= 100) {
            discount = newDiscount;
            System.out.println("Discount updated to " + discount + "%");
        } else {
            System.out.println("Invalid discount value. Must be between 0 and 100.");
        }
    }

    // Instance method to process and display product details only if the object is a Product instance
    public void displayProductDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + productID);
            System.out.println("Name: " + productName);
            System.out.println("Price: $" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Price after discount: $" + getPriceAfterDiscount());
        } else {
            System.out.println("Invalid object, not a Product.");
        }
    }

    // Helper method to calculate price after discount
    public double getPriceAfterDiscount() {
        return price * (1 - discount / 100);
    }

    // Getters (optional)
    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getProductID() {
        return productID;
    }
}
