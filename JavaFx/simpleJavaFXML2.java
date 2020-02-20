import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * simpleJavaFXML2
 */
public class simpleJavaFXML2 extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root =FXMLLoader.load(getClass().getResource("./fxml/appJFXML.fxml"));

        Scene scene = new Scene(root, 800, 800);

    
        primaryStage.setTitle("JavaFXML");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}