class Vehicle {
    int maxSpeed;
    String fuelType;
    Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }
    void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed + ", Fuel Type: " + fuelType);
    }
}

class Car extends Vehicle {
    int seatCapacity;
    Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }
    void displayInfo() {
        System.out.println("Car - Max Speed: " + maxSpeed + ", Fuel Type: " + fuelType + ", Seats: " + seatCapacity);
    }
}

class Truck extends Vehicle {
    int loadCapacity;
    Truck(int maxSpeed, String fuelType, int loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }
    void displayInfo() {
        System.out.println("Truck - Max Speed: " + maxSpeed + ", Fuel Type: " + fuelType + ", Load: " + loadCapacity);
    }
}

class Motorcycle extends Vehicle {
    boolean hasCarrier;
    Motorcycle(int maxSpeed, String fuelType, boolean hasCarrier) {
        super(maxSpeed, fuelType);
        this.hasCarrier = hasCarrier;
    }
    void displayInfo() {
        System.out.println("Motorcycle - Max Speed: " + maxSpeed + ", Fuel Type: " + fuelType + ", Carrier: " + hasCarrier);
    }
}

public class ques3 {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car(180, "Petrol", 5),
            new Truck(120, "Diesel", 10000),
            new Motorcycle(150, "Petrol", true)
        };
        for (Vehicle v : vehicles) {
            v.displayInfo();
        }
    }
}
