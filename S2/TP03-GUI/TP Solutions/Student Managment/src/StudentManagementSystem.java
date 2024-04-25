import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class StudentManagementSystem extends Application {
    public static void main(String[] args) {
        launch(args); // Launch the application
    }

    // Declare UI components
    private TextField nameField;
    private TextField lastNameField;
    private TextField ageField;
    private TextField villeField;
    private ListView<String> studentListView;
    private ObservableList<String> studentList;
    private TextField searchField;

    // Override the start method to set up the UI
    @Override
    public void start(Stage primaryStage) {
        // Initialize the list view and observable list for students
        studentList = FXCollections.observableArrayList();
        studentListView = new ListView<>(studentList);
        studentListView.setPrefSize(200, 200);

        // Create form elements (labels, text fields, buttons)
        Label nameLabel = new Label("Name:");
        nameField = new TextField();
        Label prenomLabel = new Label("Last Name:");
        lastNameField = new TextField();
        Label ageLabel = new Label("Age:");
        ageField = new TextField();
        Label villeLabel = new Label("Ville:");
        villeField = new TextField();

        // Create search field
        searchField = new TextField();
        searchField.setPromptText("Search by Name");

        // Create buttons for adding, modifying, and deleting students
        Button addButton = new Button("Add Student");
        addButton.setOnAction(e -> addStudent());
        Button modifyButton = new Button("Modify Student");
        modifyButton.setOnAction(e -> modifyStudent());
        Button deleteButton = new Button("Delete Student");
        deleteButton.setOnAction(e -> deleteStudent());
        Button searchButton = new Button("Search");
        searchButton.setOnAction(e -> searchStudent());

        // Create form layout using a grid pane
        GridPane formGrid = new GridPane();
        formGrid.setHgap(10);
        formGrid.setVgap(5);
        formGrid.addRow(0, nameLabel, nameField);
        formGrid.addRow(1, prenomLabel, lastNameField);
        formGrid.addRow(2, ageLabel, ageField);
        formGrid.addRow(3, villeLabel, villeField);

        // Create layout for buttons and search field
        HBox buttonBox = new HBox(10, addButton, modifyButton, deleteButton);
        HBox searchBox = new HBox(10, searchField, searchButton);

        // Create main layout using a vertical box
        VBox mainBox = new VBox(10, formGrid, buttonBox, searchBox, studentListView);
        mainBox.setPadding(new Insets(10));

        // Create scene and set stage properties
        Scene scene = new Scene(mainBox, 400, 400);
        primaryStage.setTitle("Student Management System");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    // Method to add a new student to the list
    private void addStudent() {
        // Get student information from text fields
        String name = nameField.getText();
        String lastName = lastNameField.getText();
        String age = ageField.getText();
        String ville = villeField.getText();

        // Check if all fields are filled before adding the student
        if (!name.isEmpty() && !lastName.isEmpty() && !age.isEmpty() && !ville.isEmpty()) {
            String studentInfo = name + " " + lastName + ", Age: " + age + ", Ville: " + ville;
            studentList.add(studentInfo); // Add student to the list
            clearFields(); // Clear input fields
        } else {
            showAlert(Alert.AlertType.WARNING, "Incomplete Information", "Please fill in all fields.");
        }
    }

    // Method to modify an existing student's information
    private void modifyStudent() {
        int selectedIndex = studentListView.getSelectionModel().getSelectedIndex();
        if (selectedIndex >= 0) {
            // Get student information from text fields
            String name = nameField.getText();
            String lastName = lastNameField.getText();
            String age = ageField.getText();
            String ville = villeField.getText();

            // Check if all fields are filled before modifying the student
            if (!name.isEmpty() && !lastName.isEmpty() && !age.isEmpty() && !ville.isEmpty()) {
                String studentInfo = name + " " + lastName + ", Age: " + age + ", Ville: " + ville;
                studentList.set(selectedIndex, studentInfo); // Modify student in the list
                clearFields(); // Clear input fields
            } else {
                showAlert(Alert.AlertType.WARNING, "Incomplete Information", "Please fill in all fields.");
            }
        } else {
            showAlert(Alert.AlertType.WARNING, "No Selection", "Please select a student to modify.");
        }
    }

    // Method to delete a student from the list
    private void deleteStudent() {
        int selectedIndex = studentListView.getSelectionModel().getSelectedIndex();
        if (selectedIndex >= 0) {
            studentList.remove(selectedIndex); // Remove selected student from the list
            clearFields(); // Clear input fields
        } else {
            showAlert(Alert.AlertType.WARNING, "No Selection", "Please select a student to delete.");
        }
    }

    // Method to search for a student by name
    private void searchStudent() {
        String searchName = searchField.getText();
        if (!searchName.isEmpty()) {
            for (String studentInfo : studentList) {
                if (studentInfo.startsWith(searchName + " ")) {
                    showAlert(Alert.AlertType.INFORMATION, "Search Result", "Student Found: " + studentInfo);
                    return;
                }
            }
            showAlert(Alert.AlertType.INFORMATION, "Search Result", "Student Not Found.");
        } else {
            showAlert(Alert.AlertType.WARNING, "Incomplete Information", "Please enter a name to search.");
        }
    }

    // Method to clear all input fields
    private void clearFields() {
        nameField.clear();
        lastNameField.clear();
        ageField.clear();
        villeField.clear();
    }

    // Method to display an alert message
    private void showAlert(Alert.AlertType alertType, String title, String content) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }
}