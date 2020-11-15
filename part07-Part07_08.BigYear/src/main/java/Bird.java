
public class Bird {
    
    private String name;
    private String nameInLatin;
    private int observation;

    public Bird(String name, String nameInLatin) {
        this.name = name;
        this.nameInLatin = nameInLatin;
    }    

    public String getName() {
        return name;
    }

    public String getNameInLatin() {
        return nameInLatin;
    }

    @Override
    public String toString() {
        return name + " (" + nameInLatin + "): " + observation + " observations";
    }
    
    public void addObservation() {
        observation++;
    }
    
}
