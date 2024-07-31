import java.util.Scanner;
class UserStartsWith
{
	static String str;
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A String: ");
		str=sc.nextLine();
		System.out.print("Enter string to check: ");
		String str1=sc.next();
		System.out.print("Enter a Index: ");
		int searchIndx=sc.nextInt();
		boolean op=userStartsWith(str1,searchIndx);
		System.out.println(str+ " : "+op);
	}
	public static boolean userStartsWith(String str1)
	{
		boolean flag=true;
		for (int i=0;i<str1.length();i++) 
		{
			char ch=str1.charAt(i);
			{
				flag=false;
				break;
			}
		}
		return flag;
	}
	public static boolean userStartsWith(String str1,int startIndx)
	{
		if(startIndx<0 && startIndx>str.length())
		{
			throw new StringIndexOutOfBoundsException("Wrong Indx: "+startIndx);
		}
		boolean flag=true;
		for(int i=startIndx;i<str1.length();i++)
		{
			char ch=str1.charAt(i);
			if(ch!=str.charAt(i))
			{
				flag=false;
				break;
			}
		}
		return flag;
	}
}