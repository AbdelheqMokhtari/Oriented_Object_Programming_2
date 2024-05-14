import java.util.ArrayList;

public class GradeManagementSystem {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void displayStudentDetails() {
        for (Student student : students) {
            student.displayDetails();
        }
    }

    public double calculateOverallAverageGrade() {
        double totalGrade = 0;
        for (Student student : students) {
            totalGrade += student.calculateGrade();
        }
        return totalGrade / students.size();
    }
}