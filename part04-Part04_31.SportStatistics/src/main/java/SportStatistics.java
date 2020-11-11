
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        
        ArrayList<Match> matches = new ArrayList<>();
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File:");
        String fileName = scan.nextLine();        
        
        try (Scanner reader = new Scanner(Paths.get(fileName))) {
            while (reader.hasNextLine()) {
                String parts[] = reader.nextLine().split(",");
                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                int homeTeamPoints = Integer.valueOf(parts[2]);
                int visitingTeamPoints = Integer.valueOf(parts[3]);
                
                matches.add(new Match(homeTeam, visitingTeam, homeTeamPoints, visitingTeamPoints));
            }
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
        
        System.out.println("Team:");
        String team = scan.nextLine();
        
        scan.close();
        
        
        int games = 0;
        int wins = 0;
        int losses = 0;        
        for (Match match: matches) {
            int homeTeamPoints = match.getHomeTeamPoints();
            int visitingTeamPoints = match.getVisitingTeamPoints();
            if (match.getHomeTeam().equals(team)) {
                games++;
                if (homeTeamPoints > visitingTeamPoints) {
                    wins++;
                } else {
                    losses++;
                }
            }
            if (match.getVisitingTeam().equals(team)) {
                games++;
                if (visitingTeamPoints > homeTeamPoints) {
                    wins++;
                } else {
                    losses++;
                }
            }
        }
        
        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);        

    }

}