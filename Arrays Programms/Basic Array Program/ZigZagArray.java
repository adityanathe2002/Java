// Perform Zig Zag merging of arrays.

import java.util.Arrays;
class ZigZagArray
{
	public static void main(String[] args) 
	{
		int [] a={1,2,3};
		int [] b={4,5,6,7,8};
		int max=((a.length)>(b.length))? a.length:b.length;
		int [] c=new int [(a.length)+(b.length)];

		int indx=0;
		for (int i=0;i<max;i++) 
		{
			if(i<a.length)
				c[indx++]=a[i];
			c[indx++]=b[i];
		}
		System.out.println(Arrays.toString(c));
	}
}