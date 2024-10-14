package aggrigation;

public class Aggrigatin_Ex02 {
	
	String city;
	int pin;
	
	Aggrigation_Ex01 ref;//Aggregation
	
	public Aggrigatin_Ex02(String city, int pin,Aggrigation_Ex01 ref)
	{
	this.city = city;
	this.pin = pin;
	this.ref=ref;
	}
	
	public void display()
	{
		System.out.println(ref.name+ " "+ref.roll_no);
		System.out.println(city+ " "+pin);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aggrigation_Ex01 obj = new Aggrigation_Ex01("Arun",01);
				Aggrigatin_Ex02 obj1 =new Aggrigatin_Ex02("Marthandam",629170,obj);//Calling by using reference variable
				obj1.display();

	}

}
