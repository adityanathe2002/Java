// Find sum of all elements present in an array.

class SumOfArrayElement
{
	public static void main(String[] args) 
	{
		int[]arr={2,2,4,4,6,6};

		int sum=0;

		for (int i=0;i<arr.length;i++) 
		{
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}
}