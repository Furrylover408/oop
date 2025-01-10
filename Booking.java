import java.util.Objects;

public class Booking {
    private Flight flight;
    private Passenger passenger;
    private String bookingReference;

    public Booking(Flight flight, Passenger passenger, String bookingReference) {
        this.flight = flight;
        this.passenger = passenger;
        this.bookingReference = bookingReference;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return Objects.equals(bookingReference, booking.bookingReference);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookingReference);
    }
}
