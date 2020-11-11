
import java.util.Scanner;


public class TextUI {
    
    private Scanner scanner;
    private SimpleDictionary simpleDictionary;

    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }
    
    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (command.equals("add")) {
                System.out.print("Word: ");
                String word = scanner.nextLine();
                System.out.print("Translation: ");
                String translation = scanner.nextLine();
                simpleDictionary.add(word, translation );
            } else if (command.equals("search")) {
                System.out.print("To be translated: ");
                String wordForTranslation = scanner.nextLine();
                if (simpleDictionary.translate(wordForTranslation) == null) {
                    System.out.println("Word " + wordForTranslation + " was not found");
                } else {
                    System.out.println("Translation: " + simpleDictionary.translate(wordForTranslation));
                }
            } else {
                System.out.println("Unknown command");
            }
        }
    }
    
}