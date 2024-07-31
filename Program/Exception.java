class Exception
{
	public static void main(String[] args) 
	{
		ModuleA obj=new ModuleA();
		obj.userOperation();
	}
}

class ModuleA
{
	public void userOperation()
	{
		int num1 =1;
		int num2=0;
		ModuleB obj=new ModuleB();
	
		try{
			obj.division(num1/num2);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("ArithmeticException Handeled");
		}
		catch(Exception e)
		{
			System.out.println("Exception Handeled");
		}
	}
}
class ModuleB
{
	void division(int num1,int num2) throws NullPointerException,ArithmeticException,IndexOutOfBoundsException;
	{
		System.out.println(num1/num2);
	}
}