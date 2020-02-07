import java.util.concurrent.TimeUnit;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
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
        
        // for (int i = 0; i < 500; i++) {
        //     primaryStage.setY(i);
        //     primaryStage.setX(i);

        //     // try {
        //     //     TimeUnit.MILLISECONDS.sleep(500);
        //     // } catch (Exception e) {
        //     //     e.printStackTrace();
        //     // }
        //     // primaryStage.show();
        // }

        // primaryStage.show();

        // Stage stage = new Stage();

        // stage.initModality(Modality.WINDOW_MODAL);
        // stage.initOwner(primaryStage);
        // stage.show();

        primaryStage.setTitle("JavaFX App");

        VBox box = new VBox();
        Scene scene = new Scene(box);

        primaryStage.setScene(scene);
        primaryStage.setFullScreen(true);
    
        primaryStage.show();

    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}

/*
http://tutorials.jenkov.com/javafx/stage.html
https://docs.oracle.com/javase/8/javafx/api/toc.htm
*/