import java.util.*;

class karthik
{
	String girlFriend;
}

class NullPointerExceptiion
{
	static karthik k;
	public static void main(String[] args) 
	{
		System.out.println("karthik Strated");
		Scanner findGf= new Scanner(System.in);
		System.out.println("Who is your GirlFriend ? : ");

		try
		{
			k.girlFriend =findGf.nextLine();
		}
		catch(Exception e) 
		{
			e.printStackTrace();
			System.out.println("Aye idiot Do not Access My GirlFriend Without my Permission");
		}
		try
		{
		System.out.println("karthik GF is : "+k.girlFriend);

		}
		catch(Exception e2)
		{
			e2.printStackTrace();
		}
		System.out.println("karthik Ended");
	}
}