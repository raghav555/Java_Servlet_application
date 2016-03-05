package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.application.HostServices;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
//Ishan Pandita_2014050
//Ashutosh Gupta_2014139

public class Main extends Application {

	public static Stage stage2=new Stage();
	@Override
	public void start(Stage stage) throws IOException {
	      Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
	      Scene scene = new Scene(root);
	      stage.setTitle("MyFeedback");
	      stage.setScene(scene);
	      stage.show();
	      Parent root2 = FXMLLoader.load(getClass().getResource("sample1.fxml"));
	      Scene scene1 = new Scene(root2);
	     
	      stage2.setTitle("MyFeedback");
	      stage2.setScene(scene1);
	      stage2.show();
	      
	      
	      
	}

	public static void main(String[] args) {
		launch(args);
		
		
	}

}
