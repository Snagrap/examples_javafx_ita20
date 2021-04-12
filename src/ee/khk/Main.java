package ee.khk;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.*;
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

    int clicks = 0;

    public static void main(String[] args) {
        Application.launch(args);
    }


    @Override
    public void start(Stage stage) throws Exception {

        Label lbl = new Label("Counter");
        lbl.setPrefWidth(70);
        Button btn = new Button("Click");
        btn.setPrefWidth(80);
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                clicks++;
                lbl.setText(String.valueOf(clicks));

            }
        });

        FlowPane root = new FlowPane(lbl, btn);
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.setTitle("GridPane in JavaFX");
        stage.setWidth(250);
        stage.setHeight(200);
        stage.show();

    }

}