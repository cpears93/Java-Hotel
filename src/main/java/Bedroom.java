import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private int capacity;
    private ArrayList<Guest> collectionOfGuests;
    private String type;

    public Bedroom(int roomNumber, int capacity, String type) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.collectionOfGuests = new ArrayList<Guest>();
        this.type = type;
    }

    public int getRoomNumber(){
        return this.roomNumber;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public int getCollectionOfGuestSize(){
        return this.collectionOfGuests.size();
    }

    public String getType(){
        return this.type;
    }

    public void addGuest(Guest guest) {
        this.collectionOfGuests.add(guest);
    }

    public void removeGuest(Guest guest) {
        int index = this.collectionOfGuests.indexOf(guest);
        this.collectionOfGuests.remove(index);
    }
}
