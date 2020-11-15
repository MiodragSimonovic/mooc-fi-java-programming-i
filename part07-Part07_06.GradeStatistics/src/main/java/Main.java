
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Grades grades = new Grades();
        
        Scanner scanner = new Scanner(System.in);
        
        UserInterface ui = new UserInterface(grades, scanner);
        ui.start();
        
        scanner.close();
        
    }
    
}
