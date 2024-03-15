import java.util.scanner;
class Marksheet
{
	public static void main(String[] args) {
		Scanner Sc = new Scanner(Syetem.in);
		System.out.println("Enter the percentage : ");
        double percentage = sc.nextDouble();
        if(percentage>=90 && percentage<=100)
        {
        	System.out.println("You pass First class with distinction");
        }
        else if(percentage>=75 && percentage< 90);
        {
        	System.out.println("you pass with distinction ");
        }
        else if(percentage>=60&& percentage < 75);
        {
        	System.out.println("you pass with first class");
        }
        else if(percentage >=35 && percentage <60);
        {
        	System.out.println("you pass with second class");
        }
	}
}