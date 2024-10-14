package method;

public class method_Factorial {
	
	public static int factorial(int num)
	{
		int result = 1;
		for(int i=1;1<=num;i++)
		{
			result = result*1;
		}
		return result;
	}
	
	public static void display_factorial(int num)
	{
	int fact = factorial(num);
	System.out.println("factorial of" + num + "is"+fact);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display_factorial(5);
	}

}
