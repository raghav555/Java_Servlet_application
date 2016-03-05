package application;
//Ishan Pandita_2014050
//Ashutosh Gupta_2014139
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;

public class Controller1 implements Initializable {
	@FXML
	private Label lab1;
	@FXML
	private Label lab2;
	@FXML
	AnchorPane anchor=new AnchorPane();
	@FXML
	AnchorPane anchor1=new AnchorPane();
	@FXML
	AnchorPane anchor2=new AnchorPane();
	@FXML
	AnchorPane anchor3=new AnchorPane();
	@FXML
	AnchorPane anchor4=new AnchorPane();
    @FXML
    private DatePicker date;
    @FXML
    private TextField ll1;
    @FXML
    private TextField ll2;
    @FXML
    private TextField ll3;
    @FXML
    private TextField ll4;
    @FXML
    private TextField ll5;
    @FXML
    private TextField kk1;
    @FXML
    private TextField kk2;
    @FXML
    private ComboBox<Integer>kk3;
    
    @FXML
    private TextField kk4;
    @FXML
    private TextField kk5;
    @FXML
    private TextField cc1;
    @FXML
    private TextField cc2;
    @FXML
    private ComboBox<String>cc3;
    @FXML
    private TextField cc4;    
    @FXML
    private TextField cc9;   
    @FXML
    private TextField cc12;   
    @FXML
    private TextField cc5;    
    @FXML
    private TextField cc6;   
    @FXML
    private ComboBox<Integer>cc7;
    @FXML
    private ComboBox<Integer>cc10;
    
    @FXML
    private TextField board1per;

    @FXML
    private ToggleGroup def;

    @FXML
    private RadioButton f10;

    @FXML
    private RadioButton cc8;

    @FXML
    private RadioButton cc11;

    @FXML
    private ComboBox<String> nation;

    @FXML
    private TextField board2;

    @FXML
    private TextField peraddr;

    @FXML
    private RadioButton f1;

    @FXML
    private RadioButton f2;

    @FXML
    private RadioButton f3;

    @FXML
    private RadioButton f4;

    @FXML
    private TextField board1;

    @FXML
    private RadioButton f5;

    @FXML
    private RadioButton f6;

    @FXML
    private RadioButton f7;

    @FXML
    private RadioButton f8;

    @FXML
    private RadioButton f9;

    @FXML
    private ComboBox<String> state;

    @FXML
    private RadioButton female;

    @FXML
    private TextField depart;

    @FXML
    private RadioButton ec;

    @FXML
    private CheckBox s1;

    @FXML
    private CheckBox s2;

    @FXML
    private CheckBox s3;

    @FXML
    private TextField fname;

    @FXML
    private CheckBox s4;

    @FXML
    private TextField board2per;

    @FXML
    private CheckBox s5;

    @FXML
    private CheckBox s6;



    @FXML
    private CheckBox s7;

    @FXML
    private CheckBox s8;

    @FXML
    private CheckBox s9;

    @FXML
    private RadioButton defn;

    @FXML
    private TextField degree;

    @FXML
    private CheckBox oadphd;

    @FXML
    private TextField name;

    @FXML
    private RadioButton defy;

    @FXML
    private TextField enroll;

    @FXML
    private ToggleGroup pwd;

    @FXML
    private RadioButton male;

    @FXML
    private RadioButton no;

    @FXML
    private Button submit;

    @FXML
    private TextField city;

    @FXML
    private TextField achieve;

    @FXML
    private CheckBox pgphd;

    @FXML
    private RadioButton sc;

    @FXML
    private RadioButton general;

    @FXML
    private ComboBox<Integer> yrofgrad;
    @FXML
    private ComboBox<String> ss1;  
    @FXML
    private ComboBox<String> ss2;   
    @FXML
    private ComboBox<String> ss3;   
    @FXML
    private ComboBox<String> ss4;

    @FXML
    private CheckBox s10;

    @FXML
    private Button save3;

    @FXML
    private ToggleGroup stream;

    @FXML
    private Button save1;

    @FXML
    private Button save2;

