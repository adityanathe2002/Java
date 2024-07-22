class EvenOddMethod
{
	static int num=1;
	public static void main(String[] args) 
	{
		evenNumbers();
	}
	public static void evenNumbers()
	{
		if(num%2==0)
		{
			System.out.print(num + " ");
		}
		num++;
		if(num>100)
		{
			return;
		}
		evenNumbers();
	}
}