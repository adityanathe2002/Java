import java.util.*;
class Program1
{
	static Program2 p;

	public static void main(String[] args) 
	{
		System.out.println("Main Method Starts");

		try
		{
			System.out.println(p.a);
		}
		catch(Exception ae)
		{
			ae.printStackTrace();
			// System.out.println(ae.getMessage());
		}
		System.out.println("Main Method End");
	}
}
class Program2
{
	int a = 420;
}