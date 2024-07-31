import java.util.Arrays;
class FindSmallestNum
{
	public static void main(String[] args) 
	{
		int[]a={7, 84, 21,45,35};
		int min=0;
		min=a[0];
		for (int i :a ) 
		{
			if(i<min)
			{
				min=i;
			}
		}

		System.out.println(min+" ");
	}
}