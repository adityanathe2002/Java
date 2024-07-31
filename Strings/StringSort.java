import java.util.Arrays;
import java.util.Scanner;
class StringSort
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A String: ");
		String str=sc.next();
		System.out.println(sort(str));
	}
	public static char[] sort(String str)
	{
		int []arr=new int[str.length()];
		for (int i=0;i<str.length();i++) 
		{
			arr[i]=str.codePointAt(i);
		}
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int c=arr[i];
					arr[i]=arr[j];
					arr[j]=c;
				}
			}
		}
		char[] strAr=new char [str.length()];
		for(int i=0;i<arr.length;i++)
		{
			strAr[i]=(char)arr[i];
		}
		// System.out.println(Arrays.toString(arr));
		return strAr;
	}
}