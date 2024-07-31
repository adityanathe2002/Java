class VowelandConsonent
{
	public static void main(String[] args) 
	{
		String arr="aieou";
		String vowel="";
		String consonat="";

		int vCount=0;
		int cCount=0;

		for (int i=0;i<arr.length();i++) 
		{
			if( i=='i'|| i =='e'|| i =='i'|| i =='o'|| i=='u')
			{
				vCount++;
			}
			else
			{
				cCount++;
			}
		}
		System.out.println("Vowel Count: "+vCount);
		System.out.println("Consonat Count: "+cCount);
	}
}