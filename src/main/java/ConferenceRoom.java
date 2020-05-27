import java.util.ArrayList;

public class ConferenceRoom {

    public String name;
    private int capacity;
    private ArrayList<Guest> collectionOfGuests;

    public ConferenceRoom(int capacity, String name) {
        this.capacity = capacity;
        this.collectionOfGuests = new ArrayList<Guest>();
        this.name = name;
    }

    public int getCaoacity() {
        return this.capacity;
    }

    public String name() {
        return this.name;
    }

    public int getGuestSize() {
        return this.collectionOfGuests.size();
    }
}
