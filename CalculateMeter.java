import java.util.Scanner;
class CalculateMeter
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length in feet:");
		double feet = sc.nextDouble();
		double meters = feet*0.305;
		System.out.println(feet+"feet is equal to"+meters+"meters.");
	}
}