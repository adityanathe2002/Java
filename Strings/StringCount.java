import java.util.Scanner;
class StringCount
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String  data=sc.next();
		System.out.println("Enter the character to get the count: ");
		char ch=sc.next().charAt(0);
		int count=0;
		for (int i=0;i<data.length();i++) 
		{
			char ch2=data.charAt(i);
			if(ch==ch2)
			{
				count++;
			}
		}
		System.out.println("Count of "+ ch + " is "+count);
	}
}