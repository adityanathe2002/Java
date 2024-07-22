class HollowPattern3
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if((i==1 || j==1 || j==5 || i==4) && (i==5 || j==5 || i==1 || j==3 ))
				// if(i==5 || j==5 || j==3 || i==1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
// * * * * *
// *       *
// *       *
// * * * * *
// *       *
// *       *

// class HollowPattern3
// {
// 	public static void main(String[] args)
// 	{
// 		for(int i=1;i<=6;i++)
// 		{
// 			for(int j=1;j<=6;j++)
// 			{
// 				if(i==6 || j==6 || j==3 || i==1)
// 				{
// 					System.out.print("* ");
// 				}
// 				else
// 				{
// 					System.out.print("  ");
// 				}
// 			}
// 			System.out.println();
// 		}
// 	}
// }

// class HollowPattern3
// {
// 	public static void main(String[] args)
// 	{
// 		for(int i=1;i<=5; i++)
// 		{
// 			for(int j=1;j<=5;j++)
// 			{
// 				if(i==5 || j==3 || i==1)
// 				{
// 					System.out.print("* ");
// 				}
// 				else
// 				{
// 					System.out.print("  ");
// 				}
// 			}
// 			System.out.println();
// 		}
// 	}
// }

// class HollowPattern3
// {
// 	public static void main(String[] args)
// 	{
// 		for(int i=1;i<=5; i++)
// 		{
// 			for(int j=1;j<=5;j++)
// 			{
// 				if(i==3|| j==1 || i==1 || i==5)
// 				{
// 					System.out.print("* ");
// 				}
// 				else
// 				{
// 					System.out.print("  ");
// 				}
// 			}
// 			System.out.println();
// 		}
// 	}
// }