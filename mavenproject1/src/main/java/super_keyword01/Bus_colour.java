package super_keyword01;

public class Bus_colour extends Bus_Brand {
	
	public void display()
	{
		super.display();
		System.out.println("Colour is WHITE");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bus_colour obj = new Bus_colour();
		obj.display();
		
	}

}
