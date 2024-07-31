class ExceptionExample7
{
	public static void main(String[] args) 
	{
		Thread.currentThread().setName("Ramesh");
		try
		{
			System.out.println(20/0);
		}
		catch(ArithmeticException npe)
		{
			npe.printStackTrace();
		}
	}
}