class Parent
{
	public static void m1()
	{
		System.out.println("RBI:"+8.0+"%");
	}
}
class Child extends Parent
{
	public static void m1()
	{
		System.out.println("SBI:"+8.5+"%");
	}
}

class MethodOverloading
{
	public static void main(String[] args) 
	{
		Child obj=new Child();
		obj.m1();
	}
}