import java.util.concurrent.TimeUnit;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

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

        // primaryStage.setTitle("JavaFX App");

        // VBox box = new VBox();
        // Scene scene = new Scene(box);

        // primaryStage.setScene(scene);
        // primaryStage.setFullScreen(true);
    

        // Button btn = new Button("Hello");

        // Scene root = new Scene(btn, 400, 400);

        // primaryStage.initStyle(StageStyle.DECORATED);
        // primaryStage.initStyle(StageStyle.UNDECORATED);
        // primaryStage.initStyle(StageStyle.TRANSPARENT);
        // primaryStage.initStyle(StageStyle.UNIFIED);

        // primaryStage.setScene(root)

        // Stage stage1 = new Stage();
        // stage1.initStyle(StageStyle.DECORATED);
        // stage1.setTitle("Stage1");
        // Stage stage2 = new Stage();
        // stage2.initStyle(StageStyle.UNDECORATED);
        // stage2.setTitle("Stage2");
        // Stage stage3 = new Stage();
        // stage3.initStyle(StageStyle.TRANSPARENT);
        // stage3.setTitle("Stage3");
        // Stage stage4 = new Stage();
        // stage4.initStyle(StageStyle.UNIFIED);
        // stage4.setTitle("Stage4");
        // Stage stage5 = new Stage();
        // stage5.initStyle(StageStyle.UTILITY);
        // stage5.setTitle("Stage5");

        // primaryStage.setTitle("Hello");

        // stage1.show();
        // stage2.show();
        // stage3.show();
        // stage4.show();
        // stage5.show();
        // primaryStage.show();

    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}

/*
http://tutorials.jenkov.com/javafx/stage.html
https://docs.oracle.com/javase/8/javafx/api/toc.htm
*/