class ExceptionExample4
{
	public static void main(String[] args) 
	{
		System.out.println("Hii");
		try
		{
			System.out.println("Outer try");
			try
			{
				String [] arr= new String[0];
				System.out.println(arr[1]);
			}
			catch(ClassCastException cce)
			{
				System.out.println("Inner catch");
			}
		}
		catch (NullPointerException npe) 
		{
			System.out.println("Outer catch 1");
		}
		catch(RuntimeException re)
		{
			System.out.println("Outer catch 2");
		}

	}
}
