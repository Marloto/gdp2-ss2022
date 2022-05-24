package lecture20220524.vars;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.stage.Stage;

class A implements EventHandler<ActionEvent> {
	public void handle(ActionEvent a) {
//		System.out.println(varA); // new Example().varA, wenn public
//		System.out.println(varB); // Example.B, wenn public
//		System.out.println(varC); // Methoden-Variable, geht nicht
	}
}

public class Example extends Application {
	private int varA = 1;
	private static int varB = 2;

	public class B implements EventHandler<ActionEvent> {
		private int varA = -1;

		public void handle(ActionEvent a) {
			System.out.println(varA); // Eigenes Attribut in B, passt
			System.out.println(Example.this.varA); // passt
			System.out.println(varB); // passt
//			System.out.println(varC); // Methoden-Variable, geht nicht
		}
	}

	public static class C implements EventHandler<ActionEvent> {
		public void handle(ActionEvent a) {
//			System.out.println(varA); // geht nicht,
			// ggf. new Example().varA;
			System.out.println(varB); // passt
//			System.out.println(varC); // Methoden-Variable, geht nicht
		}
	}

	public void start(Stage stage) {
		int varC = 3;
		new Button().setOnAction(new A());
		new Button().setOnAction(new B());
		new Button().setOnAction(new C());
		new Button().setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent a) {
				System.out.println(varA); // passt!
				System.out.println(varB); // passt!
				System.out.println(varC); // passt!
			}
		});
		new Button().setOnAction((a) -> {
			System.out.println(varA); // passt!
			System.out.println(varB); // passt!
			System.out.println(varC); // passt!
		});
	}
}