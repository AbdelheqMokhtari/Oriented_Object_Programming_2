public class HonorStudent extends Student {
    private double projectScores;
    private double researchPapers;
    private double examScores;

    public HonorStudent(int studentID, String studentName, double projectScores, double
            researchPapers, double examScores) {
        super(studentID, studentName);
        this.projectScores = projectScores;
        this.researchPapers = researchPapers;
        this.examScores = examScores;
    }

    @Override
    public double calculateGrade() {
// Calculate grade based on project scores, research papers, and exam scores
        return (projectScores * 0.3) + (researchPapers * 0.4) + (examScores * 0.3);
    }

    @Override
    public void displayDetails() {
        System.out.println("Honor Student Details:");
        System.out.println("ID: " + studentID);
        System.out.println("Name: " + studentName);
        System.out.println("Project Scores: " + projectScores);
        System.out.println("Research Papers: " + researchPapers);
        System.out.println("Exam Scores: " + examScores);
        System.out.println("Grade: " + calculateGrade());
    }
}
