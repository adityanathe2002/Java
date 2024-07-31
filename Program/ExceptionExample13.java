class ExceptionExample13
{
	public static void main(String[] args) {
		try{
			System.out.println("Hello From try");
			String str=null;
			System.out.println(str.isEmpty());
		}
		catch(ArithmeticException ae)
		{
			System.out.println("ArithmeticException Handle");
		}
		catch(RuntimeException re)
		{
			System.out.println("RuntimeException Handle");
		}
		catch(NullPointerException npe)
		{
			System.out.println("NullPointerException Handle");
		}
	}
}