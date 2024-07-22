class PublicClassEx1
{
	public static void main(String[] args)
	{
		System.out.println("Hello from PublicClassEx1 ");
		PublicClassEx2.ramesh();
		suresh();
	}
	public static void suresh()
	{
		System.out.println("Hello from suresh() ");
	}
}
class PublicClassEx2
{
	public static void ramesh()
    {
	    System.out.println("Hello from PublicClassEx2()");
    }
}