    @FXML
    private TextField nameofclg;

    @FXML
    private TextField email;

    @FXML
    private RadioButton cb;

    @FXML
    private RadioButton st;

    @FXML
    private TextField address;

    @FXML
    private ComboBox<Integer> board1yr;
    @FXML
    private ComboBox<Integer> board2yr;

    @FXML
    private RadioButton yes;

    @FXML
    private ToggleGroup sex;

    @FXML
    private TextField mobile;

    @FXML
    private TextField nameofuni;

    @FXML
    private RadioButton marks;

    @FXML
    private RadioButton cs;

    @FXML
    private ComboBox<String> phd1;

    @FXML
    private RadioButton obc;

    @FXML
    private ComboBox<String> phd2;

    @FXML
    private ComboBox<String> phd3;

    @FXML
    private ComboBox<String> outof;

    @FXML
    private CheckBox ecephd;

    @FXML
    private RadioButton cgpa;

    @FXML
    private CheckBox gatephd;

    @FXML
    private ToggleGroup category;

    @FXML
    private ToggleGroup first;
    @FXML
    private TextField pin;
   @FXML
   void css(){
	  phd1.getItems().clear();
       phd1.getItems().addAll("Artificial intelligence and robotics-Cse","Compilers-CSE","Computer architecture nd computer design-CSE","Computer graphics-CSE","computer vision-CSE","Image analysis and biometrics","Information managment and data engineering-CSE","machine Learning-CSE","Massively parallel systems-CSE","Mobile computing and netork applications-CSE","Program analysis-CSE","Security and privacy-CSE","Signal and image processing-CSE","Software engineering-CSE","Theoretical Computer science-CSE","Wireless networks-CSE");
       phd2.getItems().clear();
       phd2.getItems().addAll("Artificial intelligence and robotics-Cse","Compilers-CSE","Computer architecture nd computer design-CSE","Computer graphics-CSE","computer vision-CSE","Image analysis and biometrics","Information managment and data engineering-CSE","machine Learning-CSE","Massively parallel systems-CSE","Mobile computing and netork applications-CSE","Program analysis-CSE","Security and privacy-CSE","Signal and image processing-CSE","Software engineering-CSE","Theoretical Computer science-CSE","Wireless networks-CSE");
       phd3.getItems().clear();
       phd3.getItems().addAll("Artificial intelligence and robotics-Cse","Compilers-CSE","Computer architecture nd computer design-CSE","Computer graphics-CSE","computer vision-CSE","Image analysis and biometrics","Information managment and data engineering-CSE","machine Learning-CSE","Massively parallel systems-CSE","Mobile computing and netork applications-CSE","Program analysis-CSE","Security and privacy-CSE","Signal and image processing-CSE","Software engineering-CSE","Theoretical Computer science-CSE","Wireless networks-CSE");
   
   }
   
