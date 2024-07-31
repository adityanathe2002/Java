class SmallestElement
{
	public static void main(String[] args) 
	{
		int [] arr= {2,3,4,5,6,1};

		int min=0;

		min =arr[0];

		for (int i:arr) 
		{
			if(i<min)
			{
				min=i;
			}	
		}
		System.out.println(min+" ");

		// int max=0;

		// max =arr[0];

		// for (int i:arr) 
		// {
		// 	if(i>max)
		// 	{
		// 		max=i;
		// 	}	
		// }
		// System.out.println(max+" ");
	}
}