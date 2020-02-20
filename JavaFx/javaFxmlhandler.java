import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

/**
 * javaFxmlhandler
 */
public class javaFxmlhandler {

    @FXML private Text actionIsComing;

    @FXML protected void handlerSubmit(ActionEvent event) {
        actionIsComing.setText("yeet");
    }
}