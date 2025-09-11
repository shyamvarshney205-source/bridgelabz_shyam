// MovieTicket.java
public class MovieTicket {
    // Attributes
    String movieName;
    String seatNumber;
    double price;

    // Constructor
    public MovieTicket() {
        // Default constructor
        this.movieName = "";
        this.seatNumber = "";
        this.price = 0.0;
    }

    // Method to book a ticket
    public void bookTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket successfully booked!");
        System.out.println();
    }

    // ethod to display ticket details
    public void displayTicketDetails() {
        if (movieName.isEmpty() || seatNumber.isEmpty()) {
            System.out.println("No ticket has been booked yet.");
        } else {
            System.out.println("Ticket Details:");
            System.out.println("Movie Name : " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price      : $" + price);
        }
        System.out.println("---------------------------------");
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Create a MovieTicket object
        MovieTicket ticket1 = new MovieTicket();

        // Book a ticket
        ticket1.bookTicket("Inception", "A12", 10.50);

        // Display ticket details
        ticket1.displayTicketDetails();

        // Another ticket
        MovieTicket ticket2 = new MovieTicket();
        ticket2.bookTicket("Interstellar", "B7", 12.75);
        ticket2.displayTicketDetails();
    }
}
