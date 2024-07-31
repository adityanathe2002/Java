class ReversedCommandLineArgs
{
	public static void main(String[] args) 
	{
		reverse();
	}
	public String reverse(args a)
	{
		for (int i=a.length()-1;i>=0;i--) 
		{
			System.out.print(args[i]);
		}
		System.out.println();
	}
}