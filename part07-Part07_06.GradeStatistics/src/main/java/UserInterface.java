
import java.util.Scanner;


public class UserInterface {
    
    private Grades grades;
    private Scanner scanner;

    public UserInterface(Grades grades, Scanner scanner) {
        this.grades = grades;
        this.scanner = scanner;
    }
    
    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        while(true) {            
            int points = Integer.valueOf(scanner.nextLine());
            if (points == -1) {
                break;
            }
            if (points < 0 || points > 100) {
                System.out.println("Wrong input, entered points needs to be betwen 0 and 100");
            } else {
                grades.addGrade(points);
            }
        }
        System.out.println("Point average (all): " + grades.average());
        if (grades.getGradesPassed().size() > 0) {
            System.out.println("Point average (passing): " + grades.passingAverage());
        } else {
            System.out.println("Point average (passing): -");
        }
        System.out.println("Pass percentage: " + grades.passPercentage());
        grades.pointDistribution();
        
    }
    
}
