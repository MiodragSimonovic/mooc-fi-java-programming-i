
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> indexes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {            
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 9_999) {
                break;
            }
            list.add(number);
        }

        scanner.close();
        
        int smallestNumber = list.get(0);
        
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < smallestNumber) {
                smallestNumber = list.get(i);
            }
        }
        
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == smallestNumber) {
                indexes.add(i);
            }
        }
        
        System.out.println("Smallest number: " + smallestNumber);
        for (int i = 0; i < indexes.size(); i++) {
            System.out.println("Found at index: " + indexes.get(i));
        }
        
    }
}
