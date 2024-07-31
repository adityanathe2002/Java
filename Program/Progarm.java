class Program
{
	public static void main(String []args)
	{
		System.out.println("Main Start");
		try
		{
			System.out.println(10/0);
		}
		catch (Exception ae)
		{
			System.out.println("Exception Hanadle");
		}
		System.out.println("Main Ends");
	}
}