import java.util.ArrayList;

public abstract class Student {
    protected int studentID;
    protected String studentName;

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    abstract double calculateGrade();


    abstract void displayDetails();
}

