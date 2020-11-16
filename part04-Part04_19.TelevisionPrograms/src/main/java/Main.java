import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Name: ");
            String programName = scanner.nextLine();
            if (programName.equals("")) {
                break;
            }
            System.out.print("Duration: ");
            int programDuration = Integer.valueOf(scanner.nextLine());
            programs.add(new TelevisionProgram(programName, programDuration));
        }
        
        System.out.println("");
        
        System.out.println("Program's maximum duration? ");
        int programMaximumDuration = Integer.valueOf(scanner.nextLine());
        
        scanner.close();
        
        for (TelevisionProgram program: programs) {
            if (program.getDuration() <= programMaximumDuration) {
                System.out.println(program);
            }
        }

    }
    
}
