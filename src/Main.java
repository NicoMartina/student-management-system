public class Main {
    public static void main(String[] args) {
        Classroom classroomPractice = new Classroom("Computer Science 101", null);
        Student s1 = new Student("Nico", 1, null);
        s1.addGrade(95);
        s1.addGrade(99);
        s1.addGrade(90);

        Student s2 = new Student("Maru", 2, null);
        s2.addGrade(75);
        s2.addGrade(70);
        s2.addGrade(68);

        Student s3 = new Student("German", 3, null);
        s3.addGrade(95);
        s3.addGrade(92);
        s3.addGrade(97);

        classroomPractice.addStudent(s1);
        classroomPractice.addStudent(s2);
        classroomPractice.addStudent(s3);

        classroomPractice.listAllStudents();

        System.out.printf("Class Average: %.2f%n", classroomPractice.classAverage());
        classroomPractice.findTopStudent();


    }
}
