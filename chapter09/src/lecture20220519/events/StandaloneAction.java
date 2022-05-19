package lecture20220519.events;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class StandaloneAction implements EventHandler<ActionEvent> {

	private Button button;

	public StandaloneAction(Button button) {
		this.button = button;
	}

	public void handle(ActionEvent event) {
		String text = button.getText();
		button.setText(text + "!");
	}

}
