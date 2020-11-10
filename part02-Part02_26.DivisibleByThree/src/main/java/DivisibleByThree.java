
import java.util.Scanner;


public class DivisibleByThree {

    public static void main(String[] args) {
        
        System.out.println("Enter first number: ");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter second number: ");
        int secondNumber = Integer.valueOf(scanner.nextLine());
        scanner.close();
        divisibleByThreeInRange(firstNumber, secondNumber);

    }
    
    
    public static void divisibleByThreeInRange(int beginning, int end) {
        for (int i = beginning; i <= end; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

}