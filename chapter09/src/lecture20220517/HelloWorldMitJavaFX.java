package lecture20220517;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class HelloWorldMitJavaFX extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Hello World Fenster");
        Pane pane = new FlowPane();
        pane.getChildren().add(new Label("Hello World!"));
        Scene scene = new Scene(pane, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();        
    }

}
