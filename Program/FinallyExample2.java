class FinallyExample2
{
	public static void main(String[] args) 
	{
		System.out.println("Exception Starts");
		m1();
		System.out.println("Exception Ends");
	}
	static void m1();
	{
		System.out.println("m1() Starts");
		try
		{
			System.out.println("Try");
			System.out.println(10/0);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("ArithmeticException Handled");
		}
		finally
		{
			System.out.println("Hello finally");
		}
		System.out.println("m1() Ends");
	}
}