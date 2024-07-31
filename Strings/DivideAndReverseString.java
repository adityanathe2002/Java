import java.util.Scanner;
class DivideAndReverseString
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String : ");
		String s= new String(sc.next().toLowerCase());
		int divided=s.length()/2;
		String part1=new String();
		String part2=new String();
		String rev1=new String();
		String rev2=new String();

		if(s.length()%2==0)
		{
			for (int i=0;i<divided;i++) 
			{
				char ch=s.charAt(i);
				part1=part1+ch;
			}
			for (int i=divided;i>=0;i--) 
			{
				char ch =s.charAt(i);
				rev1=rev1+ch;
			}
			for(int i=divided;i<s.length();i++)
			{
				char ch1=s.charAt(i);
				part2=part2+ch1;
			}
			for(int i=s.length()-1;i>=divided;i--)
			{
				char ch=s.charAt(i);
				rev2=rev2+ch;
			}
		}
		else
		{
			System.out.println("Can not divided because string are not even");
		}
		System.out.println(part1);
		System.out.println(part2);
		System.out.println(rev1);
		System.out.println(rev2);
	}
}