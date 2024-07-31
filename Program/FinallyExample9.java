class FinallyExample9
{
	public static void main(String[] args) {
		System.out.println("Execution Starts");
		try{
			System.out.println("Try");
			Thread.sleep(1000);
		}
		catch(InterruptedException ie)
		{
			System.out.println("InterruptedException Handle");
			System.exit(0);
		}
		finally
		{
			System.out.println("Hello From Finally");
		}
		System.out.println("Execution Ends");
	}
}