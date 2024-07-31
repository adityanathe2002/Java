class ExceptionExample2
{
	static ExceptionExample2 e;
	int a =45;
	public static void main(String[] args) {
		System.out.println("MAin Sytart");
		try{
			System.out.println("Karthik is good boy");
			System.out.println(10/0);
		}
		catch(Exception e1)
		{
			e.printStackTrace();
			try{
				System.out.println(e.a);
			}
			catch(Exception e2)
		}
	}
} 