package ee.khk;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.text.Text;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

public class Main extends Application{
    public static void main(String[] args) {
        System.out.println("Launching Application");
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {

        //Label label = new Label("Hello");
        //Button button = new Button("Button");
        //Group group = new Group(button);

        Group root = new Group();

        //FlowPane root = new FlowPane(label, group);
        Scene scene = new Scene(root, 400, 150, Color.BLUE);
        stage.setScene(scene);

        stage.setTitle("Hello JavaFX");

        stage.show();
    }

}