class MethodExample5
{
	public static void main(String[] args)
	{
	   System.out.println("main Starts ");
	   ramesh();
	   System.out.println("Main Ends");	
	}
	public static void ramesh()
	{
		System.out.println("Ramesh Starts");
		suresh();
		System.out.println("Ramesh Ends");
	}
	public static void suresh()
	{
		System.out.println("Suresh Starts");
		mahesh();
		System.out.println("Suresh Ends");
	}
	public static void mahesh()
	{
		System.out.println("mahesh Starts");
		System.out.println("mahesh Ends");
	}
}