   @FXML
   void ecs(){
	   phd1.getItems().clear();
	   phd1.getItems().addAll("Computer architecture and system design-ECE","Controls and robotics-ECE","Digital and analog VLSI system design-ECE","Electromagnetics-ECE","Embedded and VLSI system design-ECE","Embedded systems-ECE","Fiber-Wireless architecture-ECE","Machine learning-ECE","OFDM based optical Access networks-ECE","Optical wireless communication systems-ECE","RF and mixed signal electronics-ECE","Signal and Image processing","Wireless Communication-ECE","Wireless Networks-ECE");
	   phd2.getItems().clear();
	   phd2.getItems().addAll("Computer architecture and system design-ECE","Controls and robotics-ECE","Digital and analog VLSI system design-ECE","Electromagnetics-ECE","Embedded and VLSI system design-ECE","Embedded systems-ECE","Fiber-Wireless architecture-ECE","Machine learning-ECE","OFDM based optical Access networks-ECE","Optical wireless communication systems-ECE","RF and mixed signal electronics-ECE","Signal and Image processing","Wireless Communication-ECE","Wireless Networks-ECE");
	   phd3.getItems().clear();
	   phd3.getItems().addAll("Computer architecture and system design-ECE","Controls and robotics-ECE","Digital and analog VLSI system design-ECE","Electromagnetics-ECE","Embedded and VLSI system design-ECE","Embedded systems-ECE","Fiber-Wireless architecture-ECE","Machine learning-ECE","OFDM based optical Access networks-ECE","Optical wireless communication systems-ECE","RF and mixed signal electronics-ECE","Signal and Image processing","Wireless Communication-ECE","Wireless Networks-ECE");
	  
   }   
   @FXML
   void cbs(){
	   phd1.getItems().clear();
	   phd1.getItems().addAll("Biophysics-CB","Structural Biology-CB","System Biology-CB");
	   phd2.getItems().clear();
	   phd2.getItems().addAll("Biophysics-CB","Structural Biology-CB","System Biology-CB");
	   phd3.getItems().clear();
	   phd3.getItems().addAll("Biophysics-CB","Structural Biology-CB","System Biology-CB");
   }
   @FXML
   void sub1(){
	if(ecephd.isSelected()){
		ss1.setDisable(false);
		ss2.setDisable(false);
		ss3.setDisable(false);
		ss4.setDisable(false);

	}
	else {
		ss1.setDisable(true);
		ss2.setDisable(true);
		ss3.setDisable(true);
		ss4.setDisable(true);

	}
	   	
   }
   @FXML 
   void sub2(){
	   if(pgphd.isSelected()){
			 cc1.setDisable(false);
				cc2.setDisable(false);
				cc3.setDisable(false);
				cc4.setDisable(false);
				 cc5.setDisable(false);
					cc6.setDisable(false);
					cc7.setDisable(false);
					cc8.setDisable(false); 
					cc9.setDisable(false);
					cc10.setDisable(false);
					cc11.setDisable(false);
					cc12.setDisable(false);
	   }
	   else{
			 cc1.setDisable(true);
				cc2.setDisable(true);
				cc3.setDisable(true);
				cc4.setDisable(true);
				 cc5.setDisable(true);
					cc6.setDisable(true);
					cc7.setDisable(true);
					cc8.setDisable(true); 
					cc9.setDisable(true);
					cc10.setDisable(true);
					cc11.setDisable(true);
					cc12.setDisable(true);
	   }
   }
   @FXML
   void sub3(){
	   if(oadphd.isSelected()){
			kk1.setDisable(false);
			kk2.setDisable(false);
			kk3.setDisable(false);
			kk4.setDisable(false);
			kk5.setDisable(false);
	   }
	   else{
			kk1.setDisable(true);
			kk2.setDisable(true);
			kk3.setDisable(true);
			kk4.setDisable(true);
			kk5.setDisable(true);
	   }
   }
   @FXML
   void sub4(){
	   if(gatephd.isSelected()){
			ll1.setDisable(false);
			ll2.setDisable(false);
			ll3.setDisable(false);
			ll4.setDisable(false);
			ll5.setDisable(false);
	   }
   else{
		ll1.setDisable(true);
		ll2.setDisable(true);
		ll3.setDisable(true);
		ll4.setDisable(true);
		ll5.setDisable(true);
   }
   }
   
