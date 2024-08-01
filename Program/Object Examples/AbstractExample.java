import java.util.*;
abstract class Arithmatic
{
	abstract int addition(int num1,int num2);
	abstract int substraction(int num1,int num2);
	abstract int multiplication(int num1,int num2);
	abstract int division(int num1,int num2);
	abstract int modulas(int num1,int num2);
}
class Implementation extends Arithmatic
{
	int addition (int num1,int num2)
	{
		System.out.println("Addition : "+(num1+num2));
		return (num1+num2);
	}
	int substraction (int num1,int num2)
	{
		System.out.println("Substraction : "+(num1-num2));
		return(num1-num2);
	}
	int multiplication (int num1,int num2)
	{
		System.out.println("Multiplication : "+(num1*num2));
		return(num1* num2);
	}
	int division (int num1,int num2)
	{
		System.out.println("Division : "+(num1/num2));
		return(num1/num2);
	}
	int modulas (int num1,int num2)
	{
		System.out.println("Modulas : "+(num1%num2));
		return(num1 / num2);
	}
}

class AbstractExample
{
	public static void main(String[] args) 
	{ 
	   Scanner sc=new Scanner(System.in);
	   Implementation obj=new Implementation();
	   System.out.print("Enter Num 1: ");
	   int num1=sc.nextInt();
	   System.out.print("Enter num 2: ");
	   int num2=sc.nextInt();
	   obj.addition(num1,num2);
	   obj.substraction(num1,num2);
	   obj.multiplication(num1,num2);
	   obj.division(num1,num2);
	   obj.modulas(num1,num2);	
	}
}