
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString() {
        String printMessage = "The collection " + name;
        if (elements.isEmpty()) {    
            return printMessage + " is empty.";
        }
       
        String allElementsPrinted = "";
        for (String element: elements) {
            allElementsPrinted += element + "\n";
        }
        if (elements.size() == 1) {
            return printMessage + " has " + elements.size() + " element:\n" + elements.get(0);
        }
        return printMessage + " has " + elements.size() + " elements:\n" + allElementsPrinted;
    }
    
}
