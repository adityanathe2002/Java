import java.util.*;
class MethodExample2
{
	public static void main(String[] args)
	{
	    Scanner sc =new Scanner(System.in);
	    System.out.print("Enter a number : ");
	    int num =sc.nextInt();
	    int rev=reverseNumber(num);
	    isPalindrome(num,rev);	
	}
	public static int reverseNumber(int num)
	{
		int rev=0;
		while(num!=0)
		{
			int rem=num%10;
			rev =rev*10+rem;
			num/=10;
		}
		System.out.println(rev);
		return rev;
	}
	public static void isPalindrome(int num, int rev)
	{
		if(num==rev)
			System.out.println("Is palindrome");
		
	else
	{
		System.out.println("Not Palindrome");
	}
}
}