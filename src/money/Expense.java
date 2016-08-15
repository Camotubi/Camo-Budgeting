package money;
import java.util.Date;

public class Expense {
	private float amount;
	private Date date;
	private String description;
	
	public Expense(float money, Date date, String description)
	{
		this.amount = money;
		this.date = date;
		this.description = description;
	}
	
	//---Setters
	public void set_amount(float money)
	{
		this.amount = money;
	}
	
	public void set_date(Date date)
	{
		this.date = date;
	}
	
	public void set_description(String description)
	{
		this.description = description;
	}
	
	//---Getters
	public float get_amount()
	{
		return this.amount;
	}
	
	public Date get_date()
	{
		return this.date;
	}
	
	public String get_description()
	{
		return this.description;
	}
	
	//---
	public String get_Date_str()
	{
		return this.date.toString();
	}
}
