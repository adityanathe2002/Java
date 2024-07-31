import java.util.Arrays;
class PalangramProgarm
{
	public static void main(String[] args) 
	{
		String str="peek";
		String str1="keep";
		String op="";
		for (int i=str.length()-1;i>=0;i--) 
		{
			op=op+str.charAt(i);
			if(str1==op)
			{
				System.out.println("It is PalangramProgarm");
			}
			else
			{
				System.out.println("It is not PalangramProgarm");
			}
			break;
		}
		System.out.println(op);
	}
}

// class PalangramProgarm
// {
// 	public static void main(String[] args) 
// 	{
// 		String str="keep";
// 		String str1="peek";
// 		boolean op=
// 	}
// 	public static boolean userEqual(Object obj)
// 	{
// 		boolean flag=true;
// 		for (int i=str.lenght()-1;i>=0;i-- ) 
// 		{
			
// 		}
// 	}
// }