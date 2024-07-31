class UserCodePointAt
{
	static String str=new String("ABCDEFGHIJ");
	public static void main(String[] args) 
	{
		int indx=userCodePointAt(0);
		System.out.println(str+" : "+ indx);
	}
	public static int userCodePointAt(int indx)
	{
		if(indx<0  || indx>str.length()-1)
		{
			throw new StringIndexOutOfBoundsException("Wrong Indx : "+indx);
		}
		return str.charAt(indx);
    }
}