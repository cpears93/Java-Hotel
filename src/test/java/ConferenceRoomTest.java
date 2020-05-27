import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    private ConferenceRoom room1;

    @Before
    public void setup(){
        room1 = new ConferenceRoom(5, "Argyle Suite");
    }

    @Test
    public void canGetCapacity(){
        assertEquals(5, room1.getCaoacity());
    }

    @Test
    public void canGetName(){
        assertEquals("Argyle Suite", room1.name());
    }

    @Test
    public void canGeGuestSize(){
        assertEquals(0, room1.getGuestSize());
    }

}
