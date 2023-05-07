package simpleFX2;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class ValueController {
	private int i = 0;
	
    @FXML
    private Label label;

    @FXML
    private Button ofraBtn;

    @FXML
    private Button yardenaBtn;

    @FXML
    void decreaseLabel(MouseEvent event) {
    	i--;
    	label.setText(""+i);
    }

    @FXML
    void increaseLabel(MouseEvent event) {
    	i++;
    	label.setText(""+i);
    }

}
