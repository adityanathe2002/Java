class ExceptionExample3
{
	 public static void main(String[] args) 
	 {
	 	System.out.println("hiii");
	 	try
	 	{
	 		System.out.println("Outer try");
	 		try
		 	{
		 		System.out.println("Inner try");
		 		System.out.println(10/0);
		 	}
		 	catch(NullPointerException npe)
		 	{
		 		System.out.println("Inner Catch Block");
		 	}
	 	}
	 	catch(ArithmeticException ae)
	 	{
	 		System.out.println("Arithmetic Exception handle catch 1");
	 	}
	 	catch(Exception i)
	 	{
	 		System.out.println("Outer catch 2");
	 	}
	 }
}