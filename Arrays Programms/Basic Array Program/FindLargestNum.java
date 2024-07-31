class FindLargestNum
{
	public static void main(String[] args) 
	{
		int[]a={7, 84, 21,45,35};
		// int [] a={2,2,2};
		int max=0;
		max=a[0];
		for (int i :a ) 
		{
			if(i>max)
			{
				max=i;
			}
		}

		System.out.println(max+" ");
	}
}