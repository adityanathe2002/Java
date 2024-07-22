class MethodExample4
{
	public static void main(String[] args) {
		for(int i=1;i<20;i++)
		{
			evenOdd(i);
		}
	}
	public static void evenOdd(int num)
	{
		if(num%2==0)
		{
			System.out.println(num + " -even");
		}
		else
		{
			System.out.println(num + " -odd");
		}
	}
}