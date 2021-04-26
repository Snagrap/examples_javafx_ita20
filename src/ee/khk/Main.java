package ee.khk;

import javafx.application.Application;
import javafx.beans.Observable;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
        ObservableList<String> langs = FXCollections.observableArrayList("Java", "JavaScript", "C#", "Python");
        ComboBox<String> langsComboBox = new ComboBox<String>(langs);
        langsComboBox.setValue("Java");
        Label lbl = new Label();
        langsComboBox.setOnAction(event -> lbl.setText(langsComboBox.getValue()));

        FlowPane root = new FlowPane(Orientation.VERTICAL, 10, 10, langsComboBox, lbl);
        Scene scene = new Scene(root, 300, 250);
        stage.setScene(scene);
        stage.setTitle("ComboBox in JavaFX");
        stage.show();

    }

}