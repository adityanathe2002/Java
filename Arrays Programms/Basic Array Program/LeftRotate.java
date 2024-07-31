// 43. Write a java program to Rotate an array ‘k’ times forward.(left- rotate)
// arr[] = {1,2,3,4,5}; k=2
// output: 3,4,5,1,2
// class LeftRotate
// {
// 	public static void main(String[] args) 
// 	{
// 		int a[] = {1,2,3,4,5}; 
// 		int k=4;
// 		for(int i=k;i<a.length;i++)
// 		{
// 			System.out.print(a[i]+" ");
// 		}
// 		for(int j=0;j<k;j++)
// 		{
// 			System.out.print(a[j]+" ");
// 		}
// 	}
// }
class LeftRotate
{
	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4,5}; 
		int k=2;
		for(int i=a.length-k;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		for(int j=0;j<=k;j++)
		{
			System.out.print(a[j]+" ");
		}
	}
}