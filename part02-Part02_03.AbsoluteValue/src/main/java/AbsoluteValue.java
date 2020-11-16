
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number = Integer.valueOf(scanner.nextLine());
        
        scanner.close();
        
        if (number < 0) {
            System.out.println(-1 * number);
        } else {
            System.out.println(number);
        }        

    }
    
}
