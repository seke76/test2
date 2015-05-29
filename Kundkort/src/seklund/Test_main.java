package seklund;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
 
public class Test_main implements Initializable {
     
    private Test_Person person = new Test_Person();
     
    @FXML
    private TextField firstNameField;
    
    @FXML
    private Label messageLabel;
    
    @FXML
    private void submit(ActionEvent event) {
        messageLabel.setText(person.getFirstName());
    }
     
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        firstNameField.textProperty().bindBidirectional(person.firstNameProperty());
    }    
}