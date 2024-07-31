import java.util.*;
class FindLengthOfArray1
{
	public static void main(String[] args) 
	{
		int[]arr={10,20,30,40,50,60};
		int lngth=0;
		for (; ; ) 
		{
			try
			{
				System.out.println(arr[lngth++]);
			}
			catch(ArrayIndexOutOfBoundsException i)
			{
				break;
			}
		}
		System.out.println(lngth);
	}
}