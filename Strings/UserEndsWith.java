import java.util.Scanner;
class UserEndsWith
{
	static String str;
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A String: ");
		str=sc.nextLine();
		System.out.println("Enter string to check: ");
		String str1=sc.next();
		boolean op=userEndsWith(str);
		System.out.println(str+ " : "+op);
	}
	public static boolean userEndsWith(String str1)
	{
		boolean flag=true;
		for (int i=str1.length()-1, j=str.length()-1 ; i>=0; i--,j--) 
		{
			char ch=str1.charAt(i);
			if(ch!=str.charAt(j))
			{
				flag=false;
				break;
			}
		}
		return flag;
	}
}