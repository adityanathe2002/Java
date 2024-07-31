class ExceptionExample11
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println("Hii From Try");
			System.out.println(10/0);
			try
			{
				System.out.println("INNER Try");
				System.out.println(10/0);
			}
			catch(NullPointerException npe)
			{
				System.out.println("Inner npe Handled");
			}
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Hi From catch");
		}
	}
}