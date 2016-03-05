package application;
//Ishan Pandita_2014050
//Ashutosh Gupta_2014139
import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.net.URI;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.ResourceBundle;

import javafx.application.HostServices;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class Controller implements Initializable

{				    	public static ObservableList<Student> data =
        FXCollections.observableArrayList();
	@FXML
    private RadioButton no;
	@FXML
	private DatePicker from;
	@FXML
	private DatePicker upto;
	@FXML
	private DatePicker dat;
	@FXML
    private Label gender;
    @FXML
    private TextField f2;
    @FXML
    private TextField f3;
    @FXML
    private TextField f4;
    @FXML
    private TextField f5;
    @FXML
    private TextField f6;
    @FXML
    private TextField f7;
    @FXML
    private TextField f8;
    @FXML
    private TextField f9;
    @FXML
    private TextField f10;
    @FXML
    private TextField f11;
    @FXML
    private TextField f15;
    @FXML
    private TextField f19;
    @FXML
    private TextField f23;
    @FXML
    private TextField f27;
    @FXML
    private TextField f31;
    @FXML
    private RadioButton before;

    @FXML
    private RadioButton yes;

    @FXML
    private TextField nam;

    @FXML
    private TextField enroll;

    @FXML
    private RadioButton after;

    @FXML
    private ComboBox<String> category;

    @FXML
    private RadioButton female;

    @FXML
    private TextField email;

    @FXML
    private RadioButton male;

    @FXML
    private ToggleGroup tg2;

    @FXML
    private ToggleGroup tg1;
    @FXML
    private CheckBox f12;
    @FXML
    private CheckBox f13;
    @FXML
    private CheckBox f14;
    @FXML
    private CheckBox f16;
    @FXML
    private CheckBox f17;
    @FXML
    private CheckBox f18;
    @FXML
    private CheckBox f20;
    @FXML
    private CheckBox f21;
    @FXML
    private CheckBox f22;
    @FXML
    private CheckBox f24;
    @FXML
    private CheckBox f25;
    @FXML
    private CheckBox f26;
    @FXML
    private CheckBox f28;
    @FXML
    private CheckBox f29;
    @FXML
    private CheckBox f30;
        
    @FXML
    private RadioButton on;
	 @FXML
	 private ComboBox<String> f1;


	 @FXML
	 private void show(ActionEvent event) throws IOException{
			FileReader in = null;
	    	int i=0;
	    	try {
	    		for( i=1000;true;i++){
				in = new FileReader("./src/PHD"+i+".txt");
				BufferedReader br=new BufferedReader(in);}
				
			} catch (FileNotFoundException e) {
				data =
				        FXCollections.observableArrayList();
				   


				    	
				for(int j=1000;j<i;j++){
					String name;
						try {
							in = new FileReader("./src/PHD"+j+".txt");
							BufferedReader br=new BufferedReader(in);
							String name2=new String();
							int cnt=0;
							try {
								
								name=br.readLine();
								while(name!=null){
									System.out.println(cnt+name);
									if(cnt==12){
										if(before.isSelected()){
											String[] arr=dat.getValue().toString().split("-");
											String[] brr=name.split(" ")[1].split("/");
											
											//if brr>arr break
											if(Integer.parseInt(brr[2])>Integer.parseInt(arr[0]))break;
											else if(Integer.parseInt(brr[2])==Integer.parseInt(arr[0])){
												if(Integer.parseInt(brr[1])>Integer.parseInt(arr[1]))break;
												else if(Integer.parseInt(brr[1])==Integer.parseInt(arr[1])){
													if(Integer.parseInt(brr[0])>=Integer.parseInt(arr[2]))break;
												}
											}
										}
										if(after.isSelected()){
											String[] brr=dat.getValue().toString().split("-");
											String[] arr=name.split(" ")[1].split("/");
											//if arr<brr break
											if(Integer.parseInt(brr[0])>Integer.parseInt(arr[2]))break;
											else if(Integer.parseInt(brr[0])==Integer.parseInt(arr[2])){
												if(Integer.parseInt(brr[1])>Integer.parseInt(arr[1]))break;
												else if(Integer.parseInt(brr[1])==Integer.parseInt(arr[1])){
													if(Integer.parseInt(brr[2])>=Integer.parseInt(arr[0]))break;
												}
											}
										}
										if(on.isSelected()){
											String[] brr=dat.getValue().toString().split("-");
											String[] arr=name.split(" ")[1].split("/");
											if(Integer.parseInt(brr[0])!=Integer.parseInt(arr[2])||Integer.parseInt(brr[1])!=Integer.parseInt(arr[1])||Integer.parseInt(brr[2])!=Integer.parseInt(arr[0]))break;

										}
									}
									if(cnt==0){
								
									if(from.getValue()==null&&upto.getValue()==null);
									else if(from.getValue()==null&&upto.getValue()!=null){
										String[] arr=upto.getValue().toString().split("-");
										String[] brr=name.split("/");
										
										//if brr>arr break
										if(Integer.parseInt(brr[2])>Integer.parseInt(arr[0]))break;
										else if(Integer.parseInt(brr[2])==Integer.parseInt(arr[0])){
											if(Integer.parseInt(brr[1])>Integer.parseInt(arr[1]))break;
											else if(Integer.parseInt(brr[1])==Integer.parseInt(arr[1])){
												if(Integer.parseInt(brr[0])>Integer.parseInt(arr[2]))break;
											}
										}
										
									}
									else if(from.getValue()!=null&&upto.getValue()==null){
										String[] brr=from.getValue().toString().split("-");
										String[] arr=name.split("/");
										//if arr<brr break
										if(Integer.parseInt(brr[0])>Integer.parseInt(arr[2]))break;
										else if(Integer.parseInt(brr[0])==Integer.parseInt(arr[2])){
											if(Integer.parseInt(brr[1])>Integer.parseInt(arr[1]))break;
											else if(Integer.parseInt(brr[1])==Integer.parseInt(arr[1])){
												if(Integer.parseInt(brr[2])>Integer.parseInt(arr[0]))break;
											}
										}
										

									}
									else {
									
										String[] brr=from.getValue().toString().split("-");
										String[] arr=name.split("/");
										//if arr<brr break
										if(Integer.parseInt(brr[0])>Integer.parseInt(arr[2]))break;
										else if(Integer.parseInt(brr[0])==Integer.parseInt(arr[2])){
											if(Integer.parseInt(brr[1])>Integer.parseInt(arr[1]))break;
											else if(Integer.parseInt(brr[1])==Integer.parseInt(arr[1])){
												if(Integer.parseInt(brr[2])>Integer.parseInt(arr[0]))break;
											}
										}
										String[] crr=upto.getValue().toString().split("-");
										if(Integer.parseInt(arr[2])>Integer.parseInt(crr[0]))break;
										else if(Integer.parseInt(arr[2])==Integer.parseInt(crr[0])){
											if(Integer.parseInt(arr[1])>Integer.parseInt(crr[1]))break;
											else if(Integer.parseInt(arr[1])==Integer.parseInt(crr[1])){
												if(Integer.parseInt(arr[0])>Integer.parseInt(crr[2]))break;
											}
										}
										
									}
									}
									
									if (cnt==1&&!email.getText().equals("")&&name.split(" ")[1].equals(email.getText()));
									else if (cnt!=1|| email.getText().equals(""));
									else break;
									if(cnt==2)
									name2=name.substring(5);
									if (cnt==2&&!nam.getText().equals("")&&name.split(" ")[1].equals(nam.getText()));
									else if (cnt!=2|| nam.getText().equals(""));
									else break;
									if (cnt==10&&category.getValue()!=null&&name.split(" ")[1].equals(category.getValue()));
									else if (cnt!=10|| category.getValue()==null){}
									else break;
									
									if (cnt==11&&yes.isSelected()&&name.split(" ")[1].equals(yes.getText()));
									else if (cnt==11&&no.isSelected()&&name.split(" ")[1].equals(no.getText()));
									else if(cnt!=11||(!no.isSelected()&&!yes.isSelected()));
									else break;
									if(male.isSelected()&&cnt==9&&(!name.split(" ")[1].equals("Male")))break;
									if(female.isSelected()&&cnt==9&&(!name.split(" ")[1].equals("Female")))break;
									if(f1.getValue()!=null&&cnt==5&&name.split(" ")[1].equals(f1.getValue().split(" ")[0]));
									else if(f1.getValue()==null||cnt!=5);
									else break;
									if(!f2.getText().equals("")&&cnt==24&&name.split(" ")[1].equals(f2.getText().split(" ")[0]));
									else if(f2.getText().equals("")||cnt!=24);
									
									else break;					

											
									if(!f3.getText().equals("")&&cnt==40&&name.split(" ")[1].equals(f3.getText().split(" ")[0]));
									else if(f3.getText().equals("")||cnt!=40);
									
									else break;				
									if(!f4.getText().equals("")&&cnt==18&&name.split(" ")[1].equals(f4.getText().split(" ")[0]));
									else if(f4.getText().equals("")||cnt!=18);
									
									else break;				
									if(!f5.getText().equals("")&&cnt==21&&name.split(" ")[1].equals(f5.getText().split(" ")[0]));
									else if(f5.getText().equals("")||cnt!=21);
									
									else break;				
									if(!f6.getText().equals("")&&cnt==25&&name.split(" ")[1].equals(f6.getText().split(" ")[0]));
									else if(f6.getText().equals("")||cnt!=25);
									else break;													
									if(!f7.getText().equals("")&&cnt==39&&name.split(" ")[1].equals(f7.getText().split(" ")[0]));
									else if(f7.getText().equals("")||cnt!=39);
									else break;	
									if(!f8.getText().equals("")&&cnt==27&&name.split(" ")[1].equals(f8.getText().split(" ")[0]));
									else if(f8.getText().equals("")||cnt!=27);
									else break;	
									if(!f9.getText().equals("")&&cnt==36&&name.split(" ")[1].equals(f9.getText().split(" ")[0]));
									else if(f9.getText().equals("")||cnt!=36);
									else break;										
									if(!f10.getText().equals("")&&cnt==29&&name.split(" ")[1].equals(f10.getText().split(" ")[0]));
									else if(f10.getText().equals("")||cnt!=29);
									else break;
									if(!f11.getText().equals("")&&cnt==38&&name.split(" ")[1].equals(f11.getText().split(" ")[0]));
									else if(f11.getText().equals("")||cnt!=38);
									else break;	
									if((f12.isSelected()&&f14.isSelected())||(f12.isSelected()&&f13.isSelected())||(f13.isSelected()&&f14.isSelected()))
									break;
									if(f12.isSelected()&&cnt==19&&Integer.parseInt(name.split(" ")[1])<=Integer.parseInt(f15.getText()))break;
									if(f13.isSelected()&&cnt==19&&Integer.parseInt(name.split(" ")[1])!=Integer.parseInt(f15.getText()))break;
									if(f14.isSelected()&&cnt==19&&Integer.parseInt(name.split(" ")[1])>=Integer.parseInt(f15.getText()))break;
									if(f16.isSelected()&&cnt==22&&Integer.parseInt(name.split(" ")[1])<=Integer.parseInt(f19.getText()))break;
									if(f17.isSelected()&&cnt==22&&Integer.parseInt(name.split(" ")[1])!=Integer.parseInt(f19.getText()))break;
									if(f18.isSelected()&&cnt==22&&Integer.parseInt(name.split(" ")[1])>=Integer.parseInt(f19.getText()))break;
									if(f20.isSelected()&&cnt==31&&Integer.parseInt(name.split(" ")[1])<=Integer.parseInt(f23.getText()))break;
									if(f21.isSelected()&&cnt==31&&Integer.parseInt(name.split(" ")[1])!=Integer.parseInt(f23.getText()))break;
									if(f22.isSelected()&&cnt==31&&Integer.parseInt(name.split(" ")[1])>=Integer.parseInt(f23.getText()))break;
									if(f24.isSelected()&&cnt==43&&Integer.parseInt(name.split(" ")[1])<=Integer.parseInt(f27.getText()))break;
									if(f25.isSelected()&&cnt==43&&Integer.parseInt(name.split(" ")[1])!=Integer.parseInt(f27.getText()))break;
									if(f26.isSelected()&&cnt==43&&Integer.parseInt(name.split(" ")[1])>=Integer.parseInt(f27.getText()))break;
									if(f28.isSelected()&&cnt==52&&Integer.parseInt(name.split(" ")[1])<=Integer.parseInt(f31.getText()))break;
									if(f29.isSelected()&&cnt==52&&Integer.parseInt(name.split(" ")[1])!=Integer.parseInt(f31.getText()))break;
									if(f30.isSelected()&&cnt==52&&Integer.parseInt(name.split(" ")[1])>=Integer.parseInt(f31.getText()))break;								
										name=br.readLine();	
								
									cnt++;
									
								}
								if(cnt==55){
									String a="./src/PHD"+j+".txt";
									Hyperlink aa=new Hyperlink(a);
									data.add(new Student(name2,j,aa));
									
									
									
									File file = new File("./src/PHD"+j+".txt");


								    aa.setOnAction(new EventHandler<ActionEvent>() {

								        public void handle(ActionEvent e) {

								            try {

								Desktop.getDesktop().open(file);

								}
								            catch(IOException e1){}}});
									
							
								}
											
							} catch (IOException ee) {
								ee.printStackTrace();
							}
							
							
						} catch (FileNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
				}
	    		

				Parent root3 = FXMLLoader.load(getClass().getResource("sample2.fxml"));
			      Scene scene1 = new Scene(root3);
			     
			      Main.stage2.setTitle("MyFeedback");
			      Main.stage2.setScene(scene1);
			      Main.stage2.show();
			}
	 
	 }
	@Override
	public void initialize(URL location, ResourceBundle resources) 
	{	
		f1.getItems().clear();
		f1.getItems().addAll("Computer Science","Electronics and Communication","Computational Biology");
		category.getItems().clear();
		category.getItems().addAll("General","SC","ST","OBC");
		
	}
	 
}
