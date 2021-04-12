package ee.khk;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.text.Text;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.io.IOException;

public class Main extends Application{
    public static void main(String[] args) {
        System.out.println("Launching Application");
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        Label label1 = new Label("Label1");
        Label label2 = new Label("Label2");

        FlowPane root = new FlowPane(10,10, label1,label2);
        root.setAlignment(Pos.CENTER);
        Scene scene = new Scene(root, 300, 150);
        stage.setScene(scene);

        stage.setTitle("FlowPane in JavaFX");

        stage.show();

    }

}