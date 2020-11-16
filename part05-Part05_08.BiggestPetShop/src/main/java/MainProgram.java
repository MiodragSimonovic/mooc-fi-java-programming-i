
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {

        Pet hulda = new Pet("Hulda", "golden retriever");
        Person leo = new Person("Leo", hulda);

        System.out.println(leo);
        
    }
    
}
