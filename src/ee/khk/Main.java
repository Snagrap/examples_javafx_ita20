package ee.khk;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.text.Text;

public class Main extends Application{
    public static void main(String[] args) {
        System.out.println("Launching Application");
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("Hello JavaFX");
        stage.setWidth(250);
        stage.setHeight(150);
        stage.show();
    }

}