
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        
        ArrayList<Book> books = new ArrayList<>();
        
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            System.out.print("Title: ");
            String bookTitle = scanner.nextLine();
            if (bookTitle.equals("")) {
                break;
            }
            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.print("Publication year: ");
            int publicationYear = Integer.valueOf(scanner.nextLine());
            
            books.add(new Book(bookTitle, pages, publicationYear));
        }
        
        System.out.println("");
        
        System.out.print("What information will be printed? ");
        String information = scanner.nextLine();
        
        scanner.close();
        
        if (information.equals("everything")) {
            for (Book book: books) {
                System.out.println(book);
            }
        }
        if (information.equals("name")) {
            for (Book book: books) {
                System.out.println(book.getTitle());
            }
        }
    }
    
}
