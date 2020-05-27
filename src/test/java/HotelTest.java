import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private Bedroom bedroom1;
    private Guest guest1;
    private Booking booking1;

    @Before
    public void setUp(){
        hotel = new Hotel();
        bedroom1 = new Bedroom(1, 1, "Single", 85.00);
        guest1 = new Guest("Jane Doe");
        booking1 = new Booking(bedroom1, 3 );
    }

    @Test
    public void canGetRoomCollectionSizeStartsAtZero() {
        assertEquals(0, hotel.getCollectionSize());
    }

    @Test
    public void canAddRoomHotel() {
        hotel.addRoom(bedroom1);
        assertEquals(1, hotel.getCollectionSize());
    }

    @Test
    public void canCheckGuestIn() {
        hotel.checkInGuest(bedroom1, guest1);
        assertEquals(1, bedroom1.getCollectionOfGuestSize());
    }

    @Test
    public void canCheckGuestOut() {
        hotel.checkInGuest(bedroom1, guest1);
        hotel.checkOutGuest(bedroom1, guest1);
        assertEquals(0, bedroom1.getCollectionOfGuestSize());
    }

    @Test
    public void bookingSizeStartsAtZero() {
        assertEquals(0, hotel.getBookingSize());
    }

    @Test
    public void canAddABooking() {
        hotel.addBooking(booking1);
        assertEquals(1, hotel.getBookingSize());
    }

    @Test
    public void canBookRoom() {
        hotel.bookRoom(bedroom1, 5);
        assertEquals(1, hotel.getBookingSize());
    }


}
