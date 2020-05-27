import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private Bedroom bedroom1;
    private Guest guest1;

    @Before
    public void setUp(){
        hotel = new Hotel();
        bedroom1 = new Bedroom(1, 1, "Single");
        guest1 = new Guest("Jane Doe");
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
}
