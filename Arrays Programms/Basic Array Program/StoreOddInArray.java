// Find odd elements and store it in a new array
import java.util.*;
class StoreOddInArray
{
	public static void main(String[] args) 
	{
		int[] arr={1, 2, 3, 4, 5, 6};

		int count=0;

		for (int i:arr) 
		{
			if(i%2!=0)
				count++;
		}
		int [] oddNumber=new int[count];
		int indx=0;
		for(int i:arr)
		{
			if(i%2!=0)
				oddNumber[indx++]=i;
		}
		System.out.println("Odd Array: "+ Arrays.toString(oddNumber));
	}
}