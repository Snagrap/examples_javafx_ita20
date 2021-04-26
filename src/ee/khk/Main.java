package ee.khk;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.*;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.text.Text;
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
        Label headerLbl = new Label("ScrollPane");
        Label textLbl = new Label("KARL ON ÄGEKARL ON ÄGEKARL ON ÄGEKARL ON ÄGEKARL ON ÄGEKARL ON ÄGEKARL ON ÄGEKARL ON ÄGEKARL ON ÄGEKARL ON ÄGEKARL ON ÄGEKARL ON ÄGEKARL ON ÄGEKARL ON ÄGEKARL ON ÄGEKARL ON ÄGEKARL ON ÄGEKARL ON ÄGEKARL ON ÄGEKARL ON ÄGEKARL ON ÄGEKARL ON ÄGEKARL ON ÄGEKARL ON ÄGEKARL ON ÄGEKARL ON ÄGEKARL ON ÄGEKARL ON ÄGEKARL ON ÄGEKARL ON ÄGEKARL ON ÄGEKARL ON ÄGEKARL ON ÄGEKARL ON ÄGEKARL ON ÄGEKARL ON ÄGEKARL ON ÄGEKARL ON ÄGEKARL ON ÄGEKARL ON ÄGEKARL ON ÄGEKARL ON ÄGEKARL ON ÄGEKARL ON ÄGEKARL ON ÄGEKARL ON ÄGEKARL ON ÄGE");
        ScrollPane scrollPane = new ScrollPane(textLbl);
        scrollPane.setPrefViewportHeight(150);
        scrollPane.setPrefViewportWidth(200);
        FlowPane root = new FlowPane(Orientation.VERTICAL, 10, 10, headerLbl, scrollPane);
        Scene scene = new Scene(root, 300, 250);
        stage.setScene(scene);
        stage.setTitle("TextArea in JavaFX");
        stage.show();

    }

}