class MissingNumber
{
	public static void main(String[] args) 
	{
		int num=24579;
		String str=""+num;
		for(char i=str.charAt(0);i<=(str.charAt(str.length()-1));i++)
		{
			if(!(str.contains(""+i)))
			{
				System.out.println(i);
			}
		}
	}
}