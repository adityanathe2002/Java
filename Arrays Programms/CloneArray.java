import java.util.Arrays;
class CloneArray
{
	public static void main(String[] args) 
	{
		int[] arr={4,5,6};
		int [] cloneArray;
		int count=0;
		for (int i=0;i<arr.length;i++) 
		{
			conut++;
		}
		cloneArray=new int [count];
		int indx=0;
		for(int i=0;i<arr.length;i++)
		{
			cloneArray[indx++]=i;
		}
		System.out.println(Arrays.toString(cloneArray));
	}
}