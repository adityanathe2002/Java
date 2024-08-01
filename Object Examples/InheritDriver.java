class Parent
{
	String str1="Hi From Parent Class";
	void m1()
	{
		System.out.println("Hello From Parent m1()");
	}
	static void m3()
	{
		System.out.println("Hello From m3() static Parent");
	}
}
class Child extends Parent
{
	String str2="Hi From Child Class";
	void m2()
	{
		System.out.println("Hello From Child Class m2()");
		//System.out.println(super.str1);
	}
	static void m4()
	{
		System.out.println("Hello From m4() static Child");
	}
}
class InheritDriver
{
	public static void main(String[] args) 
	{
		Child obj=new Child();
		obj.m2();
		System.out.println(obj.str1);
		obj.m1();
		System.out.println(obj.str2);
		obj.m3();
		obj.m4();
	}
}
