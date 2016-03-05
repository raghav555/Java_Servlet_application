package application;
//@Ishan_Pandita2014050
//@Ashutosh_Gupta2014139
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Alt {
	public static void fill(String []name) throws IOException{
		
    	PrintWriter out = null;
    	
    			
		        out = new PrintWriter(new BufferedWriter(new FileWriter("./src/"+name[59]+".txt", true)));
		        String aa=name[58].split(" ")[0];
		        
		        aa=aa.replace('-', '/');
		        aa=aa.replace("Jan", "01");
		        aa=aa.replace("Feb", "02");
		        aa=aa.replace("Mar", "03");
		        aa=aa.replace("Apr", "04");
		        aa=aa.replace("May", "05");
		        aa=aa.replace("Jun", "06");
		        aa=aa.replace("Jul", "07");
		        aa=aa.replace("Aug", "08");
		        aa=aa.replace("Sep", "09");
		        aa=aa.replace("Oct", "10");
		        aa=aa.replace("Nov", "11");
		        aa=aa.replace("Dec", "12");
		        String[] aaa=aa.split("/");
		        
		        System.out.println(aaa[2]+"/"+aaa[1]+"/"+aaa[0]);
		        out.println(aaa[2]+"/"+aaa[1]+"/"+aaa[0]);
		        out.println("Email "+name[0]);
		        out.println("Name "+name[1]);
		        out.println("Address_of_Correspondence "+name[2]);
		        out.println("Mobile "+name[3]);
		        out.println("PhD_Stream "+name[4]);
		        out.println("PhD_Area_Preference_1 "+name[5]);
		        out.println("PhD_Area_Preference_2 "+name[6]);
		        out.println("PhD_Area_Preference_3 "+name[7]);
		        
		        out.println("Gender "+name[8]);
		        
		        out.println("Category "+name[9]);
		        out.println("Physically_Disabled "+name[10]);
		        name[11]=name[11].replace('-', '/');
		        out.println("Date_Of_Birth "+name[11]);
		        out.println("Children/War_Widows_Of_Defence_Personnel_killed/Disabled_in_Action "+name[12]);
				out.println("Father's_Name "+name[13]);
				out.println("Nationality "+name[14]);
				out.println("Permanent_Address "+name[15]);
				out.println("Pin_Code "+name[16]);
				out.println("Xth_Board "+name[17]);
				out.println("Xth_Marks(%) "+name[18]);
				out.println("Year_of_Passing_Xth "+name[19]);
				out.println("XIIth_Board "+name[20]);
				out.println("XIIth_Marks "+name[21]);
				out.println("Year_of_Passing_XIIth "+name[22]);
				out.println("Degree "+name[23]);
				out.println("Department/Discipline "+name[24]);
				out.println("Name_of_College "+name[25]);
				out.println("Name_of_University "+name[26]);
				out.println("City "+name[27]);
				out.println("State "+name[28]);
				out.println("Year_of_Graduation "+name[29]);
				if(name[30].split(":")[0].equals("CGPA"))
				out.println("CGPA/MARKS "+Double.parseDouble(name[30].split(":")[1])*100);
				else out.println("CGPA/MARKS "+name[30].split(":")[1]);

				
					out.println("ECE_Preference1 " +name[32]);
					out.println("ECE_Preference2 "+name[33]);
					out.println("ECE_Preference3 "+name[34]);
					out.println("ECE_Preference4 "+name[35]);
					out.println("Name of College " +name[39]);
					out.println("City "+name[41]);
					out.println("State "+name[42]);
					out.println("Department/Discipline "+name[38]);
					out.println("Degree "+name[37]);
					out.println("Thesis_Title "+name[40]);
					out.println("Year_PG "+name[43]);
					if(name[44].equals(""))out.println("% NA");
					else if(name[44].split(":")[0].equals("CGPA"))
						out.println("% "+Double.parseDouble(name[44].split(":")[1])*100);
						else out.println("% "+name[44].split(":")[1]);
					out.println("Exam_Name " +name[46]);
					out.println("Subject "+name[47]);
					out.println("Year "+name[48]);
					out.println("Score "+name[49]);
					out.println("Rank "+name[50]);
					out.println("Gate_Area " +name[52]);
					out.println("Gate_Year_Of_Grad "+name[53]);
					out.println("Gate_Marks "+name[54]);
					out.println("Gate_Score "+name[55]);
					out.println("Gate_Rank "+name[56]);
					out.println("Achievements (Other information like ranks, medals etc.) "+name[57]);
					out.close();

	    	}
	  

	
	public static void main(String args[]) throws IOException{
		FileReader in = null;
		in = new FileReader("./src/Data_to_Import_with;(2).csv");
		BufferedReader br=new BufferedReader(in);
		String name=br.readLine();
		name=br.readLine();
		while(name!=null){
			String[] arr=name.split(",");
			fill(arr);
			name=br.readLine();
		}
}
	}