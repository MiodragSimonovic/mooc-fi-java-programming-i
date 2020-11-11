
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {            
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.equals("")) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.equals("")) {
                break;
            }
            Item item = new Item(identifier, name);
            if (!(items.contains(item))) {
                items.add(item);
            }
        }
        
        scanner.close();
        
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i));        
        }

    }
}
