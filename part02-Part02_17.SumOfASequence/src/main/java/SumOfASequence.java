
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);        
        
        System.out.print("Last number? ");        
        int lastNumber = Integer.valueOf(scanner.nextLine());        
        
        scanner.close();
        
        int sum = 0;
        
        for (int i = 0; i <= lastNumber; i++) {
            sum += i;
        }
        
        System.out.println("The sum is " + sum);

    }
}
