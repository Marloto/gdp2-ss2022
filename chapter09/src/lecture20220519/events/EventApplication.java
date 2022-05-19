package lecture20220519.events;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

class NotPublicStandaloneAction implements EventHandler<ActionEvent> {

	private Button button;

	public NotPublicStandaloneAction(Button button) {
		this.button = button;
	}

	public void handle(ActionEvent event) {
		String text = button.getText();
		button.setText(text + "!");
	}
}


public class EventApplication extends Application {
	
	private int xyz = 42;
	private Button button;
	
	// Inneren Klassen
	// Sichtbarkeiten?
	// -> private: nur innerhalb der äußeren Klasse (EventApplication)
	// -> public: kann überall genutzt werden
	// -> protected: innerhalb der Vererbungshierarchie (EventApplication)
	// Diese klasse kann nur an speziellen Orten instanziert werden
	public class InnerClassAction implements EventHandler<ActionEvent> {
		public void handle(ActionEvent event) {
			System.out.println(EventApplication.this.xyz);
			String text = button.getText();
			button.setText(text + "!");
		}
	}
	
	public static class InnerStaticClassAction implements EventHandler<ActionEvent> {
		private Button button;

		public InnerStaticClassAction(Button button) {
			this.button = button;
		}
		
		// Was müsste wieder ergänzt werden, damit der Action-Handler klappt?
		public void handle(ActionEvent event) {
			String text = button.getText();
			button.setText(text + "!");
		}
	}
	

	public void start(Stage primaryStage) throws Exception {
		// Fenster 1
		button = new Button("Test");
		//button.setOnAction(new StandaloneAction(button));
		//button.setOnAction(new NotPublicStandaloneAction(button));
		//button.setOnAction(new InnerClassAction());
		//button.setOnAction(new InnerStaticClassAction(button));
		
//		String something = "Hello!";
//		button.setOnAction(new EventHandler<ActionEvent>() {
//			public void handle(ActionEvent event) {
//				System.out.println(something); // ist bei anonymen klassen möglich!
//				String text = button.getText();
//				button.setText(text + "!");
//			}
//		});
		
//		button.setOnAction((event) -> {
//			String text = button.getText();
//			button.setText(text + "!");
//		});
		
		button.setOnAction((event) -> button.setText(button.getText() + "!"));
		
		Scene scene = new Scene(button, 300, 200);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Fenstertitel!");
		primaryStage.show();
		
		
	}
	

}
