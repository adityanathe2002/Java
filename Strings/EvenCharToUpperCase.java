class EvenCharToUpperCase
{
	public static void main(String[] args) 
	{
		String a= "abcdegf";
		String b="";
		
		for(int i=0;i<a.length();i++)
		{   
	    	if(i%2==0)
	    	{
	    		b=b+a.substring(i,i+1).toUpperCase(); 		    	
            }
            else
            {
            	b=b+a.substring(i,i+1).toLowerCase(); 
            }
		}
		System.out.println(b);
	}
}


// import java.util.Scanner;
// class EvenCharToUpperCase
// {
// 	public static void main(String[] args) 
// 	{
// 		Scanner sc=new Scanner(System.in);
// 		System.out.print("Enter a String: ");

// 		String s=sc.nextLine().toLowerCase();
// 		String newString="";

// 		for (int i=0;i<s.length();i++) 
// 		{
// 			if(i%2==0)
// 			{
// 				newString=newString+s.substring(i,i+1).toUpperCase();
// 			}
// 			else
// 			{
// 				newString=newString+s.substring(i,i+1).toLowerCase();
// 			}
// 		}
// 		System.out.println("Output: "+newString);
// 	}
// }