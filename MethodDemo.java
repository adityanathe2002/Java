class MethodDemo
{
	static int number =1;
	public static void main(String[] args) 
	{
		printNumbers();
	}
	public static void printNumbers()

	{
		System.out.println(number);
		++number;
		if(number>10)
			return;

		printNumbers();
	}
}