package inherience02;

public class Keyboard_Advanced extends Keyboard_New {
	
	public void display3()
	{
		System.out.println("advanced keyworld");
	}

	public static void main(String[] args) {
		
		Keyboard_Advanced obj =new Keyboard_Advanced();
		obj.display1();
		obj.display2();
		obj.display3();
		
				
	}

}
