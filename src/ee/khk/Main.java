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
import javafx.geometry.Insets;

import java.io.IOException;

public class Main extends Application{
    public static void main(String[] args) {
        System.out.println("Launching Application");
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {

        Label first = new Label("First");
        Label second = new Label("Second");
        Label third = new Label("Third");

        GridPane root = new GridPane();
        root.getColumnConstraints().add(new ColumnConstraints(80));
        ColumnConstraints column2 = new ColumnConstraints(150,150, Double.MAX_VALUE);
        column2.setHgrow(Priority.ALWAYS);
        root.getColumnConstraints().add(column2);

        ColumnConstraints column3 = new ColumnConstraints(70, 70, Double.MAX_VALUE);
        column3.setHgrow(Priority.ALWAYS);
        root.getColumnConstraints().add(column3);

        root.setGridLinesVisible(true);
        root.setColumnIndex(first, 0);
        root.setColumnIndex(second, 1);
        root.setColumnIndex(third, 2);
        root.getChildren().addAll(first, second, third);

        Scene scene = new Scene(root, 300, 200);
        stage.setScene(scene);
        stage.setTitle("GridPane in JavaFX");
        stage.show();

    }

}