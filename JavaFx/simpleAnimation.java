import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.StrokeType;
import javafx.stage.Stage;

/**
 * simpleAnimation
 */
public class simpleAnimation extends Application {
 
    @Override
    public void start(Stage primaryScene)
    {
        Group gp = new Group();

        Group circles = new Group();
        for (int i = 0; i < 30; i++) {
            Circle circle = new Circle(150, Color.web("white", 0.05));
            circle.setStrokeType(StrokeType.OUTSIDE);
            circle.setStroke(Color.web("white", 0.16));
            circle.setStrokeWidth(4);
            circles.getChildren().add(circle);
        }

        gp.getChildren().addAll(circles);

        Scene scene = new Scene (gp, 800, 600, Color.BLACK);
        
        primaryScene.setScene(scene);
        primaryScene.show();

    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}