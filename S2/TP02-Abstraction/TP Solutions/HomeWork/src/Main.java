public class Main {
    public static void main(String[] args) {
        RegularStudent regularStudent = new RegularStudent(1001, "John", 80, 90, 85);
        HonorStudent honorStudent = new HonorStudent(1002, "Alice", 95, 85, 90);

        GradeManagementSystem gradeManagementSystem = new GradeManagementSystem();
        gradeManagementSystem.addStudent(regularStudent);
        gradeManagementSystem.addStudent(honorStudent);

        gradeManagementSystem.displayStudentDetails();

        System.out.println("Overall Average Grade: " +
                gradeManagementSystem.calculateOverallAverageGrade());
    }
}
