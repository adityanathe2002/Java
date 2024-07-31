// write a java program to find first 10 numbers in the series  6, 24, 12, 48, 24, 96 

class NumberSeries1
{
	public static void main(String[] args) 
	{
		int[] series =new int [10];         // Array to hold the first 10 numbers in the series

		series[0]=6;                       // Initial value as given in the series

		for (int i=1;i<10 ;i++ )          // Generate the series based on the observed pattern
		{
			if(i % 2 !=0)
			{
				series[i]=series[i-1] * 4;       // For odd index, multiply by 4
			}
			else
			{
				series[i] = series[i - 1] / 2;  // For even index, divide by 2
			}
		}
		for(int i=0;i<10;i++)
		{
			System.out.print(series[i]+" ");   // Print the series
		}
	}
}

// output :- 6 24 12 48 24 96 48 192 96 384