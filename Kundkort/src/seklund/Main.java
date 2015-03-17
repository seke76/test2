package seklund;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
		pane.add(headerLabel, 0, 0);
		
		HBox hbox = new HBox();
        hbox.setPadding(new Insets(15, 12, 15, 12));
        hbox.setSpacing(10);   // Gap between nodes
   
        
        Button buttonNew = new Button("Ny kund");
        buttonNew.setPrefSize(100, 20);

        Button buttonSearch = new Button("Sök");
        buttonSearch.setPrefSize(100, 20);
        
        Button buttonList = new Button("List alla");
        buttonList.setPrefSize(100, 20);
        
        hbox.getChildren().addAll(buttonNew, buttonSearch, buttonList);
        pane.add(hbox, 0, 1);
		
		
		
		Scene scene = new Scene(pane, 1000, 600);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

}
