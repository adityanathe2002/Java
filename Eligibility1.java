
import java.util.Scanner;
class Eligibility1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Percentage : ");
		double percentage = sc.nextDouble();
		if (percentage >=60 )
		{
			System.out.println("you are  eligible ");
		}
	    else{
	    	System.out.println("You are not eligible");
	    }
	}
}5