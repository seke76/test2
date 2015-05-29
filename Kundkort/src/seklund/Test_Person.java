package seklund;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Test_Person {
	
	private StringProperty firstName = new SimpleStringProperty(this, "firstName", "");

	public final String getFirstName() { 
		return firstName.get();
	}

	public final void setFirstName(String value) { 
		firstName.set(value); 
	}

	public final StringProperty firstNameProperty() { 
		return firstName; 
	}
}