import java.util.ArrayList;

public class ConferenceRoom {

    private int capacity;
    private String name;
    private ArrayList<Guest> collectionOfGuests;

    public ConferenceRoom(int capacity, String name) {
        this.capacity = capacity;
        this.collectionOfGuests = new ArrayList<Guest>();
        this.name = name;
    }

}
