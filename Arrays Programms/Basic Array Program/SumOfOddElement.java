// Find sum of all elements at odd indices in an array.

class SumOfOddElement
{
	public static void main(String[] args) 
	{
		int []arr={6,5,4,3,7,8,0};
		int sum=0;
		for (int i=0;i<arr.length;i++) 
		{
			if(i%2!=0)
			{
				sum+=arr[i];
			}
		}
		System.out.print("Sum Of Odd Elemnt = "+sum);
	}
}