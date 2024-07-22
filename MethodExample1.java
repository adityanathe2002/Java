class MethodExample1
{
	public static void main(String[] args)
	{
		System.out.println("Execution starts");
		myMethod();
		checkEvenOdd(11);
		System.out.println("execution ends");
	}
	public static void myMethod()
	{
		System.out.println("Hello From My method");
	}
	public static void checkEvenOdd(int num)
	{
		if(num%2==0)
		{
		System.out.println(num + " is Even");
		}
		
		else
		{
			System.out.println(num + " Is Odd");
		}
	}	
}