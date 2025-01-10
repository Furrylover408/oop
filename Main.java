public class Main {
    public static void main(String[] args) {

        Flight flight1 = new Flight("AA123", "American Airlines", "New York", "Los Angeles");
        Flight flight2 = new Flight("BA456", "British Airways", "London", "New York");

        Passenger passenger1 = new Passenger("John Doe", "P1234567", "USA");
        Passenger passenger2 = new Passenger("Jane Smith", "P7654321", "UK");

        Booking booking1 = new Booking(flight1, passenger1, "BKG123");
        Booking booking2 = new Booking(flight2, passenger2, "BKG456");

        BookingService bookingService = new BookingService();
        bookingService.addBooking(booking1);
        bookingService.addBooking(booking2);

        bookingService.displayBookings();

        System.out.println("\nFiltered by airline 'British Airways':");
        bookingService.filterBookingsByAirline("British Airways").forEach(System.out::println);

        System.out.println("\nSearching for bookings by 'John Doe':");
        bookingService.searchBookingsByPassengerName("John Doe").forEach(System.out::println);

        System.out.println("\nBookings sorted by booking reference:");
        bookingService.sortBookingsByReference().forEach(System.out::println);
    }
}
