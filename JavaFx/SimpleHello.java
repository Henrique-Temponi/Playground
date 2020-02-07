import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * Classe simples para apenas gerar uma Stage com um label falando hello
 * @param args
*/
public class SimpleHello extends Application{

    /**
     * starta a aplicao
     */
    @Override
    public void start(Stage primaryStage) {
        
        Label hello = new Label("Hello!"); 

        Scene root = new Scene(hello, 400, 700); //colocar os parametros de tamanho de tela

        primaryStage.setTitle("World");
        primaryStage.setScene(root);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);   
    }
}