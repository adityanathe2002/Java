import java.util.Arrays;
class SelectionSortDescending
{
	public static void main(String[] args) 
	{
		int[] a ={4,2,1,3,5};
		selectionSort(a);
		System.out.println(Arrays.toString(a));
	}
	public static void selectionSort(int [] a)
	{
		for (int i=0;i<a.length;i++) 	
		{
			int max=i;
			for(int j=i;j<a.length;j++)
			{
				if(a[max]<a[j])
				{
					max=j;
				}
			}
			int temp=a[max];
			a[max]=a[i];
			a[i]=temp;
		}
	}
}