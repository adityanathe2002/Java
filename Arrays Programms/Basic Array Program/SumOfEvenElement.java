// Find sum of all elements at even indices in an array.

class SumOfEvenElement
{
	public static void main(String[] args) 
	{
		int []arr={6,5,4,3,7,8,0};
		int sum=0;
		for (int i=0;i<arr.length;i++) 
		{
			if(i%2==0)
			{
				sum+=arr[i];
			}
		}	
		System.out.print(sum);
	}
}