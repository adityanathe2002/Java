import java.util.Arrays;
class StringToChar
{
	public static void main(String[] args) 
	{
		String str ="java";
		System.out.println("String: "+str);
		char[] arr=StringToCharArray(str);
		System.out.println("CharArray: "+Arrays.toString(arr));
	}
	public static char[] StringToCharArray(String str)
	{
		char[]arr=new char[str.length()];
		for (int i=0;i<str.length();i++) 
		{
			arr[i]=(str.charAt(i));
		}
		return arr;
	}
}