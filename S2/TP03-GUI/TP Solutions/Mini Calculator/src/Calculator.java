import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.text.DecimalFormat;

public class Calculator extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    // Declare our global UI controls (Labels, ToggleGroup and TextField)
    private TextField num1Field;
    private TextField num2Field;
    private final Label resultLabel = new Label();
    private final ToggleGroup operations= new ToggleGroup();

    @Override
    public void start(Stage primaryStage) {
        // Declare the remaining UI Controls (Labels,Button and TextFields)
        Label num1Label = new Label("Number 1");
        Label num2Label = new Label("Number 2");
        num1Field = new TextField();
        num2Field = new TextField();
        Button calculateButton = new Button("Calculate");

        calculateButton.setOnAction(e->calculate());
        // Declare and Create our RadioButton's
        RadioButton addButton = new RadioButton("+");
        addButton.setSelected(true);// Select "+" by default
        RadioButton subtractButton = new RadioButton("-");
        RadioButton multiplyButton = new RadioButton("*");
        RadioButton divideButton = new RadioButton("/");

        // Group RadioButton's together
        addButton.setToggleGroup(operations);
        subtractButton.setToggleGroup(operations);
        multiplyButton.setToggleGroup(operations);
        divideButton.setToggleGroup(operations);


        // Create a vertical box (VBox) to arrange buttons vertically (layout)
        VBox operationBox = new VBox(5,addButton,subtractButton,multiplyButton,divideButton);


        // Using GridPane Layout to organizing components in a grid-like structure.
        GridPane grid = new GridPane();
        grid.setVgap(10);
        grid.setHgap(10);

        grid.setPadding(new Insets(10));

        grid.add(num1Label,0,0);
        grid.add(num1Field,1,0);
        grid.add(num2Label,0,1);
        grid.add(num2Field,1,1);

        grid.add(operationBox, 2,0,1,2);

        grid.add(calculateButton,0,2);
        grid.add(new Label("Result: "),0,3);
        grid.add(resultLabel,1,3);


        // Uncomment the following code to change the arrangement of the components and comment the code above
        //grid.addRow(0,num1Label,num1Field);
        //grid.addRow(1,num2Label, num2Field);
        //grid.addRow(2,operationBox);
        //grid.addRow(3,calculateButton );
        //grid.addRow(4,new Label("Result: "),resultLabel);



        Scene scene = new Scene(grid); // Create a scene using the GridPane layout.
        primaryStage.setScene(scene); // Set the scene to be displayed in the primaryStage.
        primaryStage.setTitle("Mini Calculator"); // Set the title of the primaryStage to "Mini Calculator".
        primaryStage.setResizable(false); // Make the primaryStage un-resizable (not resizable by the user).
        primaryStage.show(); // Display the primaryStage with the configured scene and properties.

    }

    private void calculate(){
        try {
            // Get the numbers from the text fields and parse them as doubles.
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            double result;

            // Check if an operation is selected; display an error if not.
            // and since we make the "+" by default selected the following is not really necessary
            if (operations.getSelectedToggle() == null) {
                resultLabel.setText("Error: Please select an operation");
                return;
            }


            // Get the selected operation (+, -, *, or /).
            String operation = ((RadioButton) operations.getSelectedToggle()).getText();

            switch (operation) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    // Check if the divisor is not zero
                    if (num2 == 0) {
                        resultLabel.setText("Error: Division by zero");
                        return;
                    }
                    result = num1 / num2;
                    break;
                default:
                    result = 0; // Default to 0 if the operation is not recognized
            }

            // Format the result and display it in the resultLabel.
            DecimalFormat decimalFormat = new DecimalFormat("#.####");
            resultLabel.setText(String.valueOf(decimalFormat.format(result)));

        }catch (ArithmeticException e){
            resultLabel.setText("Error: invalid operation");
        }catch (NumberFormatException e){
            resultLabel.setText("Error: invalid input");
        }
    }
}
