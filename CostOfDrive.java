import java.util.Scanner;
class CostOfDrive
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the driving distance : ");
		double distance = sc.nextDouble();
		System.out.print("Enter Miles per gallon : ");
		double milesGallon = sc.nextDouble();
		System.out.print("Enter price per gallon : ");
		double priceGallon = sc.nextDouble();
		double cost = (distance / milesGallon)* priceGallon;
		System.out.println(" the cost of the trip is: $"+cost);
	}
}