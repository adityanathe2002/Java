class Demo5
{
	public static void main(String[] args)
	{
		System.out.println("Hi I Am Main");
		Demo5 obj1 =new Demo5();
        obj1.m1();
	}
	public void m1()
	{
		System.out.println("Hello from m1()");
		Demo6 obj2=new Demo6();
		obj2.m2();
	}
}
class Demo6
{
	public void m2()
	{
		System.out.println("Hello from m2()");
		m3();
	}
	public void m3()
	{
		System.out.println("Hello From m3()");
	}
}