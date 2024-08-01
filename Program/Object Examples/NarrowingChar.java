class NarrowingChar
{
	public static void main(String[] args) 
	{
		char a=1;
		byte b =(byte) a;
		short c =(byte) a;
		int d =  a;
		long e = a;
		float f = a;
		double g = a;
		{
			System.out.println(c);
		}
	}
}