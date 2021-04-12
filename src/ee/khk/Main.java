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
        Label sixth = new Label("Sixth");

        GridPane root = new GridPane();
        ColumnConstraints column1 = new ColumnConstraints();
        column1.setPercentWidth(30);
        root.getColumnConstraints().add(column1);

        ColumnConstraints column2 = new ColumnConstraints();
        column2.setPercentWidth(40);
        root.getColumnConstraints().add(column2);

        ColumnConstraints column3 = new ColumnConstraints();
        column3.setPercentWidth(30);
        root.getColumnConstraints().add(column3);

        RowConstraints row1 = new RowConstraints();
        row1.setPercentHeight(55);
        root.getRowConstraints().add(row1);

        RowConstraints row2 = new RowConstraints();
        row2.setPercentHeight(45);
        root.getRowConstraints().add(row2);

        root.setGridLinesVisible(true);
        root.add(first, 0, 0);
        root.add(second, 1, 0);
        root.add(third, 2, 0);
        root.add(sixth, 2, 1);

        Scene scene = new Scene(root, 300, 200);
        stage.setScene(scene);
        stage.setTitle("GridPane in JavaFX");
        stage.show();

    }

}