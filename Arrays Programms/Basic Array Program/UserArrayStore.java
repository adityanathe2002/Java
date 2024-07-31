// import java.util.Arrays;
// import java.util.Scanner;
// class UserArrayStore
// {
// 	public static void main(String[] args) 
// 	{
// 		Scanner sc=new Scanner(System.in);
// 		System.out.print("Enter String Size: ");
// 		int size=sc.nextInt();

// 		System.out.println("Enter a Element: ");
// 		int []ele=new int [size];
// 		for (int i=0;i<ele.length;i++) 
// 		{
// 			ele[i]=sc.nextInt();
// 		}
// 		System.out.println(Arrays.toString(ele));
// 	}
// }


import java.util.Arrays;
import java.util.Scanner;
class UserArrayStore
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String Size: ");
		int size=sc.nextInt();

		System.out.println("Enter a Element: ");
		String []name=new String [size];
		for (int i=0;i<name.length;i++) 
		{
			name[i]=sc.next();
		}
		System.out.println(Arrays.toString(name));
	}
}