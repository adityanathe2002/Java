// import java.util.*;
// class SpyNumber
// {
// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner (System.in);
// 		System.out.print("Enter a number : ");
// 	    int num= sc.nextInt();
// 		int sum = 0;
// 		int prdt =1; 
// 		while(num!=0)
// 		{
// 			int rem =num%10;
// 			sum +=rem;
// 			prdt *=rem;
// 			num/=10;
// 		}
// 		  System.out.println((prdt==sum)?num+"spy number" :num +"not a spy number");
// 	}
// }

import java.util.*;
class SpyNumber
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num=sc.nextInt();
		int sum=0;
		int prdt=1;
		while(num!=0)
		{
			int rem=num%10;
			sum +=rem;
			prdt*=rem;
			num/=10;
		}
		if(sum==prdt)
		{
			System.out.println("It is a Spy Number");
		}
		else
		{
			System.out.println("It is Not a spy Number");
		}
	}
}