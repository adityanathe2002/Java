import java.util.*;
class ArrayExample1
{
	public static void main(String[] args) 
	{
		int [][][]a = new int [2][][];
		a[0]=new int [3][];
		a[0][0]=new int[1];
		a[0][1]=new int[1];
		a[0][2]=new int[1];

		a[0][0][0]=10;
		a[0][1][0]=20;
		a[0][2][0]=30;

		a[1]=new int[2][];
		a[1][0]=new int [2];
		a[1][1]=new int [3];

		a[1][0][0]=40;
		a[1][0][1]=50;
		a[1][1][0]=60;
		a[1][1][1]=70;
		a[1][1][2]=80;

		System.out.println(Arrays.deepToString(a));

	}
}

