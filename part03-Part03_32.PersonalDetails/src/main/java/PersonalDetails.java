
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        
        String longestName = "";
        int sum = 0;
        int counter = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] pieces = input.split(",");
            String name = pieces[0];
            if (name.length() > longestName.length()) {
                longestName = name;
            }
            int birthYear = Integer.valueOf(pieces[1]);
            sum += birthYear;
            counter++;
        }
        
        scanner.close();
        
        System.out.println("Longest name: " + longestName);
        double average = (double) sum / counter;
        System.out.println("Average of the birth years: " + average);

    }
}