import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {

    private ArrayList<Bedroom> collectionOfRooms;
    private ArrayList<Booking> bookings;
    private HashMap<String, Integer> diningRooms;

    public Hotel() {
        this.collectionOfRooms = new ArrayList<Bedroom>();
        this.bookings = new ArrayList<Booking>();
        this.diningRooms = new HashMap<String, Integer>();
    }

    public int getCollectionSize() {
        return this.collectionOfRooms.size();
    }

    public void addRoom(Bedroom room) {
        this.collectionOfRooms.add(room);
    }

    public void checkInGuest(Bedroom room, Guest guest) {
        room.addGuest(guest);
    }

    public void checkOutGuest(Bedroom room, Guest guest) {
        room.removeGuest(guest);
    }

    public int getBookingSize() {
       return this.bookings.size();
    }

    public void addBooking(Booking booking) {
       this.bookings.add(booking);
    }

    public Booking bookRoom(Bedroom bedroom, int numberOfNights) {
        Booking booking = new Booking(bedroom, numberOfNights);
        addBooking(booking);
        return booking;
    }

    public int getDiningRoomSize() {
        return this.diningRooms.size();
    }

    public void addDiningRoom(DiningRoom diningRoom) {
        this.diningRooms.put(diningRoom.getName(), diningRoom.getCollectionOfGuests());
    }
}
