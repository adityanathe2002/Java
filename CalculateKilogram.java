import java.util.Scanner;
class CalculateKilogram
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in );
		System.out.print("Enter the number in pounds :");
		double pounds = sc.nextDouble();
		double kilogram = pounds *0.454;
		System.out.println(pounds +"pound is equal to "+ kilogram+ "kilogram.");
	}
}