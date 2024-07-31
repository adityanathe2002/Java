import java.util.*;
class ArrayExample5
{
	public static void main(String[] args)
	{
		int [][][]a=new int [2][][];
		a[0]=new int[2][];
		a[0][0]=new int[1];
		a[0][1]=new int[2];

		a[0][0][0]=10;
		a[0][1][0]=20;
		a[0][1][1]=30;

		a[1]=new int[2][];
		a[1][0]=new int[1];
		a[1][1]=new int[3];

		a[1][0][0]=40;
		a[1][1][0]=50;
		a[1][1][1]=60;
		a[1][1][2]=70;

		System.out.println(Arrays.deepToString(a));
	}
}