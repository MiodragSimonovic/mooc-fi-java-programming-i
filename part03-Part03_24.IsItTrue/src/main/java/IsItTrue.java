
import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        
        System.out.print("Give a string: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        
        scanner.close();
        
        if (text.equals("true")) {
            System.out.println("You got it right!");
        } else {
            System.out.println("Try again!");
        }

    }
    
}
