
import java.util.ArrayList;


public class Suitcase {
    
    private int maximumWeight;
    private ArrayList<Item> items;    

    public Suitcase(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.items = new ArrayList<>();
    }
    
    public int totalWeight() {
        int suitCaseWeight = 0;
        for (Item item: items) {
            suitCaseWeight += item.getWeight();
        }
        return suitCaseWeight;
    }
    
    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }
        Item heaviestItem = items.get(0);
        for (Item item: items) {
            if (item.getWeight() > heaviestItem.getWeight()) {
                heaviestItem = item;
            }
        }
        return heaviestItem;
    } 
    
    public void addItem(Item item) {
        if (totalWeight() + item.getWeight() <= maximumWeight) {
            items.add(item);
        }
    }
    
    public String toString() {
        if (items.size() == 0) {
            return "no items (" + totalWeight() + " kg)";
        }
        if (items.size() == 1) {
            return items.size() + " item (" + totalWeight() + " kg)";
        }
        return items.size() + " items (" + totalWeight() + " kg)";
    }
    
    public void printItems() {        
        for (Item item: items) {
            System.out.println(item);
        }
    }    
       
}
