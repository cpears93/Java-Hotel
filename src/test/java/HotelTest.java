import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom1;

    @Before
    public void setUp(){
        hotel = new Hotel();
        bedroom1 = new Bedroom(1, 1, "Single");
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

}
