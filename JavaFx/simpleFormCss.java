import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * simpleForm
 */
public class simpleFormCss extends Application {

    @Override
    public void start(Stage primaryStage) {
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);;
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        
        
        Text sceneTitle = new Text("Welcome");
        sceneTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(sceneTitle, 0, 0, 2, 1);

        Label userName = new Label("User name");
        grid.add(userName, 0, 1);
        
        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);

        Label pw = new Label("PassWord");
        grid.add(pw, 0, 2);

        PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 1, 2);

        Button signIn = new Button("Sign in");
        HBox positionSignIn = new HBox(10);
        positionSignIn.setAlignment(Pos.BOTTOM_RIGHT);
        positionSignIn.getChildren().add(signIn);
        grid.add(positionSignIn, 1, 4);

        final Text actionTarget = new Text();
        grid.add(actionTarget, 1, 6);

        signIn.setOnAction(e -> {
            actionTarget.setFill(Color.FIREBRICK);
            actionTarget.setText("Sign in Button pressed");
        });


        Scene scene = new Scene(grid, 300, 275);

        // grid.setGridLinesVisible(true); // Mostrar linhas para propositos de debugging
        primaryStage.setScene(scene);

        scene.getStylesheets().add(getClass().getResource(".\\css\\style.css").toExternalForm());

        primaryStage.setTitle("JavaFX Welcome");
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}