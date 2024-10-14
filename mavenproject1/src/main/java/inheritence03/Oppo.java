package inheritence03;

public class Oppo extends Iphone {
	
	public void display()
	{
		System.out.println("Oppo is best");
		super.display1();
		this.display2();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Oppo obj = new Oppo();
		obj.display();
		
	}
}


