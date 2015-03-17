package seklund;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application{


	public static void main(String[] args) {
		launch(args);
	}


	@Override
	public void start(Stage primaryStage) throws Exception {

		primaryStage.setTitle("Kundkort");

		Pane pane = (Pane)FXMLLoader.load(getClass().getResource("layout.fxml"));
		
		//Scene myScene = new Scene(myPane);

		Scene scene = new Scene(pane, 1000, 600);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

}
