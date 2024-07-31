// Create a clone of 2D array without using clone().
import java.util.Arrays;
class Clone2DArray
{
	static int count=0;
	public static void main(String[] args) 
	{
		int[][]arr={{5,6,4},{7,3,8}};
		int[][]cloneArray;

		for (int i=0;i<arr.length;i++) 
		{
				count++;
		}
		cloneArray=new int[count][];
		int indx=0;
		for (int i=0;i<arr.length;i++) 
		{
			cloneArray[indx++]=arr[i];
		}
		System.out.println(Arrays.deepToString(cloneArray));
	}
}