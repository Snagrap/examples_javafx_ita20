package ee.khk;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.*;
import javafx.scene.Parent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.text.Text;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javax.swing.*;
import java.io.IOException;
import javafx.scene.layout.FlowPane;
import javafx.geometry.Insets;

public class Main extends Application{

    public static void main(String[] args) {
        Application.launch(args);
    }


    @Override
    public void start(Stage stage) throws Exception {
        ToggleButton lightBtn = new ToggleButton("Lights");
        Label stateLbl = new Label();
        lightBtn.setOnAction(event -> {
            if(lightBtn.isSelected()) {
                stateLbl.setText("Lights on!");
            }
            else{
                stateLbl.setText("Lights off...");
            }
        });

        FlowPane root = new FlowPane(10, 10);
        root.getChildren().addAll(lightBtn, stateLbl);
        root.setPadding(new Insets(10));
        Scene scene = new Scene(root, 250, 200);
        stage.setScene(scene);
        stage.setTitle("Hello JavaFX");
        stage.show();

    }

}