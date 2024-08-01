// class Example1
// {
// 	String str ="Non Static Variable ";
// 	public static void main(String[] args) 
// 	{
// 	 System.out.println("Hello Main");
// 	 Example1 obj =new Example1();
// 	 obj.m1();
// 	}
// 	void m1()
// 	{
// 		System.out.println("Hello From m1()");
// 		System.out.println(str);
// 		m2();

// 	}
// 	void m2()
// 	{
// 		System.out.println("Hello From m2() ");
// 		System.out.println(str);
// 	}
// }

class Example
{
	Example()
	{
		super();  // call to obj class const
		System.out.println("Hi from Example");
	}
}
class ExampleA extends Example
{
	ExampleA()
	{
		super();   // call to parent class
		System.out.println("Hi from ExampleA No Argument Const");
	}
}
class Example1
{
	public static void main(String[] args) 
	{
		ExampleA obj = new ExampleA();
	}
}