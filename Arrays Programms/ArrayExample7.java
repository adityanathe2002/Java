import java.util.*;
class ArrayExample7
{
	public static void main(String[] args) {
		int[][]a=new int[3][];
		a[0]=new int[2];
		a[1]=new int[1];
		a[2]=new int[2];

		a[0][0]=10;
		a[0][1]=20;
		a[1][0]=30;
		a[2][0]=40;
		a[2][1]=50;

		System.out.println(Arrays.deepToString(a));
	}
}