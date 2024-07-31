class FinallyExample1
{
	public static void main(String[] args) 
	{
		System.out.println("Exception Start");

		int i=1;
		while(i<=10);
		{
			System.out.println(i);
			i++;
		}
		try{
			System.out.println("Try Bye");
			System.out.println(10/0);
		}
		finally
		{
			System.out.println("Hello From finally");
		}
	}
}