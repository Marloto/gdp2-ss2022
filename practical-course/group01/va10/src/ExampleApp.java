import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ExampleApp extends Application {
	
	private boolean stopped = true;
	private Label label;
	
	private class SomeJob implements Runnable {
		private int i;
		public void run() {
			while(!stopped) {
				//System.out.println(Thread.currentThread().getId() + ": " + i ++);
				Platform.runLater(() -> {
					label.setText(Integer.toString(i ++)); // <- NullPointerException
				});
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	// PlayList list = new PlayList();
	
	private void setPlayList(String path) {
		// 1. Input path == null ist -> default liste laden... und achten Sie darauf
		//    das die Abspielposition zurückgesetzt wird!
		// 2. Eine PlayList unterschiedlich lang, auch hier abspielposition!
		// list.loadFromM3U(path);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		SomeJob target = new SomeJob();
		
		label = new Label();

		
		Button button = new Button("Text");
		button.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				if(stopped == true) {
					Thread thread1 = new Thread(target);
					stopped = false;
					thread1.start();
				} else {
					stopped = true;					
				}
			}
		});
		
		FlowPane pane = new FlowPane();
		pane.getChildren().addAll(label, button);
		
		
		primaryStage.setScene(new Scene(pane, 300, 200));
		
		primaryStage.setTitle("Some Title");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}
