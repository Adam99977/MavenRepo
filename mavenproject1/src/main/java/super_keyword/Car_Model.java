package super_keyword;

public class Car_Model extends Car_Vw {
	
String model ="Tigan";
public void display()
{

	System.out.println(model);
	System.out.println(super.Colour);
	System.out.println(super.Model);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car_Model obj =new Car_Model();
		obj.display();
		

	}

}
