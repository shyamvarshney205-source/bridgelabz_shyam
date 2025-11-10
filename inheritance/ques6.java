class Order {
    int orderId;
    String orderDate;
    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }
}

class ShippedOrder extends Order {
    String trackingNumber;
    ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;
    DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }
    void getOrderStatus() {
        System.out.println("Order ID: " + orderId + " delivered on " + deliveryDate);
    }
}

public class ques6 {
    public static void main(String[] args) {
        DeliveredOrder d = new DeliveredOrder(101, "2025-10-20", "TRK12345", "2025-10-25");
        d.getOrderStatus();
    }
}
