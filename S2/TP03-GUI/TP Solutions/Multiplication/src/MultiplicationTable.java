import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class MultiplicationTable extends Application {
    // Declare UI components
    private TextField numberField;
    private ComboBox<Integer> numberComboBox;
    private TextArea resultArea;

    @Override
    public void start(Stage primaryStage) {

        // Create labels and input fields
        Label numberInputLabel = new Label("Enter a number:");
        numberField = new TextField("5");

        // Create a ComboBox to allow the user to select a number
        Label numberComboLabel = new Label("Select a number:");
        numberComboBox = new ComboBox<>();
        numberComboBox.getItems().addAll(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numberComboBox.getSelectionModel().selectFirst(); // Select 1 by default

        // Create a button to generate the multiplication table
        Button generateButton = new Button("Generate Table");
        generateButton.setOnAction(e -> generateTable());

        // Create a horizontal box to arrange input components
        HBox inputBox = new HBox(10, numberInputLabel, numberField, numberComboLabel, numberComboBox, generateButton);
        inputBox.setPadding(new Insets(10));

        // Create a text area to display the multiplication table
        resultArea = new TextArea();
        resultArea.setEditable(false);

        // Create a vertical box to arrange the input box and result area
        VBox root = new VBox(10, inputBox, resultArea);
        root.setPadding(new Insets(10));

        // Create a scene with the root node
        Scene scene = new Scene(root);

        // Set the stage properties
        primaryStage.setTitle("Multiplication Table Generator");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    // Method to generate and display the multiplication table
    private void generateTable() {
        resultArea.clear(); // Clear previous results
        try {
            int number = Integer.parseInt(numberField.getText()); // Get the number from the text field

            // Generate the multiplication table based on the selected number from the combo box
            for (int i = 1; i <= numberComboBox.getValue(); i++) {
                int result = number * i;
                resultArea.appendText(number + " x " + i + " = " + result + "\n");
            }
        } catch (NumberFormatException e) {
            resultArea.setText("Error: Please enter a valid number."); // Display error for invalid input
        }
    }

    // Main method to launch the application
    public static void main(String[] args) {
        launch(args);
    }
}