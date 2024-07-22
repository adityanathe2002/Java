import java.util.*;
class SunnyNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a nmber : ");
		int num = sc.nextInt();
		int num1=num+1;
		boolean flag =false ; 
		int sqrrt=0;
		
		for(int i=1;i<=num1/2;i++)
		{
			if(i*i==num1)
			{
				flag=true;
				sqrrt= i;
				break;
			}
		}
		if(flag)
		{
			System.out.println(num1 + " is a Sunny Number");
		}
		else
		{
			System.out.println(num1 + " is not a Sunny Number");
		}

	}
}