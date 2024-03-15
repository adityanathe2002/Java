import java.util.Scanner;
class ThirdLargeValue
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the num1 : ");
		int num1 = sc.nextInt();
		System.out.print("Enter the num2 : ");
		int num2 = sc.nextInt();
		System.out.print("enter the num3 : ");
		int num3 = sc.nextInt();
		int max1 = (num1<num2)?num2 : num1;
		int max2 = (num3<max1)?max1 : num3;
		System.out.println(num1 +" ,"+num2 +" ,"+num3+"Largest among 3 number is " + max2);
	}
}