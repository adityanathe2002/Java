import java.util.*;
class ArrayElementStoringExample
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		String[] names=new String[5];

		for(int i=0;i<names.length;i++)
		{
			System.out.print("Enter a Name : "+(i+1)+": ");
			names[i]=sc.next();
		}

		System.out.println(Arrays.toString(names));
	}
}