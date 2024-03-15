import java.util.Scanner;
class EnergyCalculate
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the ammount in Kilogram : ");
		double waterMass = sc.nextDouble();
		System.out.print("Enter the initial temperature in celsius : ");
		double initialTemoerature = sc.nextDouble();
		System.out.print("Enter the final temperature in celsius : ");
		double finalTemoerature = sc.nextDouble();
		double energy = waterMass *(finalTemoerature - initialTemoerature)*4184;
		System.out.println("The energy needed to : "+ energy);
	}
}