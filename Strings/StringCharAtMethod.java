class StringCharAtMethod
{
	static String str ="Ramesh";
	public static void main(String[] args) 
	{
		for(int i=0;i<str.length();i++)
		{
			System.out.print(userCharAt(i)+" ");   // you have enter the index 
			//break;                              // we use break then print single word 
		}
	}
	public static char userCharAt(int indx)
	{
		//  if index>0 or index< length  then throw exception
		if(indx<0 || indx>=str.length())
		{
			throw new StringIndexOutOfBoundsException("wrong index");
		}
		//  store the string into Array
		char []arr=new char [str.length()];
		for (int i=0;i<str.length();i++ ) 
		{
			arr[i]=str.charAt(i);
		}
		return arr[indx]; 
	}
}