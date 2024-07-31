import java.util.*;
class TwoDArray
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a row : ");
		int rows=sc.nextInt();
		System.out.print("Enter a column: ");
		int cols =sc.nextInt();

		int [][]arr=new int [rows][cols];
		for (int i=0;i<rows ;i++ ) 
		{
			for(int j=0;j<cols;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("________________");
		for (int i=0;i<rows ;i++ ) 
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}