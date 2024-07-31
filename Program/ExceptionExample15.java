class ExceptionExample15
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println("Hi From Try");
			Thread.sleep(1000);
		}
		catch(InterruptedException ie)
		{
			System.out.println("InterruptedException Handle");
		}
		catch(Exception e)
		{
			System.out.println("Exception Handle");
		}
		catch (RuntimeException  re) 
		{
			System.out.println("RuntimeException Handle");
		}
	}
}