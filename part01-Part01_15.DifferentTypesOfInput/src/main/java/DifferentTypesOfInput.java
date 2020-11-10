
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a string: ");
        String stringValue = scan.nextLine();
        System.out.println("Give an integer: ");
        int integerValue = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double: ");
        double doubleValue = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean: ");
        boolean booleanValue = Boolean.valueOf(scan.nextLine());
        
        scan.close();
        
        System.out.println("You gave the string " + stringValue + "\n" +
                           "You gave the integer " + integerValue + "\n" +
                           "You gave the double " + doubleValue + "\n" +
                           "You gave the boolean " + booleanValue);       

    }
    
}