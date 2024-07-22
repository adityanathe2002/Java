// class MethodExample3
// {
// 	public static void main(String[] args) 
// 	{
// 		for(int i=2; i<=50;i++)
// 		{
// 			isPrime(i);
// 		}
// 	}
// 	public static void isPrime(int num)
// 	{
// 		boolean flag=true;
// 		for(int i=2;i<num;i++)
// 		{
// 			if(num%i==0)
// 			{
// 				flag=false;
// 				break;
// 			}
// 		}

// 		if(flag)
// 		{
// 			System.out.println(num + " is Prime");
// 		}
// 		else
// 		{
// 			System.out.println(num + " not Prime");
// 		}
		
//     }

// }


import java.util.*;
class MethodExample3
{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num=sc.nextInt();
		int count=0;
		for(int i=2;i<num ; i++)
		{
			if(num%i==0)
			{
				count++;
				break;
			}
		}
		if(count==0)
			System.out.print("Prime");
		else 
			System.out.print("Not Prime");
	}
}