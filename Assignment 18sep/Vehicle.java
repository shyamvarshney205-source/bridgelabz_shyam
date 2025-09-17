public class Vehicle {
    // Static variable shared by all vehicles
    private static double registrationFee = 100.0;

    // Instance variables
    private String ownerName;
    private String vehicleType;
    private final String registrationNumber;  // final variable to uniquely identify a vehicle

    // Constructor using 'this' keyword
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    // Static method to update the registration fee for all vehicles
    public static void updateRegistrationFee(double newFee) {
        if (newFee >= 0) {
            registrationFee = newFee;
            System.out.println("Registration fee updated to: $" + registrationFee);
        } else {
            System.out.println("Invalid registration fee.");
        }
    }

    // Method to display registration details with instanceof check
    public void displayRegistrationDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: $" + registrationFee);
        } else {
            System.out.println("Object is not an instance of Vehicle.");
        }
    }

    // Optional getters
    public String getOwnerName() {
        return ownerName;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }
}
