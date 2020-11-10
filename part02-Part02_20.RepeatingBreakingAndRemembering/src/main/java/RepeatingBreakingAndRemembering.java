
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {       
        
        int sum = 0;
        int counter = 0;
        double average = 0;
        int even = 0;
        int odd = 0;
        
        System.out.println("Give numbers:");
        Scanner scanner = new Scanner(System.in);        
        
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                System.out.println("Thx! Bye!");
                break;
            }
            sum += number;
            counter++;
            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        
        scanner.close();
        
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + counter);
        average = (double) sum / counter;
        System.out.println("Average: " + average);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
        
    }
}
