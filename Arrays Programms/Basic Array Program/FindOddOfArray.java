// Find all odd elements present in an array.
class FindOddOfArray
{
	public static void main(String[] args) 
	{
		int[]arr={2, 8, 5, 4, 7, 9};
		System.out.print("Odd Element: ");

		for (int i=0;i<arr.length;i++) 
		{
			if(arr[i]%2!=0)
			{
				System.out.print(arr[i]+" ");
			}	
		}	
	}
}