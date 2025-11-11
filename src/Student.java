import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int id;
    private List<Double> grades;


    public Student(String name, int id, List<Double> grades ) {
        this.name = name;
        this.id = id;
        this.grades = (grades != null) ? grades : new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public int getId() {
            return id;
        }

    public void addGrade(double grade) {
        if (grade < 0 || grade> 100) {
            System.out.println("Invalid grade. Please try again.");
        } else {
            grades.add(grade);
            System.out.println("Grade " + grade + " added successfully!");
        }

    }

    public double averageGrade() {
        double total = 0.0;
        if (grades.isEmpty()){
            System.out.println("No grade available for " + getName());
            return 0.0;
        }
        for (double g : grades) {
            total += g;
        }
        double average = total / grades.size();
        return average;
    }

    public String getLetterGrade() {
        double avg = averageGrade();

        if (avg >= 97) return "A+";
        else if (avg >= 93) return "A";
        else if (avg >= 90) return "A-";
        else if (avg >= 87) return "B+";
        else if (avg >= 83) return "B";
        else if (avg >= 80) return "B-";
        else if (avg >= 77) return "C+";
        else if (avg >= 73) return "C";
        else if (avg >= 70) return "C-";
        else if (avg >= 67) return "D+";
        else if (avg >= 63) return "D";
        else if (avg >= 60) return "D-";
        else return "F";
    }
    public boolean hasPassed() {
            return !getLetterGrade().equals("F");
        }

    public void displayInfo() {
        System.out.println("----------------------------------------");
        System.out.println("Student: " + name + " (ID: " + id + ")");
        System.out.println("Grades: " + grades);

        double average = averageGrade();
        System.out.printf("Final Average: %.2f%n", average);

        String letterGrade = getLetterGrade();
        System.out.println("Final Grade: " + letterGrade);

        boolean passed = hasPassed();
        System.out.println("Status: " + (passed ? "Passed ✅" : "Failed ❌"));

        System.out.println("----------------------------------------");
    }


}


