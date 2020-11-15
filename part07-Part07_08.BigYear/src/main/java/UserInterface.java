
import java.util.Scanner;


public class UserInterface {
    
    private BirdWatchers birdwachers;
    private Scanner scanner;

    public UserInterface(BirdWatchers birdwachers, Scanner scanner) {
        this.birdwachers = birdwachers;
        this.scanner = scanner;
    }
    
    public void start() {
        while(true) {
            System.out.print("? ");
            String command = scanner.nextLine();
            if (command.equals("Quit")) {
                break;
            }
            if (command.equals("Add")) {
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Name in Latin: ");
                String nameInLatin = scanner.nextLine();
                birdwachers.add(name, nameInLatin);
            } else if (command.equals("Observation")) {
                System.out.print("Bird: ");
                String name = scanner.nextLine();
                birdwachers.obeservation(name);
            } else if (command.equals("All")) {
                birdwachers.printAll();
            } else if (command.equals("One")) {
                System.out.print("Name: ");
                String name = scanner.nextLine();
                birdwachers.printOne(name);
            } else {
                System.out.println("Error! Commands are:\n"
                                    + "\tAdd - adds a bird\n"
                                    + "\tObservation - adds an observation\n"
                                    + "\tAll - prints all birds\n"
                                    + "\tOne - prints one bird\n"
                                    + "\tQuit - ends the program"); 
                        
            }
        }
    }
    
}
