import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> collectionOfRooms;
    private ArrayList<Booking> bookings;

    public Hotel() {
        this.collectionOfRooms = new ArrayList<Bedroom>();
        this.bookings = new ArrayList<Booking>();
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
}
