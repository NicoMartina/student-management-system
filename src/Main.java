import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Classroom javaClass = new Classroom("Java Fundamental");
        Student s1 = new Student("Nico", 1, new ArrayList<>());
        s1.addGrade(95);
        s1.addGrade(90);
        Student s2 = new Student("Maru", 2, new ArrayList<>());
        s2.addGrade(88);

        javaClass.addStudent(s1);
        javaClass.addStudent(s2);

        javaClass.displayAllStudent();

        System.out.println("Class average: " + javaClass.calculate);
    }
}
