// wajp to fetch all factors in an array
// wajp to find the factors of a number and store all the factor in an array -->


class FactorFindArray
{
	public static void main(String[] args) 
	{
		 int[] arr = {1, 2, 5, 6, 7, 9};  // Example array

        for (int number : arr) 
        {
            System.out.print("Factors of "+ number + " are: ");
            
            for (int i=1;i<=number;i++) 
            {
                if (number%i==0) 
                {
                    System.out.print(i +" ");
                }
            }
            System.out.println(); 
		}
	}
}