import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    private Booking booking1;
    private Bedroom bedroom1;

    @Before
    public void before() {
        bedroom1 = new Bedroom(1, 1, "Single", 65.00);
        booking1 = new Booking(bedroom1, 3);
    }

    @Test
    public void canGetRoom() {
        assertEquals(bedroom1, booking1.getBedroom());
    }

    @Test
    public void canGetNumberOfNights() {
        assertEquals(3, booking1.getNights());
    }

    @Test
    public void canGetTotalBill() {
        assertEquals(195.00, booking1.getTotalBill(), 0.01);
    }

}
