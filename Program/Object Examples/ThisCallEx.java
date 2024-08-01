class ThisCallEx
{
	ThisCallEx()
	{
		this(10);
		System.out.println("Hello From ThisCallEx() ");
	}
	ThisCallEx(int a)
	{
		this("Ramesh");
		System.out.println("Hello From ThisCallEx( int a )");
	}
	ThisCallEx(String b)
	{
		this(10,"Ramesh");
		System.out.println("Hello From ThisCallEx( String b) ");
	}
	ThisCallEx(int a, String b)
	{
		super();
		System.out.println("Hello From ThisCallEx (int a, String b)");
	}
	public static void main(String[] args) 
	{
		ThisCallEx a = new ThisCallEx();
	}
}