// Find all even elements present in an array.
class FindEvenOfArray
{
	public static void main(String[] args) 
	{
		int []arr={2, 8, 5, 4, 7, 9};
		System.out.print("Even Element: ");
		for (int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
}