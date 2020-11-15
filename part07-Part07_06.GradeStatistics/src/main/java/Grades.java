
import java.util.ArrayList;

public class Grades {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> gradesPassed;

    public Grades() {
        grades = new ArrayList<>();
        gradesPassed = new ArrayList<>();
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public ArrayList<Integer> getGradesPassed() {
        return gradesPassed;
    }

    public void addGrade(int grade) {
        grades.add(grade);
        if (grade >= 50) {
            gradesPassed.add(grade);
        }
    }

    private double average(ArrayList<Integer> list) {
        int sum = 0;
        for (int intNumber : list) {
            sum += intNumber;
        }
        return (double) sum / list.size();
    }

    public double average() {
        return average(grades);
    }

    public double passingAverage() {
        return average(gradesPassed);
    }

    public double passPercentage() {
        return (double) 100 * gradesPassed.size() / grades.size();
    }

    private void pointDistribution(int grade, int begining, int end) {
        System.out.print(grade + ": ");
        for (int points : grades) {
            if (points >= begining && points <= end) {
                System.out.print("*");
            }
        }
        System.out.println("");
    }

    public void pointDistribution() {
        System.out.println("Grade distribution:");
        pointDistribution(5, 90, 100);
        pointDistribution(4, 80, 89);
        pointDistribution(3, 70, 79);
        pointDistribution(2, 60, 69);
        pointDistribution(1, 50, 59);
        pointDistribution(0, 0, 49);
    }

}
