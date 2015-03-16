package seklund;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
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

		// Layout
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.TOP_CENTER);
		pane.setHgap(10);
		pane.setVgap(10);
		pane.setPadding(new Insets(25, 25, 25, 25));

		Text headerLabel = new Text("Kundkort");
		headerLabel.setFont(Font.font("Arial", FontWeight.NORMAL,35));
		pane.add(headerLabel, 0, 0, 3, 1);
		
		HBox hbox = new HBox();
		
		
		
		Scene scene = new Scene(pane, 1000, 600);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

}
