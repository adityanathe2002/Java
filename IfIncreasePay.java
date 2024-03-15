import java.util.Scanner;
class IfIncreasePay
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Target Score");
		int targetScore = sc.nextInt();
		System.out.print("Enter pay :"); 
		double pay = sc.nextDouble();
		if(targetScore>90)
		{
			pay=pay+pay*3/100;
		}
		else
		{
            pay=pay+pay*1/100;
		}
		System.out.println("Total pay for this employee is :"+pay);
	}
}