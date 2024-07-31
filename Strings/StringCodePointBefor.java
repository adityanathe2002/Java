class StringCodePointBefor
{
	public static void main(String[] args) 
	{
		String str=new String("ABCDE");
		for (int i=1;i<str.length();i++)
		{
			System.out.println(str.charAt(i)+" : "+ str.codePointBefore(i));
		}
	}
}