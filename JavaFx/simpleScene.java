import javafx.application.Application;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * simpleScene
 */
public class simpleScene extends Application{

    @Override
    public void start(Stage primaryStage) {
        
        Label text = new Label("test");

        Scene root = new Scene(text);
        root.setCursor(Cursor.CROSSHAIR);

        primaryStage.setScene(root);

        primaryStage.setTitle("Hello");
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}