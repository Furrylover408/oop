// Main.java
public class Main {
    public static void main(String[] args) {
        Flight flight1 = new Flight("AA123", "American Airlines", "New York", "Los Angeles");
        Flight flight2 = new Flight("BA456", "British Airways", "London", "New York");

        Passenger passenger1 = new Passenger("John Doe", "P1234567", "USA");
        Passenger passenger2 = new Passenger("Jane Smith", "P7654321", "UK");

        Booking booking1 = new Booking(flight1, passenger1, "BKG123");
        Booking booking2 = new Booking(flight2, passenger2, "BKG456");

        System.out.println(booking1);
        System.out.println(booking2);

        // Comparing bookings
        System.out.println("Are bookings equal? " + booking1.equals(booking2));
    }
}
