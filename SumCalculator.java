import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SumCalculator extends Application {
@Override
public void start(Stage primaryStage) {
TextField num1Field = new TextField();
num1Field.setPromptText("Enter first number");
TextField num2Field = new TextField();
num2Field.setPromptText("Enter second number");

TextField resultField = new TextField();
resultField.setEditable(false); 

Button calculateButton = new Button("Calculate Sum");

calculateButton.setOnAction(event -> {
try {

    double num1 = Double.parseDouble(num1Field.getText());
    double num2 = Double.parseDouble(num2Field.getText());

resultField.setText(String.valueOf(num1 + num2));
} catch (NumberFormatException e) {

resultField.setText("Invalid input!");
}
});

VBox vbox = new VBox(10, num1Field, num2Field, calculateButton, resultField);

Scene scene = new Scene(vbox, 300, 200);
primaryStage.setScene(scene);
primaryStage.setTitle("Sum Calculator");
primaryStage.show();
}
public static void main(String[] args) {
launch(args);
}
}