package application;
//Ishan Pandita_2014050
//Ashutosh Gupta_2014139
import java.util.Date;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.Hyperlink;

public class Student {

	SimpleStringProperty category;
	SimpleIntegerProperty amount;	
	Hyperlink dt;

	public Student(String category, int amount,Hyperlink dt )
	{
		this.category=new SimpleStringProperty(category);
		this.amount=new SimpleIntegerProperty(amount);
		this.dt=(dt);
	}

	public String getCategory()
	{
		return category.get();
	}

	public Integer getAmount()
	{
		return amount.get();
	}

	public Hyperlink getDt()
	{
		return dt;
	}

	public void setCategory(String category)
	{
		this.category.set(category);
	}

	public void setAmount(Integer amount)
	{
		this.amount.set(amount);
	}

	public void setDate(Hyperlink dt)
	{
		this.dt=(dt);
	}
}
