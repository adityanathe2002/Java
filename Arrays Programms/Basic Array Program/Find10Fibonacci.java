import java.util.*;
class Find10Fibonacci
{
	public static void main(String[] args) 
	{
		int num1=0;
		int num2=1;
		int op=0;
		
		int [] a=new int [10];
		a[0]=0;
		a[1]=1;
		int indx=2;
		for (int i=2;i<=10;++i) 
		{
			op=num1+num2;
			a[indx++]=op;
			num1=num2;
			num2=op;
			if(indx==10)
				break;
		}
		System.out.println(Arrays.toString(a));
	}
}