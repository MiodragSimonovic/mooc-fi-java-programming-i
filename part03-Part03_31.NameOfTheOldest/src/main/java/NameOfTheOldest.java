
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        int oldestAge = 0;
        String oldest = null;
        
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] pieces = input.split(",");            
            int age = Integer.valueOf(pieces[1]);
            if (age > oldestAge) {
                oldestAge = age;
                oldest = pieces[0];
            }
        }

        scanner.close();
        
        System.out.println("Name of the oldest: " + oldest);
        
    }
}