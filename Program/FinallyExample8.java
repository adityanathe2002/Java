class FinallyExample8
{
	public static void main(String[] args) 
	{
		System.out.println("Execution Starts");
		try{
			Thread.currentThread().join();
		}
		catch(InterruptedException ie)
		{
			System.out.println("InterruptedException handle");
		}
		finally
		{
			System.out.println("Hello from finally");
		}
		System.out.println("Execution Ends");
	}
}