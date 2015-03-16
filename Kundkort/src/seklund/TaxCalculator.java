package seklund;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TaxCalculator extends Application{

	public static void main(String[] args) {
		launch(args);
	}


	@Override
	public void start(Stage primaryStage) throws Exception {


		primaryStage.setTitle("JavaFX Tax Calculator");

		// Layout
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.setHgap(10);
		pane.setVgap(10);
		pane.setPadding(new Insets(25, 25, 25, 25));

		// Text title
		Text sceneTitle = new Text("Tax calculator");
		sceneTitle.setFont(Font.font("Arial", FontWeight.NORMAL,20));
		pane.add(sceneTitle, 0, 0, 2, 1);
		
		// Labels and textfields
		Label total = new Label("Income");
		pane.add(total, 0, 1);
		final TextField totalField = new TextField();
		pane.add(totalField,1 ,1 );
		Label percent = new Label("% Tax");
		pane.add(percent, 0, 2);
		final TextField percentField = new TextField();
		pane.add(percentField, 1, 2);
		
		// Calculate button
		Button calculateButton = new Button("Calculate");
		HBox hbox = new HBox(10);
		hbox.setAlignment(Pos.BOTTOM_RIGHT);
		hbox.getChildren().add(calculateButton);
		pane.add(hbox, 1, 4);
		
		// Result
		final Text taxMessage = new Text();
		pane.add(taxMessage, 1,6);
		
		// Event handling
		calculateButton.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent t) {
				Double income = Double.parseDouble(totalField.getText());
				Double tax = Double.parseDouble(percentField.getText());
				taxMessage.setText("Tax incurred: " +income*tax);
			}
		});

		Scene scene = new Scene(pane, 300, 300);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}