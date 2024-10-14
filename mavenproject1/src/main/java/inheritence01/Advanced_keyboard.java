package inheritence01;

public class Advanced_keyboard extends Keyboard {
	
	public void display()
	{
		System.out.println("new keyboard");
	}

	public static void main(String[] args) {
		
		Keyboard obj = new Keyboard ();
		obj.display();
		
		Advanced_keyboard obj1 = new Advanced_keyboard();
		obj1.display();
	}

}
