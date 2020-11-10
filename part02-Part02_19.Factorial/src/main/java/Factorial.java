
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);               
        
        System.out.print("Give a number: ");        
        int number = Integer.valueOf(scanner.nextLine());       
        
        scanner.close();
        
        int factorial = 1;
        
        if (number == 0) {
            factorial = 1;
        }
        
        for (int i = 1; i <= number; i++) {            
            factorial *= i;
        }
        
        System.out.print("Factorial: " + factorial);

    }
}
