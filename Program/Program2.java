class Parent
{
	void vehicle()
	{
		System.out.println("XUV***");
	}
	void money()
	{
		System.out.println("100000");
	}
}
class Child extends Parent
{
	void bike()
	{
		System.out.println("jawa***");
	}
}

class Program2
{
	public static void main(String[] args) 
	{
		Child obj=new Child();
		Parent obj1=new Child();
		Child obj2=(Child)obj1;
		obj2.vehicle();
		obj2.money();
		obj2.bike();	
	}
}