class ArmStrongNumber
{
	public static void main(String[] args) 
	{
		int num =150;
		int length=0;
		int dup=num;
		int dup1=num;
		int sum=0;
		while(num!=0)
		{
			length++;
			num/=10;
		}
		while (dup>0)
		{
			int rem =dup%10;
			int power=1;
			for(int i=1;i<=length;i++)
			{
				power=power+rem;
			}
			sum+=power;
			dup/=10;
		}
		if(sum == dup1)
		{
			System.out.println("ArmStrong Number");
		}
		else
		{
			System.out.println("Not ArmStrong Number");
		}
	}
}