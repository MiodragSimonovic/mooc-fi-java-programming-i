
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        SimpleDictionary dictionary = new SimpleDictionary();       
        
        Scanner scanner = new Scanner(System.in);
        
        TextUI textUI = new TextUI(scanner, dictionary);
        textUI.start();
        
        scanner.close();
        
    }
    
}