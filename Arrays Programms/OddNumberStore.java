import java.util.*;
class OddNumberStore
{
	public static void main(String[] args) 
	{
		int []arr={1,2,3,4,5,6,7,8};
		int count =0;
		for (int i :arr ) 
		{
			if(i%2!=0)
				count++;
		}
		int[]oddNumbers=new int[count];
		int indx=0;
		for (int i :arr ) 
		{
			if(i%2!=0)
				oddNumbers[indx++]=i;
		}
		System.out.println(Arrays.toString(oddNumbers));
	}
}