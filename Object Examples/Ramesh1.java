class Ramesh1
{
	Ramesh1()
	{
		System.out.println("Hello from No ARGU CONS default");
	}
	private Ramesh1(int a)
	{
		System.out.println("Hello from 1 ARGU CONS private");
	}
	protected Ramesh1(int a, int b)
	{
		System.out.println("Hello from 2 ARGU CONS protected");
	}
	public Ramesh1(int a, int b, int c)
	{
		System.out.println("Hello from 2 ARGU CONS public");
	}
	public static void main(String[] args) 
	{
		Ramesh1 obj1 = new Ramesh1();
		Ramesh1 obj2 = new Ramesh1(10);
		Ramesh1 obj3 = new Ramesh1(10,20);
		Ramesh1 obj4 = new Ramesh1(10,20,30);
	}
}
