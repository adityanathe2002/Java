class FinallyExample10
{
	public static void main(String[] args) 
	{
		System.out.println("Execution Starts");
		try
		{
			System.out.println("Try");
			System.out.println(10/0);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("ArithmeticException Handle");
			System.exit(0);
		}
		finally
		{
			System.out.println("Hello From finally");
		}
		System.out.println("Execution Ends");
	}
}
