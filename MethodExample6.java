import java.util.*;
class MethodExample6
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num=sc.nextInt();
		boolean flag = isPrime(num);
		if(flag)
		{
			int rev=rev(num);
			boolean flag1=primeTwo(rev);
				if(flag && flag1)
					{
						System.out.println("Emirp Number");
					}
						else
					{
						System.out.println("Not a Emirp number");
		
					}
		}
		else	
		{
			System.out.println("Not Emirp");
		}

	}
	public static boolean isPrime(int num)
	{
		int count = 0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				count++;
				break;
			}
		}
		 boolean flag = count==0?true:false;
		 return flag;
	}
	public static int rev(int num)
	{
			int rev= 0;
			while(num>0)
			{
				int rem =num%10;
				rev= rev*10+rem;
				num/=10;
			}
			return rev;
	}
	public static boolean primeTwo(int rev)
	{
		boolean flag1 = isPrime(rev);
		return flag1;
	}

			
}