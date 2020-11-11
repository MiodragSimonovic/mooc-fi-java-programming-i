
import java.util.ArrayList;


public class Hold {
    
    private int maximumWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        suitcases = new ArrayList<>();
    }
    
    public int totalWeight() {
        int holdTotalWeight = 0;
        for (Suitcase suitcase: suitcases) {
            holdTotalWeight += suitcase.totalWeight();
        }
        return holdTotalWeight;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if (totalWeight() + suitcase.totalWeight() <= maximumWeight) {
            suitcases.add(suitcase);
        }        
    }
    
    @Override
    public String toString() {
        return suitcases.size() + " suitcases (" + totalWeight() + " kg)";
    }
    
    public void printItems() {
        for (Suitcase suitcase: suitcases) {
            suitcase.printItems();
        }
    }
    
}
