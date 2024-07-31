class ExceptionExample5
{
	public static void main(String[] args) 
	{
		System.out.println("Hiiii");
		try
		{
			System.out.println("Outer Try Block");

			try
			{
				System.out.println(10/0);
			}
			catch(NullPointerException npe)
			{
				System.out.println("Inner Catch Block");
			}
		}
		catch(ClassCastException cce)
		{
			System.out.println("Outer catch Block 1");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Outer catch Block 2");
		}
	}
}