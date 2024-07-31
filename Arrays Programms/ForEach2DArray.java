class ForEach2DArray
{
	public static void main(String[] args) 
	{
		int [][]a={{10,20},{30,40,50},{60,70,80,90}};
		for (int[]i :a ) 
		{
			for (int j:i ) 
			{
				System.out.print(j+" ");
			}
		System.out.println();

		}
	}
}

// class ForEach2DArray
// {
// 	public static void main(String[] args) 
// 	{
// 		int[][]a={{10,20},{30,40,50},{60,70,80,90}};

// 		int i=0;
// 		while(i<a.length)
// 		{
// 			int j=0;
// 			while(j<a[i].length)
// 			{
// 				System.out.print(a[i][j++]+" ");
// 			}
// 			i++;
// 			System.out.println();
// 		}
// 	}
// }

// class ForEach2DArray
// {
// 	public static void main(String[] args) 
// 	{
// 		int[][]a={{10,20},{30,40,50},{60,70,80,90}};

// 		int i=0;
// 		do
// 		{
// 			int j=0;
// 			do
// 			{
// 			    System.out.print(a[i][j++]+" ");
// 			}
// 			while(j<a[i].length);
// 		}
//         while(i<a.length);
//         i++;
// 			System.out.println();

//     }   
// }

// class ForEach2DArray
// {
// 	public static void main(String[] args) 
// 	{
// 		int[][] a={{10,20},{30,40,50},{60,70,80,90}};

// 		for(int i=0;i<a.length;i++)
// 		{
// 			for(int j=0;j<a[i].length;j++)
// 			{
// 				System.out.print(a[i][j]+" ");
// 			}
// 			System.out.println();
// 		}
// 	}
// }

// class ForEach2DArray
// {
// 	public static void main(String[] args) {
// 		char [][] a = {{'A','B'},{'C','D','E'},{'F','G','H','I'}};

// 		// Using forEach loop
// 		for(char [] i :a)
// 		{
// 			for(char j :i)
// 			{
// 				System.out.print(j);
// 			}
// 		System.out.println();

// 		}
// 	}
// }