import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom1;
    private Guest guest1;

    @Before
    public void setup(){
        bedroom1 = new Bedroom(1, 1, "Single");
        guest1 = new Guest("Jane Doe");
    }

    @Test
    public void canGetRoomNumber(){
        assertEquals(1, bedroom1.getRoomNumber());
    }

    @Test
    public void canGetRoomCapacity(){
        assertEquals(1, bedroom1.getCapacity());
    }

    @Test
    public void canGetRoomType(){
        assertEquals("Single", bedroom1.getType());
    }

    @Test
    public void guestSizeStartsAtZero(){
        assertEquals(0, bedroom1.getCollectionOfGuestSize());
    }

    @Test
    public void canAddGuest(){
        bedroom1.addGuest(guest1);
        assertEquals(1, bedroom1.getCollectionOfGuestSize());
    }





}
