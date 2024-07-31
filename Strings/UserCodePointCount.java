class UserCodePointCount
{
	static String str=new String("ABCDEFGHIJ");
	public static void main(String[] args) 
	{
		int indx=userCodePointCount(1,4);
		System.out.println(str+" : "+ indx);
	}
	public static int userCodePointCount(int startIndx, int endIndx)
	{
		if(startIndx > endIndx)
		{
			throw new StringIndexOutOfBoundsException("Wrong Indx : "+ "[ "+startIndx+","+endIndx+" ]");
		}
		return endIndx - startIndx;
    }
}