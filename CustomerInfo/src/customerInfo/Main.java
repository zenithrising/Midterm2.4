package customerInfo;

import java.io.IOException; 
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {
	
	private Stage primaryStage; 

	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		primaryStage.setTitle("Customer Info");
		
		showCustomerView();	
	}

	private void showCustomerView() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/CustomerView.fxml"));
			AnchorPane pane = (AnchorPane) loader.load();

			Scene Cscene = new Scene(pane);

			primaryStage.setScene(Cscene);
			primaryStage.show();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
