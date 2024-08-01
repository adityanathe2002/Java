class Demo52
{
	public static void main(String[] args) 
	{
		System.out.println("Helllo A");
	}
	 static void m1()
	{
		System.out.println("M1()");
	}
}
protected class Demo51
{
	public static void main(String[] args) 
	{
		System.out.println("Helllo ");
		Demo52.main(args);
		Demo52.m1();
	}
}
