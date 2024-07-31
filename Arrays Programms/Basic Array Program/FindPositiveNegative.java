// Find count of positive and negative elements present in an array.
class FindPositiveNegative
{
	public static void main(String[] args) 
	{
		int[]arr={7, -6, 4, -1, 5};

		int positiveCount=0;
		int negativeCount=0;
		for (int i = 0 ; i < arr.length ; i++) 
		{
			if(arr[i]>0)
			{
				positiveCount++;
			}
			else 
			{
				negativeCount++;
			}
		}
		System.out.println("Positive Count: "+positiveCount);
		System.out.println("Negative Count: "+negativeCount);
	}
}