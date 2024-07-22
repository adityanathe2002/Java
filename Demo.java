public class Demo
{
	public static void main(String[] args) {
		System.out.println("Hi from Demo main()");
		Demo1.m1();
	}
}
public class Demo1
{
	public static void m1()
	{
		System.out.println("Hi from m1() ");
		Demo2.m2();
	}
}
public class Demo2
{
	public static void m2()
	{
		System.out.println("Hi from m2()");
	}
}