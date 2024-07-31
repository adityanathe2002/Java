// find the factor of num & store in Array

import java.util.Arrays;
class FactorsStore
{
	static int[]factorArray;
	static int factorCount=0;
	public static void main(String[]args) 
	{
		int num=12;
		for(int i=1;i<=num;i++) 
		{	
			if(num%i==0)
			{
				factorCount++;
			}
		}
		factorArray=new int[factorCount];
		int indx=0;
		for(int j=1;j<=num;j++)
		{
			if(num%j==0)
			{
				factorArray[indx++]=j;
			}
		}
		System.out.println(Arrays.toString(factorArray));
	}
}