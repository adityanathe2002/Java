class DoWhileLoopExample
{
	public static void main(String[] args) 
	{
		int a[]={10,20,30,40};
		int i =0;
		do
		{
			System.out.println(a[i++]);
		}
		while(i<a.length);
	}
}