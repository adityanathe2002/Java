import java.util.Scanner;
class CalculateBmi
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your weight in pounds : ");
		double pounds = sc.nextDouble();
		System.out.print("Enter your Height in inch : ");
		double inch = sc.nextDouble();
		double kilos = pounds* 0.453592;
		double meters = inch *0.0254;
		double bmi = kilos / (meters * meters );
		System.out.println("Your BMI is "+bmi);
	}
}