    @FXML
    void submitted(){
    	int i=0;
    	PrintWriter out = null;
	    try {
			FileReader in = null;

	    	try {
	    	for( i=1000;true;i++){
	    		in = new FileReader("./src/PHD"+i+".txt");
				BufferedReader br=new BufferedReader(in);
	    	
			
	        
	    }}
	    	catch(FileNotFoundException e){
	    		Date date = new Date();
	    		
		        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		        String formattedDate = sdf.format(date);
		        //System.out.println(formattedDate);
		        out = new PrintWriter(new BufferedWriter(new FileWriter("./src/PHD"+i+".txt", true)));
		        out.println(formattedDate);
		        out.println("Email "+email.getText());
		        out.println("Name "+name.getText());
		        out.println("Address_of_Correspondence "+address.getText());
		        out.println("Mobile "+mobile.getText());
		        if(cs.isSelected())
		        out.println("PhD_Stream "+cs.getText());
		        if(ec.isSelected())
			        out.println("PhD_Stream "+ec.getText());
		        if(cb.isSelected())
			        out.println("PhD_Stream "+cb.getText());
		        out.println("PhD_Area_Preference_1 "+phd1.getValue());
		        out.println("PhD_Area_Preference_2 "+phd2.getValue());
		        out.println("PhD_Area_Preference_3 "+phd3.getValue());
		        
		        if(male.isSelected())
		        out.println("Gender "+male.getText());
		        else if(female.isSelected())out.println("Gender "+female.getText());
		        if(general.isSelected())out.println("Category "+general.getText());
		        if(sc.isSelected())out.println("Category "+sc.getText());
		        if(st.isSelected())out.println("Category "+st.getText());
		        if(obc.isSelected())out.println("Category "+obc.getText());
		        if(yes.isSelected())out.println("Physically_Disabled "+yes.getText());
		        if(no.isSelected())out.println("Physically_Disabled "+no.getText());
		       
					StringBuilder stringBuilder = new StringBuilder();
					stringBuilder.append("Date_Of_Birth ");
					stringBuilder.append(formattedDate);
					out.println(stringBuilder.toString());
				if(defy.isSelected())
					out.println("Children/War_Widows_Of_Defence_Personnel_killed/Disabled_in_Action "+defy.getText());
				if(defn.isSelected())out.println("Children/War_Widows_of_Defence_Personnel_killed/Disabled_in_Action "+defn.getText());
				out.println("Father's_Name "+fname.getText());
				out.println("Nationality "+nation.getValue());
				out.println("Permanent_Address "+peraddr.getText());
				out.println("Pin_Code "+pin.getText());
				out.println("Xth_Board "+board1.getText());
				out.println("Xth_Marks(%) "+board1per.getText());
				out.println("Year_of_Passing_Xth "+board1yr.getValue());
				out.println("XIIth_Board "+board2.getText());
				out.println("XIIth_Marks "+board2per.getText());
				out.println("Year_of_Passing_XIIth "+board2yr.getValue());
				out.println("Degree "+degree.getText());
				out.println("Department/Discipline "+depart.getText());
				out.println("Name_of_College "+nameofclg.getText());
				out.println("Name_of_University "+nameofuni.getText());
				out.println("City "+city.getText());
				out.println("State "+state.getValue());
				out.println("Year_of_Graduation "+yrofgrad.getValue());
				out.println("CGPA/MARKS "+board1per.getText());
				if(ecephd.isSelected())
				{
					out.println("ECE_Preference1 " +ss1.getValue());
					out.println("ECE_Preference2 "+ss2.getValue());
					out.println("ECE_Preference3 "+ss3.getValue());
					out.println("ECE_Preference4 "+ss4.getValue());
				}
				else
				{
					out.println("ECE Preference1 NA");
					out.println("ECE Preference2 NA");
					out.println("ECE Preference3 NA");
					out.println("ECE Preference4 NA");
				}
				if(pgphd.isSelected())
				{
					out.println("Name of College " +cc1.getText());
					out.println("City "+cc2.getText());
					out.println("State "+cc3.getValue());
					out.println("Department/Discipline "+cc4.getText());
					out.println("Degree "+cc5.getText());
					out.println("Thesis_Title "+cc6.getText());
					out.println("Year_PG "+cc7.getValue());
					
				}
				else
				{
					out.println("Name of College NA" );
					out.println("City NA");
					out.println("State NA");
					out.println("Department/Discipline NA");
					out.println("Degree Na");
					out.println("Thesis_Title NA");
					out.println("Year_PG NA");
				}
				if(cc8.isSelected())
				{
					out.println("% "+ Double.parseDouble(cc9.getText())/ (Double.parseDouble(""+cc10.getValue())*100));
				}
				else if(cc11.isSelected())
				{
					out.println("% "+ cc12.getText());
				}
				else 
				{
					out.println("% NA");
				}
				if(oadphd.isSelected())
				{
					out.println("Exam_Name " +kk1.getText());
					out.println("Subject "+kk2.getText());
					out.println("Year "+kk3.getValue());
					out.println("Score "+kk4.getText());
					out.println("Rank "+kk5.getText());
				}
				else
				{
					out.println("Exam_Name NA");
					out.println("Subject NA");
					out.println("Year NA");
					out.println("Score NA");
					out.println("Rank NA");
				}
				if(gatephd.isSelected())
				{
					out.println("Gate_Area " +ll1.getText());
					out.println("Gate_Year_Of_Grad "+ll2.getText());
					out.println("Gate_Marks "+ll3.getText());
					out.println("Gate_Score "+ll4.getText());
					out.println("Gate_Rank "+ll5.getText());
				}
				else
				{
					out.println("Gate Area Na");
					out.println("Gate Year Of Grad NA");
					out.println("Gate Marks NA");
					out.println("Gate Score NA");
					out.println("Gate Rank NA");
				}
				out.println("Achievements (Other information like ranks, medals etc.) "+achieve.getText());
	/*			if(f1.isSelected())
				{
					out.println("How did you first hear about the IIIT-Delhi PhD program? "+f1.getText());
				}
				if(f2.isSelected())
				{
					out.println("How did you first hear about the IIIT-Delhi PhD program? "+f2.getText());
				}
				if(f3.isSelected())
				{
					out.println("How did you first hear about the IIIT-Delhi PhD program? "+f3.getText());
				}
				if(f4.isSelected())
				{
					out.println("How did you first hear about the IIIT-Delhi PhD program? "+f4.getText());
				}
				if(f5.isSelected())
				{
					out.println("How did you first hear about the IIIT-Delhi PhD program? "+f5.getText());
				}
				if(f6.isSelected())
				{
					out.println("How did you first hear about the IIIT-Delhi PhD program? "+f6.getText());
				}
				if(f7.isSelected())
				{
					out.println("How did you first hear about the IIIT-Delhi PhD program? "+f7.getText());
				}
				if(f8.isSelected())
				{
					out.println("How did you first hear about the IIIT-Delhi PhD program? "+f8.getText());
				}
				if(f9.isSelected())
				{
					out.println("How did you first hear about the IIIT-Delhi PhD program? "+f9.getText());
				}
				if(f10.isSelected())
				{
					out.println("How did you first hear about the IIIT-Delhi PhD program? "+f10.getText());
				}
				if(s1.isSelected())
				{
					out.println("Why are you interested in the IIIT-Delhi PhD program? "+s1.getText());
				}
				if(s2.isSelected())
				{
					out.println("Why are you interested in the IIIT-Delhi PhD program? "+s2.getText());
				}
				if(s3.isSelected())
				{
					out.println("Why are you interested in the IIIT-Delhi PhD program? "+s3.getText());
				}
				if(s4.isSelected())
				{
					out.println("Why are you interested in the IIIT-Delhi PhD program? "+s4.getText());
				}
				if(s5.isSelected())
				{
					out.println("Why are you interested in the IIIT-Delhi PhD program? "+s5.getText());
				}
				if(s6.isSelected())
				{
					out.println("Why are you interested in the IIIT-Delhi PhD program? "+s6.getText());
				}
				if(s7.isSelected())
				{
					out.println("Why are you interested in the IIIT-Delhi PhD program? "+s7.getText());
				}
				if(s8.isSelected())
				{
					out.println("Why are you interested in the IIIT-Delhi PhD program? "+s8.getText());
				}
				if(s9.isSelected())
				{
					out.println("Why are you interested in the IIIT-Delhi PhD program? "+s9.getText());
				}
				if(s10.isSelected())
				{
					out.println("Why are you interested in the IIIT-Delhi PhD program? "+s10.getText());
				}*/
				enroll.setText(""+i);
				anchor1.setDisable(true);
				anchor2.setDisable(true);
				anchor3.setDisable(true);
				anchor4.setDisable(true);
	    	}
	    }
	    catch (IOException e) {
	        
	    }finally{
	        if(out != null){
	            out.close();
	        }
	        }
	    
    }
    
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		yrofgrad.getItems().clear();
        for(int i=2015;i>=1951;i--)
        yrofgrad.getItems().addAll(i);		
        board1yr.getItems().clear();
        for(int i=2013;i>=1951;i--)
        board1yr.getItems().addAll(i);
        board2yr.getItems().clear();
        for(int i=2015;i>=1951;i--)
        board2yr.getItems().addAll(i);        
        state.getItems().clear();
        state.getItems().addAll("Andaman and Nicobar Islands","Andhra Pradesh","Arunachal Pradesh","Assam","Bihar","Chandigarh","Chhattisgarh","Dadra and Nagar Haveli","Daman and Diu","Delhi","Goa","Gujarat","Haryana","Himachal Pradesh","Jammu & Kashmir","Jharkhand","Karnataka","Kerala","Lakshadweep","Madhya Pradesh","Maharashtra","Manipur","Meghalaya","Mizoram","Nagaland","Orissa","Puducherry","Punjab","Rajasthan","Sikkim","Tamil Nadu","Telangana","Tripura","Uttar Pradesh","Uttarakhand","West Bengal");
        outof.getItems().clear();
        outof.getItems().addAll("4","10");
        nation.getItems().clear();
        nation.getItems().addAll(
        		"Guatemala",
        		"Guinea",
        		"Guinea-Bissau",
        		"Guyana","India");
       ss1.getItems().clear();
        ss1.getItems().addAll("Advanced Signal Processing","Statistical Signal processing","Digital VLSI design","Analog CMOS design","Digital Communications","Communnication Networks","Linear systems","Introduction to robotics","RF circuit design","Antennas and propagation","Embedded systems");
        ss1.setDisable(true);
        ss2.getItems().clear();
        ss2.getItems().addAll("Advanced Signal Processing","Statistical Signal processing","Digital VLSI design","Analog CMOS design","Digital Communications","Communnication Networks","Linear systems","Introduction to robotics","RF circuit design","Antennas and propagation","Embedded systems");
        ss2.setDisable(true);
        ss3.getItems().clear();
        ss3.getItems().addAll("Advanced Signal Processing","Statistical Signal processing","Digital VLSI design","Analog CMOS design","Digital Communications","Communnication Networks","Linear systems","Introduction to robotics","RF circuit design","Antennas and propagation","Embedded systems");
        ss3.setDisable(true);
        ss4.getItems().clear();
        ss4.getItems().addAll("Advanced Signal Processing","Statistical Signal processing","Digital VLSI design","Analog CMOS design","Digital Communications","Communnication Networks","Linear systems","Introduction to robotics","RF circuit design","Antennas and propagation","Embedded systems");
        ss4.setDisable(true);
		//ss2.setDisable(true);
		//ss3.setDisable(true);
		//ss4.setDisable(true);
		 cc1.setDisable(true);
			cc2.setDisable(true);
			cc3.getItems().clear();
		       cc3.getItems().addAll("Andaman and Nicobar Islands","Andhra Pradesh","Arunachal Pradesh","Assam","Bihar","Chandigarh","Chhattisgarh","Dadra and Nagar Haveli","Daman and Diu","Delhi","Goa","Gujarat","Haryana","Himachal Pradesh","Jammu & Kashmir","Jharkhand","Karnataka","Kerala","Lakshadweep","Madhya Pradesh","Maharashtra","Manipur","Meghalaya","Mizoram","Nagaland","Orissa","Puducherry","Punjab","Rajasthan","Sikkim","Tamil Nadu","Telangana","Tripura","Uttar Pradesh","Uttarakhand","West Bengal");
		     cc10.getItems().clear();
		     cc10.getItems().addAll(4,10);
			cc3.setDisable(true);
			cc4.setDisable(true);
			 cc5.setDisable(true);
				cc6.setDisable(true);
				cc7.getItems().clear();
				for(int i=2015;i>=1951;i--)
				{
					cc7.getItems().addAll(i);
				}
				kk3.getItems().clear();
				for(int i=2015;i>=1951;i--)
				{
					kk3.getItems().addAll(i);
				}
				
