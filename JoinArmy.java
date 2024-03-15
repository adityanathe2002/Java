import java.util.Scanner;
class JoinArmy
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you are age : ");
		int age = sc.nextInt();
		if(age<18){
			System.out.println("You are not eligible try after "+(18-age)+"years.");
		}else{
			System.out.print("Enter your height in cm : ");
			int height = sc.nextInt();
			if (height<162){
				System.out.println(" You are cannot eligible ");
			}else {
				System.out.print("Enter your weight in kg : ");
                int weight = sc.nextInt();
                if(weight < 56){
                	System.out.println("Go and have get a some food and increase your weight "+(56-weight)+"kg.");
                }else{
                	System.out.println("Yiu are eligible to army");
                }
			}
			
		}
	}
}




