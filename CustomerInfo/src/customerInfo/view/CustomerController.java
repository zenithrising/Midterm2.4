package customerInfo.view;

import customerInfo.model.Customer;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class CustomerController {
	@FXML
	private Button saveButton;
	@FXML
	private Button clearButton;
	@FXML
	private TextField firstName;
	@FXML
	private TextField middleInitial;
	@FXML
	private TextField lastName;
	@FXML
	private RadioButton male;
	@FXML
	private RadioButton female;
	@FXML
	private TextField address;
	@FXML
	private TextField city;
	@FXML
	private ComboBox<String> state;
	@FXML
	private TextField zip;

	Customer myCustomer;

	private ObservableList<String> states = FXCollections.observableArrayList("AL", "AK", "AZ", "AR", "CA", "CO", "CT", "DE", "FL", "GA", "HI", "ID", "IL", "IN", "IA", "Ks", "KY", "LA", "ME", "MD", "MA", "MI", "MN", "MS", "MO", "MT", "NE", "NV", "NH", "NJ", "NM", "NY", "NC", "ND", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", "TX", "UT", "VT", "VA", "WA", "WV", "WI", "WY");

	private String getGender() {
		if (male.selectedProperty().get()) {
			return "Male";
		} else if (female.selectedProperty().get()) {
			return "female";
		}
		return "";
	}
	
	@FXML
	private void initialize() {
		state.setItems(states);
		firstName.setText(null);
		middleInitial.setText(null);
		lastName.setText(null);
		address.setText(null);
		city.setText(null);
		state.setValue(null);
		zip.setText(null);
		male.setSelected(false);
		female.setSelected(false);
	}

	@FXML
	private void handleMale() {
		if (female.isSelected()) {
			female.setSelected(false);
		}
	}

	@FXML
	private void handleFemale() {
		if (male.isSelected()) {
			male.setSelected(false);
		}
	}
	
	@FXML
	private void handleZip() {
		//if text is alpha
		//clear
		//should only accept numbers??
	}
	
	@FXML
	private void handleSave() {
		customerInfo.model.CustomerSave.setCustomer(new Customer(firstName.getText(), middleInitial.getText(),lastName.getText(), getGender(), address.getText(),city.getText(), state.getValue(), zip.getText()));
	}

	@FXML
	private void handleClear() {
		initialize();
	}
}
