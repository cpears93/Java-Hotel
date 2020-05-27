import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom1;

    @Before
    public void setup(){
        bedroom1 = new Bedroom(1, 1, "Single");
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



}
