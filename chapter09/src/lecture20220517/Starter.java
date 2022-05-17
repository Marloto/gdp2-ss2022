package lecture20220517;

import javafx.application.Application;

public class Starter {
    public static void main(String[] args) {
        // Projekte die über Maven konfiguriert sind, dürfen die Main-Methode
        // nicht in der Klasse liegen haben, die von Application erbt!
        Application.launch(HelloWorldMitJavaFX.class, args);
    }
}