				cc7.setDisable(true);
				cc8.setDisable(true); 
				cc9.setDisable(true);
				cc10.setDisable(true);
				cc11.setDisable(true);
				cc12.setDisable(true);
				kk1.setDisable(true);
				kk2.setDisable(true);
				kk3.setDisable(true);
				kk4.setDisable(true);
				kk5.setDisable(true);
				ll1.setDisable(true);
				ll2.setDisable(true);
				ll3.setDisable(true);
				ll4.setDisable(true);
				ll5.setDisable(true);

         
	}
	@FXML
	private void sss(){
	
		if(!lab1.getText().equals("No File Chosen")&&!lab2.getText().equals("No File Chosen")&&!email.getText().equals("")&&!name.getText().equals("")&&!address.getText().equals("")&&!mobile.getText().equals("")&&(ec.isSelected()||cb.isSelected()||cs.isSelected())&&phd1.getValue()!=null&&(male.isSelected()||female.isSelected())&&(general.isSelected()||sc.isSelected()||st.isSelected()||obc.isSelected())&&(yes.isSelected()||no.isSelected())&&date.getValue()!=null&&(defy.isSelected()||defn.isSelected())&&!fname.getText().equals("")&&nation.getValue()!=null&&!peraddr.getText().equals("")&&!board1.getText().equals("")&&!board1per.getText().equals("")&&Integer.parseInt(board1per.getText())<=100&&Integer.parseInt(board1per.getText())>=0&&board1yr.getValue()!=null&&!board2.getText().equals("")&&!board2per.getText().equals("")&&Integer.parseInt(board2per.getText())<=100&&Integer.parseInt(board2per.getText())>=0&&board2yr.getValue()!=null&&!degree.getText().equals("")&&!depart.getText().equals("")&&!nameofclg.getText().equals("")&&!nameofuni.getText().equals("")&&!city.getText().equals("")&&state.getValue()!=null&&yrofgrad.getValue()!=null&&!board1.getText().equals("")&&(!ecephd.isSelected()||(ecephd.isSelected()&&ss1.getValue()!=null&&ss2.getValue()!=null&&ss3.getValue()!=null))&&(!pgphd.isSelected()||(pgphd.isSelected()&&cc7.getValue()!=null))&&(!oadphd.isSelected()||(oadphd.isSelected()&&kk3.getValue()!=null))&&(!gatephd.isSelected()||(gatephd.isSelected()&&!ll2.getText().equals(""))))submit.setDisable(false);
		else {submit.setDisable(true);}
	}
