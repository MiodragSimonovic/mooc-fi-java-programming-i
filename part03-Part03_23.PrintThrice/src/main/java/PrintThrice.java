
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        
        System.out.print("Give a word: ");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        
        scanner.close();

        System.out.println(word + word + word);

    }
    
}