abstract class Parent
{
	abstract void m1();
	abstract void m2();
	void m3()
	{
		System.out.println("Hello Parent");
	}
}

abstract class Child1 extends Parent
{
	void m2()
	{
		System.out.println("M2 implements Child1");
	}
	abstract void m4();
}

class Child2 extends Parent
{
	void m1()
	{
		System.out.println("M1 implements Child2");
	}
	void m2()
	{
		System.out.println("M2 implements Child2");
	}
	void m5()
	{
		System.out.println("Hello Child2");
	}
}

class SubChild1 extends Child1
{
	void m1()
	{
		System.out.println("M1 implements SubChild1");
	}
	void m4()
	{
		System.out.println("Hello SubChild1");
	}
}

class AbstractExample2
{
	public static void main(String[] args) 
	{
		SubChild1 obj=new SubChild1();
		obj.m1();
		obj.m2();
		obj.m3();
		obj.m4();
		System.out.println();
		Child2 obj1=new Child2();
		obj1.m1();
		obj1.m5();
		obj1.m2();
	}
}