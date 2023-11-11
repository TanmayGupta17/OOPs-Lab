package javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ComboBoxRadioButtonExample extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("ComboBox and RadioButtons Example");

        // Create ComboBox
        ComboBox<String> comboBox = new ComboBox<>();
        comboBox.getItems().addAll("Male", "Female", "others");
        comboBox.setPromptText("Select your preference");

        // Create RadioButtons
        ToggleGroup toggleGroup = new ToggleGroup();
        RadioButton radioButton1 = new RadioButton("Radio 1");
        radioButton1.setToggleGroup(toggleGroup);
        RadioButton radioButton2 = new RadioButton("Radio 2");
        radioButton2.setToggleGroup(toggleGroup);
        RadioButton radioButton3 = new RadioButton("Radio 3");
        radioButton3.setToggleGroup(toggleGroup);

        // Create Label to display selected options
        Label resultLabel = new Label();

        // Set actions for ComboBox and RadioButtons
        comboBox.setOnAction(e -> {
            String selectedOption = comboBox.getValue();
            resultLabel.setText("Selected ComboBox option: " + selectedOption);
        });

        toggleGroup.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {
            if (toggleGroup.getSelectedToggle() != null) {
                String selectedRadioButton = ((RadioButton) toggleGroup.getSelectedToggle()).getText();
                resultLabel.setText("Selected RadioButton: " + selectedRadioButton);
            }
        });

        // Create layout
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(10));
        layout.getChildren().addAll(comboBox, radioButton1, radioButton2, radioButton3, resultLabel);

        // Create scene
        Scene scene = new Scene(layout, 300, 200);

        // Set the scene
        primaryStage.setScene(scene);

        // Show the stage
        primaryStage.show();
    }
}
