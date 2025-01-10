import java.util.*;
import java.util.stream.Collectors;

public class BookingService {

    private List<Booking> bookings;

    public BookingService() {
        this.bookings = new ArrayList<>();
    }

    public void addBooking(Booking booking) {
        bookings.add(booking);
    }

    public List<Booking> filterBookingsByAirline(String airline) {
        return bookings.stream()
                .filter(b -> b.getFlight().getAirline().equalsIgnoreCase(airline))
                .collect(Collectors.toList());
    }

    public List<Booking> searchBookingsByPassengerName(String name) {
        return bookings.stream()
                .filter(b -> b.getPassenger().getName().equalsIgnoreCase(name))
                .collect(Collectors.toList());
    }

    public List<Booking> sortBookingsByReference() {
        return bookings.stream()
                .sorted(Comparator.comparing(Booking::getBookingReference))
                .collect(Collectors.toList());
    }

    public void displayBookings() {
        bookings.forEach(System.out::println);
    }
}
