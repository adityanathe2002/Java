class ExceptionExample12
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println("Hi From Try");
			try
			{
				System.out.println("Inner Try");
				System.out.println(10/0);
			}
			catch(NullPointerException npe)
			{
				System.out.println("Inner npe Handled");
			}
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Hi from Catch");
		}
	}
}