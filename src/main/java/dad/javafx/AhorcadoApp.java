package dad.javafx;

import dad.javafx.ahorcado.AhorcadoController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AhorcadoApp extends Application {
	
	private AhorcadoController controller;

	@Override
	public void start(Stage primaryStage) throws Exception {
		controller = new AhorcadoController();
		
		Scene scene = new Scene(controller.getView());
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("AhorcadoApp");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
