import java.util.Scanner;
class UserConcat
{
	static String str1;
	static String str2;
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A String 1: ");
		str1 =sc.nextLine();

		System.out.print("Ener String 2 : ");
		str2 = sc.nextLine();
		String op=userConcat(str2);
		System.out.println(op);
	}	
	public static String userConcat(String str2 )
	{
		String op= str1+str2;
		return op;
	}
}