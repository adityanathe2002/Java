// .Find product of all elements present in an array

class ProductOfArray
{
	public static void main(String[] args) 
	{
		int []arr={2,2,4,4,6,6};

		int prod=1;

		for (int i=0;i<arr.length;i++ ) 
		{
			prod=prod*arr[i];
		}
		System.out.println("Product: "+ prod);
	}
}