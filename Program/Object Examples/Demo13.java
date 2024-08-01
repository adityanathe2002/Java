interface Parent1 
{
	Parent1()
	{
		super();
	}
	public void m1()
	{
		System.out.println("Hello");
	}
}
interface Parent2
{
	Parent2()
	{
		super();
	}
	public void m1()
	{
		System.out.println("Bye");
	}
}
interface Child extends Parent1,Parent2
{
	Child()
	{
		super();
	}
	public void m2()
	{
		System.out.println("m2()");
		// Parent1.super.m1();
		// Parent2.super.m2();
	}
	
}

class Demo13
{
	public static void main(String[] args) 
	{
		Child obj=new Child();
		
	}
}