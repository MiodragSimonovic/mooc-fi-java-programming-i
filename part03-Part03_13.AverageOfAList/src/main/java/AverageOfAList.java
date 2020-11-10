
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }
            list.add(number);
        }
        
        scanner.close();
        
        for (int number: list) {
            sum += number;
        }
        
        double average = (double) sum / list.size();
        System.out.println("Average: " + average);
        
    }
}