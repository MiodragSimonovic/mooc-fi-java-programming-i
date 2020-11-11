
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    
    public int price() {
        return squares * pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared) {        
        return this.squares > compared.squares;
    }
    
    public int priceDifference(Apartment compared) {
        int priceDifference = this.price() - compared.price();
        if (compared.price() > this.price()) {
            return  - 1 * priceDifference;
        }
        return priceDifference;
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        return this.price() > compared.price();
    }   

}