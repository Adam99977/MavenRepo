package method;

public class Static_Method {
	
	static String name;
	static int age;
	
	public static void setdetails(String student_name,int student_age)
	{
		name = student_name;
		age = student_age;
	}

	public static void getdetails() 
	{
	System.out.println("Student_Name = " +name);
	System.out.println("Student_Age = " +age);
	}
	
	public static void main (String args[])
	{
		Static_Method.setdetails("Adam",35);
		Static_Method.getdetails();
		
	}
}
