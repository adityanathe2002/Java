class FactorsMethod
{
	static int i=1;
	static int num =20;
	public static void main(String[] args) 
	{
		factors();
	}
	public static void factors()
	{
		if(num%i==0)
			{
				System.out.print(i+" ");
			}
		i++;
		if(i>=num)
		{
			return;
		}
		factors();
	}
}