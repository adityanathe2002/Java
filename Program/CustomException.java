import java.util.Scanner;
class AgeException extends ArithmeticException
{
	AgeException(String desc)
	{
		super(desc);
	}
}
class CustomException
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your Age : ");
		int age=sc.nextInt();

		if(age<18)
		{
			throw new AgeException("age is under 18");
		}
		else
		{
			System.out.println("Hi you are ELigible");
		}
	}
}