import java.util.*;
class PrimeMethod
{
	static int num=7;
	static int i =2;
	static boolean flag=true;
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.print(" Enter a Number : ");
		num =sc.nextInt();
		primeNumber();
		if(flag)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not prime");
		}
	}
	public static void primeNumber()
	{
		if(i==num)
			return;
		if(num%i==0)
		{
			flag=false;
			return;
			
		}
		i++;

		primeNumber();
	}
}