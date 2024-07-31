import java.util.*;
class UserEqualsIgnoreCase
{
	static String str;
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		str=sc.nextLine();
		System.out.print("Enter the String to compare : ");
		String nstr = sc.nextLine();
		System.out.println(userEqualsIgnoreCase(nstr));
	}
	public static boolean userEqualsIgnoreCase(String nstr)
	{
		boolean flag = false;
		if(str.toLowerCase().equals(nstr.toLowerCase()))
			flag = true;

		return flag;
	}
}