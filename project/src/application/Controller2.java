package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
//Ishan Pandita_2014050
//Ashutosh Gupta_2014139
public class Controller2 implements Initializable {
	@FXML
	TableView <Student>tab ;
	@FXML
	private TableColumn table_enroll;
	@FXML
	private TableColumn table_name;
	@FXML
	private TableColumn table_link;
	 @FXML
	 void back() throws IOException{
	      Parent root3 = FXMLLoader.load(getClass().getResource("sample1.fxml"));
	      Scene scene1 = new Scene(root3);
	     
	      Main.stage2.setTitle("MyFeedback");
	      Main.stage2.setScene(scene1);
	      Main.stage2.show();
	 }
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	      table_name.setCellValueFactory(new PropertyValueFactory("category"));
	      table_enroll.setCellValueFactory(new PropertyValueFactory("amount"));
	      table_link.setCellValueFactory(new PropertyValueFactory("dt"));

		tab.getItems().setAll(Controller.data);
		
	}

}
