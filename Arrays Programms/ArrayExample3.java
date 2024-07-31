import java.util.*;
class ArrayExample3
{
	public static void main(String[] args) 
	{
		int[][][]a=new int[3][][];
		a[0]=new int[1][2];
		a[1]=new int[2][2];
		a[2]=new int[3][2];

		a[0][0][0]=10;
		a[0][0][1]=20;

		a[1][0][0]=30;
		a[1][0][1]=40;
		a[1][1][0]=50;
		a[1][1][1]=60;

		a[2][0][0]=70;
		a[2][0][1]=80;
		a[2][1][0]=90;
		a[2][1][1]=100;

		a[2][2][0]=110;
		a[2][2][1]=120;

		System.out.println(Arrays.deepToString(a));
	}
}