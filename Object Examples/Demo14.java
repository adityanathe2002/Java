class Demo
{
	String name;

	Demo(String name)
	{
		this.name=name;
	}
	void demo()
	{
		System.out.println("Name: "+this.name);
	}
}
class Child extends Demo
{
	String place;

	protected Child(String place,String name)
	{
		super(name);
		this.place=place;
	}
	void child()
	{
		System.out.println("Place: "+this.place);
	}
}
class Demo14
{
	public static void main(String[] args) 
	{
		Child obj=new Child("Pune","Adi");
		obj.child();
	}
}