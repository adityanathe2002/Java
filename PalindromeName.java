import java.util.*;
class PalindromeName
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a Name : ");
		String name=sc.next();
		String revname="";
		for (int i=name.length()-1;i>=0;i--)
		{
			revname+= name.charAt(i);
		}
		if (revname.equals(name))
		{
			System.out.println("Pallindrome Name");
		}
		else
		{
			System.out.println("Not Pallindrome Name");
		}
    }
}