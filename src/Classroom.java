import java.util.ArrayList;
import java.util.List;

public class Classroom {

    private String className;
    private List<Student> students;

    public Classroom(String className) {
        this.className = className;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student: " + student.getName() + " added to " + className);
    }

    public void removeStudent(int id) {
        students.removeIf(student -> student.getId() == id);
        System.out.println("Student with ID " + id + "remove from " + className);
    }

    public void displayAllStudent() {
        System.out.println("\n=== " + className + " Student ===");
        for (Student s : students) {
            s.displayInfo();
        }
    }

    public double calculateClassAverage(){
        if (students.isEmpty()) {
            System.out.println("No students in" + className);
            return 0.0;
        }

        double total = 0.0;
        for (Student s : students) {
            total += s.averageGrade();
        }
        return total / students.size();
    }

    public Student findTopStudent(){
        if (students.isEmpty()) return null;

        Student top = students.get(0);

        for (Student s : students) {
            if (s.averageGrade() > top.averageGrade()) {
                top = s;
            }
        }
        return top;
    }
}
