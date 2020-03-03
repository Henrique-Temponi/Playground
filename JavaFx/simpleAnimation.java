import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * simpleAnimation
 */
public class simpleAnimation extends Application {
 
    @Override
    public void start(Stage primaryScene)
    {
        Group gp = new Group();
        Scene scene = new Scene (gp, 800, 600, Color.BLACK);
        
        primaryScene.setScene(scene);
        primaryScene.show();

    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}