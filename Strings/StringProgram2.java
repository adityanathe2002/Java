// Synchronisation

class StringProgram2
{
	public static void main(String[] args) 
	{
		String a="Hello";
		String b="World";
		String c="Java";

		String t1=a.concat(b);
		String t2=a.toUpperCase();
		String t3=a.concat(c);
		String t4=a.concat(c).concat(b);

		System.out.println(t1);  // --> HelloWorld -- concat
		System.out.println(t2);  // --> HELLO      -- UpperCase
		System.out.println(t3);  // --> HelloJava  -- Concat
		System.out.println(t4);  // --> HelloJavaWorld  -- Concat
	}
}