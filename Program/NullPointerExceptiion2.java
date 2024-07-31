import java.util.Scanner;
class Demo
{
	int num;
}

class NullPointerExceptiion2
{
	static Demo d;
	public static void main(String[] args) 
	{
		System.out.println("main Start");
		Scanner sc=new Scanner(System.in);

		try
		{
			System.out.print("Enter an Option: ");
			// Demo d=new Demo();
			d.num=sc.nextInt();

			System.out.println(d.num/0);
			NullPointerExceptiion2.d.num=67;
			System.out.println(NullPointerExceptiion2.d.num);
		}
		catch (ArithmeticException e1)
		{
			e1.printStackTrace();
		}
		catch(NullPointerException e2)
		{
			e2.printStackTrace();
		}
	}
}