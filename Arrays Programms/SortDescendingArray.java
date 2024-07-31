
import java.util.*;
class SortArrayDescending 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<size;i++) 
        {
            arr[i] = sc.nextInt();
        }
        // Bubble sort algorithm for descending order
        for (int i=0;i<size-1;i++) 
        {
            for (int j=0;j<size-1-i;j++) 
            {
                if (arr[j]<arr[j+1]) 
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted array in descending order: "+Arrays.toString(arr));
    }
}
