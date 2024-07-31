class Demo2
{
	public static void main(String[] args) 
	{
		String s1="Java";
		String s2="Java";
		System.out.println(s1==s2);  // true

		String s11=new String("Java");
		String s12=new String("Java");
		System.out.println(s11==s12); //  false
		System.out.println(s11.equals(s12));  //  True

		StringBuffer sb1=new StringBuffer("Java");
		StringBuffer sb2=new StringBuffer("Java");
		System.out.println(sb1==sb2);           // false
		System.out.println(sb1.equals(sb2));   //  false
	}
}