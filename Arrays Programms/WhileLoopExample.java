import java.util.*;
class WhileLoopExample
{
	public static void main(String[] args) 
	{
		int []a={10,20,30,40};

		int i=0;
		while(i<=a.length-1)
		{
			System.out.println(a[i++]);
		}
	}
}