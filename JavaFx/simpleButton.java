import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Uma aplicacao para fazer um Stage com apenas um butao.
 */
public class simpleButton extends Application{

    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button("Hell yeah");

        StackPane parentNode = new StackPane(); // colocar o butao em um layout
        parentNode.getChildren().add(btn);

        Scene root = new Scene(parentNode, 200, 300);

        primaryStage.setTitle("Now working with buttons!");
        primaryStage.setScene(root);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}