 // 1)  --> String ();
class StringConstructor
{
	public static void main(String[] args) 
	{
		String str=new String();
		System.out.println(str);
	}
}

//     // 2) --> String(str);
// class StringConstructor
// {
// 	public static void main(String[] args) 
// 	{
// 		String str=new String("Hello World !");
// 		System.out.println(str);
// 	}
// }

   // 3) --> String( StringBuffer);
// class StringConstructor
// {
// 	public static void main(String[] args) 
// 	{
// 		StringBuffer sb = new StringBuffer("Hello");  // first way 
// 		String str =new String(sb);
// 		System.out.println(str);

// 		String str1=new String(new StringBuffer("World!"));   // Second Way 
// 		System.out.println(str1);

		
// 	}
// }

//    //  4) --> String(StringBuilder);
// class StringConstructor
// {
// 	public static void main(String[] args) 
// 	{
// 		StringBuilder sb = new StringBuilder("Hello");  // first way 
// 		String str =new String(sb);
// 		System.out.println(str);

// 		String str1=new String(new StringBuilder("World!"));   // Second Way 
// 		System.out.println(str1);

		
// 	}
// }

//    // 5) --> String(char[] c);
// import java.util.*;
// class StringConstructor
// {
// 	public static void main(String[] args) 
// 	{
// 		char [] ch={'R','A','M','E','S','H'};
// 		System.out.println(Arrays.toString(ch));

// 		String str=new String(ch);
// 		System.out.println(str);
// 	}
// }

    // 6) --> String(byte[]b);
// import java.util.*;
// class StringConstructor
// {
// 	public static void main(String[] args) 
// 	{
// 		byte []arr={65,66,67,68};
// 		System.out.println(Arrays.toString(arr));

// 		String str =new String(arr);
// 		System.out.println( str);       //  ABCD
// 	}
// }

// import java.util.*;
// class StringConstructor
// {
// 	public static void main(String[] args) 
// 	{
// 		char[]ch={'R','A','M','E','S','H'};
// 		byte []b={65,66,67,68,69,70};

// 		String str1 =new String(ch,0,3);
// 		System.out.println( str1);       //--> RAM

// 		String str2= new  String(ch);
// 		System.out.println(str2);        //--> RAMESH

// 		String str3 =new String(ch,3,3);
// 		System.out.println(str3);        //--> ESH

// 		String str4=new String(b,0,4);
// 		System.out.println(str4);        //--> ABCD
// 	}
// }




// import java.util.*;
// class StringConstructor
// {
// 	public static void main(String[] args) 
// 	{
// 		// Find Distinct Character from a String

// 		String str ="abacabcdefa";
// 		System.out.println(str);

// 		int []arr=new int [str.length()];
// 		for (int i=0;i<str.length();i++ ) 
// 		{
// 			arr[i]=str.charAt(i);
// 		}
// 		Arrays.stream(arr).distinct().forEach(ele ->System.out.print((char)ele));
// 	}
// }