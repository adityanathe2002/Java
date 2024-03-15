import java.util.Scanner;
class PositiveNegativeLadder
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = sc.nextInt();
		if(num> 0)
		{
			System.out.println("It is positive");
		}
		else if(num<0)
		{
			System.out.println("It is Negative");
		}
		else if(num==0)
		{
            System.out.println(" It is Neutral");
		}
		else
		{
			System.out.println(" Invalid I/p");
		}
	}
}