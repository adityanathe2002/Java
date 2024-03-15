import java.util.Scanner;
class CalculateInterest
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Balance is : ");
		double balance = sc.nextDouble();
		System.out.print("Enter the annual interest rate is : ");
		double annualInterest = sc.nextDouble();
		//double monthlyInterest = annualInterest/12 ;
		//double interest = balance * monthlyInterest;
		double interest = balance * annualInterest/1200;
		System.out.println("the next month interest rate is : "+interest);		
	}
}