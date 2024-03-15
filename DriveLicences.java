import java.util.Scanner;
class DriveLicences
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print(" enter yor age : ");
		int age = sc.nextInt();
		if ( age < 18 )
		{
			System.out.println("You are kid try after "+(18-age)+"years.");
		}else {
			System.out.print(" Enter your marks in RTO exam : ");
			int marks = sc.nextInt();
			if(marks>=60){
				System.out.println("you are eligible to Licences");
			}else{
				System.out.println("You are not eligible .");
			}
		}
		
	}
}