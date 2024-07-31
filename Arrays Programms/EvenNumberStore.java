import java.util.*;
class EvenNumberStore
{
	public static void main(String[] args) 
	{
		int [] arr={1,2,3,4,5,6,7,8};
		// find the count of even numbers
		int count=0;
		for (int i:arr ) 
		{
			if(i%2==0)
				count++;
		}
		int[] evenNumbers=new int[count];
		// index var to store element in evennumbers array
		int indx=0;
		// find even and store in new array
		for(int i: arr)
		{
			// check if element is even and store it by increamenting the index by 1
			if(i%2==0)
				evenNumbers[indx++]=i;
		}
		System.out.println(Arrays.toString(evenNumbers));
	}
}