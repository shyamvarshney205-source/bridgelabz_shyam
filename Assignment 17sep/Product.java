public class Product {
    // Instance variables
    private String productName;
    private double price;

    // Class variable (static)
    private static int totalProducts = 0;

    // Constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // Increment every time a new product is created
    }

    // Instance method to display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price       : $" + price);
    }

    // Class method to display total number of products
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    // Main method for testing
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 999.99);
        Product p2 = new Product("Smartphone", 699.49);

        System.out.println("Product 1 Details:");
        p1.displayProductDetails();

        System.out.println("\nProduct 2 Details:");
        p2.displayProductDetails();

        // Display total products
        System.out.println();
        Product.displayTotalProducts();
    }
}
