// WAJP to check if the array is ***Pallindrome*** which work for word & letter.
// 1) create on array of char datatype.
// 2) reverse the array and store it in reversed Array.
// 3) Compare both Array using Array.equals();
import java.util.Scanner;
import java.util.Arrays;
class PallindromeArray
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a size: ");
		int size=sc.nextInt();

		System.out.print("Enter a Element: ");.
		char[]arr =new char[size];

		// insert
		for (int i=0;i<size ;i++ ) 
		{
			arr[i]=sc.next().charAt(0);
		}
		char[]reversedArray=new char[size];

		int indx=0;   // indx temporarlly Zero
		for(int i=arr.length-1;i>=0;i--)
		{
			reversedArray[indx]=arr[i];
			indx++;
		}
		if(Arrays.equals(arr,reversedArray))
		{
			System.out.println("It Is Pallindrome");
		}
		else
		{
			System.out.println("It is Not Pallindrome");
		}
	}
}