abstract  class Parent
{
	abstract void m1();
	abstract void m2();
}
 class Implementation extends Parent
{
	void m1()
	{
		System.out.println("M1 () implements Parent");
	}
	void m2()
	{
		System.out.println("M2 () implements Parent");
	}
}
class Demo10
{
	public static void main(String[] args)
	{
		System.out.println("HelloS");
	}
}