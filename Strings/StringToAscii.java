// WAJP to get the Ascii value of all the character from the string

import java.util.Scanner;
class StringToAscii
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The String: ");
		String name=sc.next();
		for (int i=0;i<name.length();i++ ) 
 		{
			char name2=name.charAt(i);
			int asciiData=name2;
			System.out.println(name2 +" : "+asciiData);
			// System.out.println(name+" : "+i+" : "+name.codePointAt(i));
		}
	}
} 