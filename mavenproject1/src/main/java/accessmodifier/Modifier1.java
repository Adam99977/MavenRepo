package accessmodifier;

public class Modifier1 {
	public void display()
	{
		System.out.println("Hello World1");
	}
	protected void display1()
	{
		System.out.println("Hello World2");
	}
	 void display2()
	{
		System.out.println("Hello World3");
	}
	private void display3()
	{
		System.out.println("Hello World4");
	}
	

	public static void main(String[] args) {
		Modifier1 obj = new Modifier1();
		obj.display();
		Modifier1 obj1 = new Modifier1();
		obj1.display1();
		Modifier1 obj2 = new Modifier1();
		obj2.display2();
		Modifier1 obj3 = new Modifier1();
		obj3.display3();
		
		
		

	}

}
