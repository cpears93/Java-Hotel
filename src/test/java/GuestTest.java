import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest;

    @Before
    public void setUp() {
        guest = new Guest("Tam");
    }

    @Test
    public void guestHasName(){
        assertEquals("Tam", guest.getName());
    }

}
