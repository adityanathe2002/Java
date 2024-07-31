// merged element of 2D Array
import java.util.Arrays;
class Merge2DArray
{
	public static void main(String[] args) 
	{
		int[][] a={{4,5,6},{3,2,1}};
		int len =0 ;
		for(int [] i : a)
		{	
			len +=i.length;
		}	
 
		int [] narr = new int [len];
		int indx =0;

        for (int [] i:a )
        {	
           for(int j : i)
           {
 	          narr[indx++]=j;
           }
        }   
 	    for (int i=0;i<narr.length;i++ ) 
 	    {
 	      	for(int j =i+1 ; j<narr.length ;j++)
 	      	{
	 	      	if(narr[i]>narr[j])
	 	      	{
		 	      	int temp = narr[i];
		 	      	narr[i] = narr[j];
		 	      	narr[j] =temp;
	 	        }
			}
		}
		System.out.println(Arrays.toString(narr));
    }
}