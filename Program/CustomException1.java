import java.util.Scanner;
class UserException extends RuntimeException
{
	UserException(String desc)
	{
		super(desc);
	}
}
class CustomException1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a num1: ");
		int num1=sc.nextInt();
		System.out.print("Enter a num2: ");
		int num2=sc.nextInt();
		if(num2==0)
		{
			try
			{
				throw new UserException("Dividing number by zero");
			}
			catch(UserException ue)
			{
				System.out.println(ue.getMessage());
			}
		}
		else
		{
			System.out.println(num1/num2);
		}
	}
}