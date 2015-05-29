package seklund;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {

		Controller controller = new Controller();
		controller.setText("Hello satan");
		
		primaryStage.setScene(new Scene(controller));
		primaryStage.setTitle("Custom Control");
		primaryStage.setWidth(300);
		primaryStage.setHeight(200);
		primaryStage.show();
		
        /*
		Pane pane = (Pane)FXMLLoader.load(getClass().getResource("layout.fxml"));
		
		Scene scene = new Scene(pane, 1000, 600);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Kundkort");
		primaryStage.show();
		*/
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
