import java.util.Scanner;
class Program
{
	int num;
}

class NullPointerExceptiion1
{
	static Program p;
	public static void main(String[] args) 
	{
		System.out.println("Main Start");
		Scanner sc=new Scanner (System.in);

		try
		{
			System.out.print("Enter an Number : ");
			Program p=new Program();
			p.num=sc.nextInt();

			try
			{
				System.out.println(p.num/0);
			}
			catch(Exception e1)
			{
				e1.printStackTrace();
			}
		}
		catch(Exception e2)
		{
			e2.printStackTrace();
		}
		System.out.println("Main End");
	}
}