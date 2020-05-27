import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> collectionOfRooms;

    public Hotel() {
        this.collectionOfRooms = new ArrayList<Bedroom>();
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
}
