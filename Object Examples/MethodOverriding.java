class Parent
{
	void greeting()
	{
		System.out.println("SUSHILA");
	}
}
class Child extends Parent
{
	void greeting()
	{
		System.out.println("Shila");
	}
}

class MethodOverriding
{
	public static void main(String[] args) 
	{
		Child obj = new Child();
		obj.greeting();
	}
}