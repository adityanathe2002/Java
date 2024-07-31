// Create a clone of 3D array without using clone().
import java.util.Arrays;
class Clone3DArray
{
	public static void main(String[] args) 
	{
		int[][][] arr={{{1,2},{2,3}},{{4,5},{5,6}}};
		int[][][] cloneArray;
		int count=0;
		for (int i=0;i<arr.length;i++) 
		{
			count++;
		}
		cloneArray=new int[count][][];
		int indx=0;
		for(int i=0;i<arr.length;i++)
		{
			cloneArray[indx++]=arr[i];
		}
		System.out.println(Arrays.deepToString(cloneArray));
	}
}

// import java.util.Arrays;
// class Clone3DArray
// {
// 	public static void main(String[] args) {
// 		int[][][] arr={{{1,2},{2,3}},{{4,5},{5,6}}};
// 		System.out.println(Arrays.deepToString(arr));
// 	}
// }