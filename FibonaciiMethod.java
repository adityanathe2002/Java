class FibonaciiNumber
{
	static int i=1;
	static int num1=0;
	static int num2=1;
	static int op =0;
	public static void main(String[] args) 
	{
		fibonacii();
	}
	public static void fibonacii()
	{
		op=num1+num2;
		num1=num2;
		num2=op;
		System.out.println(" "+ op);
		i++;
		if(i>10)
		{
			return;
		}
		fibonacii();
	}
}