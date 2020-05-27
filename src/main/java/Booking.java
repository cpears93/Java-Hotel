public class Booking {

    private int numberOfNights;
    private Bedroom bedroom;

    public Booking(Bedroom bedroom, int numberOfNights){
        this.bedroom = bedroom;
        this.numberOfNights = numberOfNights;
    }

    public Bedroom getBedroom() {
        return this.bedroom;
    }

    public int getNights() {
        return this.numberOfNights;
    }
}
