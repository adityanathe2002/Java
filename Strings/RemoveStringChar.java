import java.util.Scanner;
class RemoveStringChar
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter A String : ");
		String input=sc.next();

		System.out.println("Enter the char to remove for String: ");
		String ch=sc.next();

		String modified=input.replace(ch,"");
		System.out.println(modified);
	}
}