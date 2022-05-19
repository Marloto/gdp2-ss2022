package lecture20220519.controls;

import java.util.List;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ControlsApplication extends Application {

	public void start(Stage primaryStage) throws Exception {
		// Fenster 1
		Button button = new Button("SomeTest!");
		
		Label label = new Label("Test");
		
		label.setText("Some-Text!");
		String text = label.getText();
		// Text lässt sich konfigurieren, bis hin zu CSS
		
		CheckBox box = new CheckBox();
		//boolean selected = box.isSelected();
		//box.setSelected(true);
		
		// RadioButtons können genutzt werden, um nur ein Element 
		// auswählbar zu halten - dafür ist eine ToogleGroup notwendig!
		RadioButton a1 = new RadioButton();
		RadioButton a2 = new RadioButton();
		RadioButton a3 = new RadioButton();
		
		// Zusammenhang erzeugen
		ToggleGroup grp = new ToggleGroup();
		a1.setToggleGroup(grp);
		a2.setToggleGroup(grp);
		a3.setToggleGroup(grp);
		
		// Erste Möglichkeit mehrere Elemente einzufügen in eine Scene
		FlowPane pane = new FlowPane();
		List<Node> list = pane.getChildren();
		list.add(button);
		list.add(label);
		list.add(box);
		list.add(a1);
		list.add(a2);
		list.add(a3);
		
		Scene scene = new Scene(pane, 300, 200);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Fenstertitel!");
		primaryStage.show();
	}

}
