// 1) Create an array of cha datatype ()dynamically) 
// 2) Compare each position in an Array with variable
// 3) if it is vowel then increament the value of count  

import java.util.Scanner;
import java.util.Arrays;
class BubblesConsonantCount
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Size: ");
		int size=sc.nextInt();

		System.out.println("Enter an Element : ");
		char []arr=new char[size];

		for (int i=0;i<size;i++) 
		{
			arr[i]=sc.next().charAt(0);
		}
		int vCount=0;
		int cCount=0;

		for(int i=0;i<size;i++)
		{
			if(arr[i] =='a'|| arr[i] =='e'|| arr[i] =='i'|| arr[i] =='o'|| arr[i] =='u')
			{
				vCount++;
			}
			else
			{
				cCount++;
			}
		}
		System.out.println("Vowel Count: "+vCount);
		System.out.println("Consonant Count: "+cCount);
	}
}