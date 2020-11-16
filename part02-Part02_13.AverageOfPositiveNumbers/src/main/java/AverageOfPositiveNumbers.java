
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int counter = 0;
        int sum = 0;
        
        while(true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            }
            if (number > 0) {
                counter++;
                sum += number;
            }
        }
        
        scanner.close();
        
        if (counter == 0) {
            System.out.println("Cannot calculate the average");
        }
        double average = (double) sum / counter;
        System.out.println("Average of the numbers: " + average);

    }
    
}
