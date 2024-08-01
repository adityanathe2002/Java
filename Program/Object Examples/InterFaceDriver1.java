interface Parent1
{
	void m1();
}
interface Parent2
{
	void m2();
}
interface Child extends Parent1,Parent2
{
	void m3();
}
class Implementation implements Child
{
	
	public void m3()
	{
		System.out.println("implements to m3()");
	}
	public void m2()
	{
		System.out.println("implements to m2()");
	}
	public void m1()
	{
		System.out.println("implements to m1()");
	}
}

class InterFaceDriver1
{
	public static void main(String[] args) 
	{
		Implementation obj=new Implementation ();
		obj.m3();
		obj.m1();
		obj.m2();
	}
}