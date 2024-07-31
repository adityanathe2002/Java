import java.util.*;
class ArrayExample6
{
	public static void main(String[] args) 
	{
		// int [][]a=new int[2][3];   we can creat this type
		int[][]a=new int[2][];
		a[0]=new int[3];
		a[1]=new int[3];

		a[0][0]=10;
		a[0][1]=20;
		a[0][2]=30;
		
		a[1][0]=40;
		a[1][1]=50;
		a[1][2]=60;

		System.out.println(Arrays.deepToString(a));
	}
}