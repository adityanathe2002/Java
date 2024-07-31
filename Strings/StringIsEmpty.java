class StringIsEmpty
{
	public static void main(String[] args) 
	{
		String str=new String();
		System.out.println(str.isEmpty());   // true

		String str1=new String("Hello");
		System.out.println(str1.isEmpty());  // false

		String str2=new String("");
		System.out.println(str2.isEmpty());  // true

		String str3=new String(" ");
		System.out.println(str3.isEmpty());  // false

		String str4=null;
		System.out.println(str4.isEmpty());  // NPE

	}
}