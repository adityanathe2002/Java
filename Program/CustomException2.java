import java.util.*;
class UserException  extends RuntimeException
{
	UserException(String desc)
	{
		 super(desc);
	}
}
class CustomException2
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner (System.in);
	    System.out.print("Enter Array lenght: ");
	    int len=sc.nextInt();
	    int [] arr={0};
	    if(arr.length==len)
	    {	
	    	try
	    	{
	    		throw new UserException("Array lenght is zero");
	    	}
	    	catch(UserException ue)
	    	{
	    		System.out.println(ue.getMessage());
	    	}
	    }
	    else
	    {
	    	System.out.println(arr.length);
	    }
	}
}