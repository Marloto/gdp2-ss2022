package lecture20220519;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class FirstApplication extends Application {

	public void start(Stage primaryStage) throws Exception {
		// Fenster 1
		Button button = new Button("Test");
		Scene scene = new Scene(button, 300, 200);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Fenstertitel!");
		primaryStage.show();
		
		// Fenster 2
		Stage stage = new Stage();
		Button button2 = new Button("Test2");
		Scene scene2 = new Scene(button2, 200, 100);
		stage.setScene(scene2);
		stage.initOwner(primaryStage);
		stage.initModality(Modality.WINDOW_MODAL);
		stage.show();
	}

}
