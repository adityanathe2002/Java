// wajp to divide the string into two parts abd store those parts into sepaerate string method
import java.util.Scanner;
class DivideString
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String : ");
		String s= new String(sc.next().toLowerCase());
		int divided=s.length()/2;
		String part1=new String();
		String part2=new String();

		if(s.length()%2==0)
		{
			for (int i=0;i<divided;i++) 
			{
				char ch=s.charAt(i);
				part1=part1+ch;
			}
			for(int i=divided;i<s.length();i++)
			{
				char ch1=s.charAt(i);
				part2=part2+ch1;
			}
		}
		else
		{
			System.out.println("Can not divided because string are not even");
		}
		System.out.println(part1);
		System.out.println(part2);
	}
}