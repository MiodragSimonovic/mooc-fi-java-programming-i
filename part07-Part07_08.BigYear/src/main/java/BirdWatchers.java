
import java.util.ArrayList;


public class BirdWatchers {
    
    private ArrayList<Bird> birds;

    public BirdWatchers() {
        birds = new ArrayList<>();
    }
    
    public void add(String name, String nameInLatin) {
        birds.add(new Bird(name, nameInLatin));
    }
    
    public boolean obeservation(String name) {
        for (Bird bird: birds) {
            if (bird.getName().equals(name)) {
                bird.addObservation();
                return true;
            }
        }
        System.out.println("Not a bird!");
        return false;
    }
    
    public void printAll() {
        for (Bird bird: birds) {
            System.out.println(bird);
        }
    }
    
    public void printOne(String name) {
        for (Bird bird: birds) {
            if (bird.getName().equals(name)) {
                System.out.println(bird);
            }
        }
    }
    
}
