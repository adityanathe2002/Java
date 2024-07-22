// class EvenPattern
// {
// 	public static void main(String[] args)
// 	{ 
// 		int num=2;
// 		for(int i=2;i<=6;i++)
			
// 		    {
// 				for(int j=2;j<=i;j++)	
// 				{
// 					System.out.print(num +" ");
// 					num+=2;

// 				}
// 				System.out.println();
// 			}
// 	}
// }

class EvenPattern
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int k=1;k<=i;k--)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			
			System.out.println();
		}
	}
}