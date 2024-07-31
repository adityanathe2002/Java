class FinallyExample3
{
	public static void main(String[] args) 
	{
		System.out.println("Exception Starts");
		m1();
		System.out.println("Exception Ends");
	}
	static void m1()
	{
		System.out.println("m1() Starts ");
		try{
			System.out.println("try");
			System.out.println(10/0);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("ArithmeticException Handled");
			return;  //chala jaaa
		}
		finally
		{
			System.out.println("Helllo Finally");
		}
		System.out.println("m1() ends");
	}
}