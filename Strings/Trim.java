import java.util.Scanner;
class Trim
{
	static String str;
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter An String: ");
		str=sc.nextLine();

		String str1=userTrim();
		System.out.println(str+" : "+ str.length());
		System.out.println(str1+" : "+ str1.length());
	}
	public  static String userTrim()
	{
		String op="";
		int indx=0;
		for (int i=0;i<str.length();i++) 
		{
			if(str.charAt(i)!=' ')
			{
				indx=i;
				break;
			}
		}
		op=str.substring(indx);
		for(int i=str.length()-1;i>=0;i--)
		{
			if(str.charAt(i)!=' ')
			{
				indx=i;
				break;
			}
		}
		op=op.substring(0,indx-1);
		System.out.println(op+" : "+(op.length()));
		return op;
	}
}