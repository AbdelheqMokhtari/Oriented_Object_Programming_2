public class RegularStudent extends Student {
    private double attendance;
    private double assignments;
    private double examScores;

    public RegularStudent(int studentID, String studentName, double attendance, double
            assignments, double examScores) {
        super(studentID, studentName);
        this.attendance = attendance;
        this.assignments = assignments;
        this.examScores = examScores;
    }

    @Override
    public double calculateGrade() {
    // Calculate grade based on attendance, assignments, and exam scores
        return (attendance * 0.2) + (assignments * 0.3) + (examScores * 0.5);
    }

    @Override
    public void displayDetails() {
        System.out.println("Regular Student Details:");
        System.out.println("ID: " + studentID);
        System.out.println("Name: " + studentName);
        System.out.println("Attendance: " + attendance);
        System.out.println("Assignments: " + assignments);
        System.out.println("Exam Scores: " + examScores);
        System.out.println("Grade: " + calculateGrade());
    }
}
