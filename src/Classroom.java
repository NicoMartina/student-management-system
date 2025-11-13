import java.util.ArrayList;
import java.util.List;

public class Classroom {
    String className;
    int id;
    List<Student> students;


   public Classroom(String className, List<Student> students) {
       this.className = className;
       this.students = (students != null) ? students : new ArrayList<>();
   }

   public void addStudent(Student student){
       students.add(student);
       System.out.println("Student " + student.getName() + " was added successfully");
   }

   public void removeStudent(int id){
       students.removeIf(student -> student.getId() == id);
       System.out.println("Student with ID " + id + " has been removed successfully");
   }

   public void listAllStudents() {
       if (students.isEmpty()) {
           System.out.println("The classroom is empty.");
       }
       for (Student s : students) {
           s.displayInfo();
       }
   }

   public double classAverage(){
        if (students.isEmpty()){
            System.out.println("No students in " + className);
            return 0.0;
        }
       double total = 0.0;
        for (Student s : students) {
            total += s.averageGrade();
        }
        return total / students.size();
   }

   public Student findTopStudent(){
       if (students.isEmpty()){
           System.out.println("No student in " + className);
           return null;
       }

       Student topStudent = null;
       double highestAverage = 0.0;

       for (Student s : students) {
           double avg = s.averageGrade();
           if (topStudent == null || avg > highestAverage) {
               topStudent = s;
               highestAverage = avg;
           }
       }

       System.out.println("TOp student in " + className + ":");
       topStudent.displayInfo();


       return topStudent;
   }
}
