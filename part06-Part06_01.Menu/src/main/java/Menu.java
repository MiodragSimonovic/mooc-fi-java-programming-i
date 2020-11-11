
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    public boolean isInMenu(String compared) {
        if (meals.contains(compared)) {
            return true;
        }
        return false;
    }
    
    public void addMeal(String meal) {
        if (!isInMenu(meal)) {
            meals.add(meal);
        }
        
    }
    
    public void printMeals() {
        for (String meal: meals) {
            System.out.println(meal);
        }
    }
    
    public void clearMenu() {
        meals.clear();
    }
    
}