class Parent
{

	void m1()
	{
		System.out.println("Hello");
	}
	void ad()
	{
		System.out.println("Heoo");
	}
}
class Child extends Parent
{
	void m1()
	{
		System.out.println("Hiii");
	}
	void bc()
	{
		System.out.println("bccccc");
	}
}

class ExampleClassCast
{
	public static void main(String[] args) 
	{
		System.out.println("Main Method Starts ");

		Child obj=new Child();
		obj.m1();

		Parent obj1=new Child();
		Child obj2=(Child)obj1;
		// obj2.bc();
		// obj2.ad();
		obj2.m1();

		System.out.println("Main Method End"); 	
		// try
		// {
			
		// }
		
	}
}