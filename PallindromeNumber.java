import java.util.*;
class PallindromeNumber
{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num=sc.nextInt();
		int dup =num;
		int rev=0;
		while (num>0)
		{
			int rem=num%10;
			rev =rev*10+rem;
			num/=10;
		}
		if(dup==rev)
		{
			System.out.println("It is Pallindrome");
		}
		else
		{
			System.out.print("Not Pallindrome");
		}
	}
}