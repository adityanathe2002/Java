import java.util.*;
class Sum1
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num =sc.nextInt();
		int sum=0;
		while(num!=0)
		{
			int rem=num%10;
			sum=sum+rem;
			num/=10;
		}
		System.out.println("sum of digit : " +sum);
	}
}

// {
// 	public static void main(String[] args) {
// 		Scanner sc =new Scanner(System.in);
// 		System.out.println("Enter a Nnumber : ");
// 		int num = sc.nextInt();
// 		int sum=0;
// 		while(num>0)
// 		{
// 			int rem=num%10;
// 			sum=sum+rem;
// 			num/=10;
// 		}
// 		System.out.println("Sum of digits :" +sum);
// 	}
// }