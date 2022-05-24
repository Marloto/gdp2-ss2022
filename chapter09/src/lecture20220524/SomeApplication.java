package lecture20220524;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class SomeApplication extends Application {

	public void start(Stage primaryStage) throws Exception {
		// typische Schritte?
		// -> Strg+Shift+O => Auto-Import
		//Button button = new Button();
		
		
		// Einzeilige Eingabe
		TextField field = new TextField();
		
		field.setOnKeyReleased(new EventHandler<KeyEvent>() {
			public void handle(KeyEvent event) {
//				System.out.println("Alt: " + event.isAltDown());
//				System.out.println("Shift: " + event.isShiftDown());
//				System.out.println("Text: " + event.getText());
//				System.out.println("Character: " + event.getCharacter());
			}
		});
		
		// Mehrzeilige Eingabe
		TextArea textArea = new TextArea();
		
		// Button
		Button button = new Button("Klick!");
		
		PasswordField pfield = new PasswordField();
		
//		FlowPane pane = new FlowPane();
//		pane.setAlignment(Pos.CENTER);
//		pane.setHgap(30);
//		pane.setVgap(10);
//		pane.setPadding(new Insets(50, 10, 20, 40));
		
//		List<Node> list = pane.getChildren();
//		list.add(field);
//		list.add(button);
//		list.add(textArea);
//		list.add(pfield);
		
//		GridPane pane = new GridPane();
//		pane.add(field, 0, 0);
//		pane.add(button, 1, 0);
//		pane.add(textArea, 0, 1, 2, 1);
//		pane.add(pfield, 0, 2);
		
		BorderPane pane = new BorderPane();
		pane.setTop(field);
		pane.setLeft(button);
		pane.setBottom(pfield);
		//pane.setRight(null);
		pane.setCenter(textArea);
		
		// Geben Sie beim Klick auf den Button die Eingaben in 
		// TextField und TextArea in der Konsole aus!
		
		button.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				
//				System.out.println(field.getText());
//				System.out.println(textArea.getText());
				textArea.setText(textArea.getText() + "\n" + 
						field.getText());
				field.setText("");
			}
		});
		
		
		
		Scene scene = new Scene(pane);
		
		primaryStage.setTitle("Hello, World!");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
