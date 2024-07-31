class FindLengthOfArray3
{
	public static void main(String[] args) 
	{
		String names []={"Karthik","Raj"};
		System.out.println(names.length); // length--> 2

		System.out.println(names[1]); // Raj

		for(int i=0;i<names.length;i++)
		{
			System.out.println(names[i]);  //Karthik,  Raj
		}
	}
}