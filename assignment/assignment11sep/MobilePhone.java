// MobilePhone.java
public class MobilePhone {
    // Attributes
    String brand;
    String model;
    double price;

    // Constructor
    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display mobile phone details
    public void displayDetails() {
        System.out.println("Mobile Phone Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
        System.out.println("-----------------------------");
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating objects of MobilePhone
        MobilePhone phone1 = new MobilePhone("Samsung", "Galaxy S21", 799.99);
        MobilePhone phone2 = new MobilePhone("Apple", "iPhone 14", 999.99);
        MobilePhone phone3 = new MobilePhone("OnePlus", "Nord CE 3", 299.99);

        // Displaying the details of each phone
        phone1.displayDetails();
        phone2.displayDetails();
        phone3.displayDetails();
    }
}

