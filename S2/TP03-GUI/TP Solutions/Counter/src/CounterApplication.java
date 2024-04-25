import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import javafx.scene.control.Label;

public class CounterApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    private int countValue = 0;
    private TextField countTextField;
    @Override
    public void start(Stage primaryStage) {
        Label countLabel = new Label("Counts");
        countTextField = new TextField(String.valueOf(countValue));
        Button countButton = new Button("Count");
        Button restButton = new Button("Reset");
        restButton.setOnAction(e->restCount());
        countButton.setOnAction(e->incrementCount());
        HBox root = new HBox(15);
        root.getChildren().addAll(countLabel, countTextField, countButton, restButton);
        root.setPadding(new Insets(15));
        Scene scene = new Scene(root);



        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }
    private void incrementCount(){
        try {
            countValue = Integer.parseInt(countTextField.getText());
            countValue++;
            countTextField.setText(String.valueOf(countValue));
        }catch (NumberFormatException e){
            countTextField.setText("0");
        }
    }
    private void restCount(){
        countTextField.setText("0");
    }
}
