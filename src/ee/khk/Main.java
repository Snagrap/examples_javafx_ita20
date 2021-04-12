package ee.khk;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Parent;
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

import java.io.IOException;

public class Main extends Application{
    public static void main(String[] args) {
        System.out.println("Launching Application");
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {

        BorderPane root = new BorderPane();
        Button top = new Button("Top");
        BorderPane.setAlignment(top, Pos.CENTER);
        root.setTop(top);
        Button center = new Button("Center");
        root.setCenter(center);


        Scene scene = new Scene(root, 300, 150);
        stage.setScene(scene);
        stage.setTitle("BorderPane in JavaFX");
        stage.show();

    }

}