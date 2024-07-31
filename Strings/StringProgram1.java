import java.util.*;
class StringProgram1
{
	public static void main(String[] args) 
	{
		
		String a="Hello";
		String b=new String("Hello");
		String c="World";
		String d=a.concat(c);
		String e="Hello";
		String f=new String("HelloWorld");
		String g="HelloWorld";	
		String h="World";
		String i=new String("Hello");
		System.out.println(a==b);
		System.out.println(b==c);
		System.out.println(b==d);
		System.out.println(b==e);
		System.out.println(b==f);
		System.out.println(b==g);
		System.out.println(b==h);
		System.out.println(b==i);
	}
}