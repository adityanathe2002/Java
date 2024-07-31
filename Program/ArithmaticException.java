import java.util.*;
class ArithmaticException
{
	public static void main(String[] args) 
	{
		System.out.println("Main Method Start");
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter an num: ");
		int num=sc.nextInt();

		try
		{
			System.out.println(10/0);
		}
		catch(Exception e)
		{
			ae.printStackTrace();
			// System.out.println(e.getMessage());
			// e.getMessage();
		}
		System.out.println("Main Method Ends");
	}
}