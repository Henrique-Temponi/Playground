import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Idea, fazen um mini jogo tipo gun, colocar uma stage no centro da tela, colocar o mouse e esperar
 * depois colocar uma stage aleatoria pela a tela (pode fazer com as scene tbm)
 * 
 * simpleStage
 */
public class simpleStage extends Application {

    @Override
    public void start(Stage primaryStage) {
        
        for (int i = 0; i < 100; i++) {
            primaryStage.setY(i);
            primaryStage.setX(i);
            primaryStage.show();
        }

        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}