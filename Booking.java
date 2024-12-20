// Booking.java
public class Booking {
    private Flight flight;
    private Passenger passenger;
    private String bookingReference;

    public Booking(Flight flight, Passenger passenger, String bookingReference) {
        this.flight = flight;
        this.passenger = passenger;
        this.bookingReference = bookingReference;
    }

    // Getters and Setters
    public Flight getFlight() { return flight; }
    public void setFlight(Flight flight) { this.flight = flight; }

    public Passenger getPassenger() { return passenger; }
    public void setPassenger(Passenger passenger) { this.passenger = passenger; }

    public String getBookingReference() { return bookingReference; }
    public void setBookingReference(String bookingReference) { this.bookingReference = bookingReference; }

    @Override
    public String toString() {
        return "Booking{" +
                "flight=" + flight +
                ", passenger=" + passenger +
                ", bookingReference='" + bookingReference + '\'' +
                '}';
    }
}
