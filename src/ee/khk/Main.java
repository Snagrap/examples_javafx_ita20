package ee.khk;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.*;
import javafx.scene.Parent;
import javafx.scene.control.CheckBox;
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

    CheckBox java;
    CheckBox javaScript;
    CheckBox csharp;
    Label selectedLangs;

    public static void main(String[] args) {
        Application.launch(args);
    }


    @Override
    public void start(Stage stage) throws Exception {
        CheckBox java = new CheckBox("Java");
        java.setSelected(true);
        CheckBox javaScript = new CheckBox("JavaScript");
        javaScript.setAllowIndeterminate(true);
        CheckBox csharp = new CheckBox("C#");
        csharp.setAllowIndeterminate(true);
        csharp.setIndeterminate(true);
        FlowPane root = new FlowPane(Orientation.VERTICAL, 0, 10);
        root.getChildren().addAll(java, javaScript, csharp);
        root.setPadding(new Insets(10));
        Scene scene = new Scene(root, 250, 200);
        stage.setScene(scene);
        stage.setTitle("Hello JavaFX");
        stage.show();

    }

}