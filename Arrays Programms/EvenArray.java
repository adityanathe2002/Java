import java.util.*;
class EvenArray
{
	public static void main(String[] args) 
	{
		int evenNumber[]={1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<evenNumber.length;i++)
		
		{
			if(evenNumber[i]%2==0)
			{
				System.out.println(evenNumber[i]+" : even Number");
			}
		// 	else
		// 	{
		// 		System.out.println(evenNumber[i]+" : Odd ");
		// 	}
		}

	}
}