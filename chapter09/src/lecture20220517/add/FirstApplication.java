package lecture20220517.add;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class FirstApplication extends Application {

	public void start(Stage primaryStage) throws Exception {
		// Erzeugen von allen notwendigen GUI-Elementen
		Button button = new Button("Test");
		
		// Arrangieren in einer Szene
		Scene scene = new Scene(button);
		
		// Bekanntgeben der Scene
		primaryStage.setScene(scene);
		// Anzeigen
		primaryStage.show();
	}

}
