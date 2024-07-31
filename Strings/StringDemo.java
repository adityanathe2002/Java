class StringDemo 
{
	public static void main(String[] args) 
	{
		String name1="Karthik";
		String name2="kanchana";
		String name3="Komal";
		String name4="";

		String convertedCaps=name1.toUpperCase();
		int length=name3.length();
		char singleCharacter=name1.charAt(2);
		String mergedNames=name1.concat(name2);

		String multipleChars=name2.substring(5,8);
		String singleCharacter1=name3.substring(0,1);

		boolean emptyOrNot=name4.isEmpty();

		System.out.println(convertedCaps);          // KARTHIK
		System.out.println(length);                // 5
		System.out.println(singleCharacter);      // r
		System.out.println(mergedNames);         // KarthikKanachana
		System.out.println(multipleChars);      // ana
		System.out.println(singleCharacter1);  // K
		System.out.println(emptyOrNot);       // true
	}
}
