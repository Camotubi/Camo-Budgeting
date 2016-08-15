package money;

public class Expense {
	private float amount;
	private String date;
	private String description;
	
	public Expense(float money, String date, String description)
	{
		this.amount = money;
		this.date = date;
		this.description = description;
	}
	
	public void set_amount(float money)
	{
		this.amount = money;
	}
	

}
