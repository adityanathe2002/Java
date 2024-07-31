// Find all prime elements present in an array.
class FindPrimeOfArray
{
	public static void main(String[] args) 
	{
		int [] arr={2, 8, 5, 4, 7, 9};
		int count=0;
		for (int i=2;i<arr.length;i++) 
		{
			if(arr%i==0)
			{
				count++;
				break;
			}
		}

	}
}