@FXML
void file1() throws IOException {
	FileChooser fileChooser = new FileChooser();
	fileChooser.setTitle("Open File");
	File file = fileChooser.showOpenDialog(null);
	if (file != null){

String x1=file.getName();
int i=0;
FileReader in = null;
File  targetFile  = new File("./src/PHD"+ x1);

try {
for( i=1000;true;i++){
	in = new FileReader("./src/PHD"+i+".txt");
	BufferedReader br=new BufferedReader(in);



}}
catch(FileNotFoundException e){

String[]arr=x1.split("\\.");


	targetFile  = new File("./src/PHD"+i+"_CV."+arr[1]);}

Files.copy(file.toPath(), targetFile.toPath(),REPLACE_EXISTING);
lab1.setText( x1);
}



}
@FXML
void file2() throws IOException{
	FileChooser fileChooser = new FileChooser();
	fileChooser.setTitle("Open File");
	File file = fileChooser.showOpenDialog(null);
	if (file != null){

String x1=file.getName();
int i=0;
FileReader in = null;
File  targetFile  = new File("./src/PHD"+ x1);

try {
for( i=1000;true;i++){
	in = new FileReader("./src/PHD"+i+".txt");
	BufferedReader br=new BufferedReader(in);



}}
catch(FileNotFoundException e){

String[]arr=x1.split("\\.");


	targetFile  = new File("./src/PHD"+i+"_SOP."+arr[1]);}

Files.copy(file.toPath(), targetFile.toPath(),REPLACE_EXISTING);
lab2.setText( x1);
}
}
  
  

}
