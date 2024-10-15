package polymorphism;

public class Child extends Parent {
	 public void display()
	 {
		    int a = 10;
			int b = 20;
			int c = a-b;
			System.out.println(c);
			super.display();
	 }

	public static void main(String[] args) {
		Child obj = new Child();
		obj.display();

	}

}
