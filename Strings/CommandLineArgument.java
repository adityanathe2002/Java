import java.util.Arrays;
class CommandLineArgument
{
	public static void main(String[] args) 
	{
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);
		int add=num1+num2;
		int sub=num1-num2;
		int multi=num1*num2;
		int div=num1/num2;
		System.out.println("Addition is : "+add);
		System.out.println("Substraction is: "+sub);
		System.out.println("Multiplication is: "+multi);
		System.out.println("Division is : "+div);
	}
}