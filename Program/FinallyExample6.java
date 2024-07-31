class FinallyExample6
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println("Outer try");
			try
			{
				System.out.println("Inner Try");
			}
			catch(NullPointerException npe)
			{
				System.out.println("Inner Catch");
			}
			finally
			{
				System.out.println("Inner finally");
				System.out.println(10/0);
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
			System.out.println("Outer finally");
		}
	}
}