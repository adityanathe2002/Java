// import java.util.*;

// class Loop3DArray
// {
// 	public static void main(String[] args) 
// 	{
// 		int[][][] a = {{{10,20},{30}},{{40,50,60}}};
// 		System.out.println(Arrays.deepToString(a));

// 		for(int i=0;i<a.length;i++)
// 		{
// 			for(int j=0;j<a[i].length;j++)
// 			{
// 				for(int k=0;k<a[i][j].length;k++)
// 				{
// 					System.out.print(+a[i][j][k]+" ");
// 				}
// 				System.out.println();
// 			}
// 		}
// 	}
// }

class Loop3DArray
{
	public static void main(String[] args) 
	{
		int[][][] a = {{{10,20},{30}},{{40,50,60}}};
		
		int i=0;
		while(i<a.length)
		{
			int j=0;
			while(j<a[i].length)
			{
				int k=0;
				while(k<a[i][j].length)
				{
					System.out.print(a[i][j][k++]+" ");
				}
				j++;
				System.out.println();
			}i++;
		}
	}
}

// class Loop3DArray
// {
// 	public static void main(String[] args) 
// 	{
// 		int[][][] a = {{{10,20},{30}},{{40,50,60}}};
		
// 		int i=0;
// 		do
// 		{
// 			int j=0;
// 			do
// 			{
// 				int k=0;
// 				do
// 				{
// 					System.out.print(a[i][j][k]+" ");
// 				}
// 				while(k<a[i][j].length);
// 				k++;
// 			}
// 			while(j<a[i].length);
// 			j++;
// 		}
// 		while(i<a.length);
// 		i++;
// 	}
// }

// class Loop3DArray
// {
// 	public static void main(String[] args) 
// 	{
// 		int [][][] a={{{10,20},{30}},{{40,50,60}}};

// 		for(int[][] i:a)
// 		{
// 			for (int []j:i ) 
// 			{
// 				for (int k :j ) 
// 				{
// 					System.out.print(k +" ");
// 				}
// 				System.out.println();
// 			}
// 		}
// 	}
// }