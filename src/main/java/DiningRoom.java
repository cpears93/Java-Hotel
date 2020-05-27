import java.util.ArrayList;

public class DiningRoom {

    private String name;
    private ArrayList<Guest> collectionOfGuests;

    public DiningRoom(String name) {
        this.name = name;
        this.collectionOfGuests = new ArrayList<Guest>();
    }

    public String getName() {
        return this.name;
    }

    public int getCollectionOfGuests() {
        return collectionOfGuests.size();
    }
}
