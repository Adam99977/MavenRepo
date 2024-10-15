package encapsulation;

public class Encapsulation_Ex01 {
	
	private String name;
	private int roll_no;
	
	public void setvalue(String name,int roll_no)
	{
	this.name=name;
	this.roll_no=roll_no;
	}
	
	public void getvalue()
	{
		System.out.println("Name is = "+name);
		System.out.println("Roll_No is = " +roll_no);
	}
	

}
