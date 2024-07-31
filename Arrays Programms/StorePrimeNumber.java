import java.util.Arrays;
class StorePrimeNumber 
{
	static int[]primeArray;
	// static int primeCount=0;
	public static void main(String[] args) 
	{
		int num=30;
		int primeCount=0;
		int primeIndx=0;
		for(int i=1;i<=num;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
					primeCount++;
				}
			}
			if(count==2)
			{
				primeArray[primeIndx++]=i;
			}
		}
		System.out.println(Arrays.toString(primeArray));
	// 	primeArray=new int[count];
	// 	int indx=0;
	// 	for(int j=2;j<=num;j++)
	// 	{
	// 		if(count==0)
	// 		{
	// 			primeArray[indx++]=j;
	// 		}
	// 	}
	// 	System.out.println(Arrays.toString(primeArray));
	 }
}