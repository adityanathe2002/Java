class ExceptionExample6
{
	public static void main(String[] args) 
	{
		System.out.println("Hello");

		try
		{
			System.out.println("Outer try block");
			System.out.println(10/0);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("ArithmeticException Handle Outer catch Block 1");
			try
			{
				System.out.println("Inner try Block");
				System.out.println(10/0);
				// String[] arr= new String[0];
				// System.out.println(arr[1]);
			}
			catch(ClassCastException cce)
			{
				System.out.println("Inner catch Block");
			}
		}
		catch(NullPointerException npe)
		{
			System.out.println("Outer catch Block 2");
		}
		finally
		{
			System.out.println("Byeeeee");
		}
	}
}