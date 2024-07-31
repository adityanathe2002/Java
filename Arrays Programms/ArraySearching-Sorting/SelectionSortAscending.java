import java.util.Arrays;
class SelectionSortAscending
{
	public static void main(String[] args) 
	{
		int[] a ={4,2,1,3,5};
		selectionSort(a);
		System.out.println(Arrays.toString(a));
	}
	public static void selectionSort(int[] a)
	{
		for (int i=0;i<a.length;i++) 
		{
			int min=i;
			for(int j=i;j<a.length;j++)
			{
				if(a[min]>a[j])
				{
					min=j;
				}
			}
			int temp=a[min];
			a[min]=a[i];
			a[i]=temp;
		}
	}
}