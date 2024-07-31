class FinallyExample7
{
	public static void main(String[] args) 
	{
		System.out.println("Exception Starts");
		try
		{
			System.out.println("Outer try");
			try
			{
				System.out.println("Inner Try");
			}
			finally
			{
				System.out.println("Inner finally");
			}
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Outer catch 1");
		}
		catch(Exception e)
		{
			System.out.println("Outer catch 2");
		}
		finally
		{
			System.out.println("Outer finally ");
			System.out.println(10/0);
		}
	}
}