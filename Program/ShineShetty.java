import java.util.Scanner;
class ShettyGetMarriedException extends Exception
{
	String message;
	ShettyGetMarriedException(String message)
	{
		super(message);
	}
}
class ShettyNotGetMarriedException extends Exception
{
	String message;
	ShettyNotGetMarriedException(String message)
	{
		super(message);
	}
}
class ShettyNotFitforMarriage extends Exception
{
	String message;
	ShettyNotFitforMarriage(String message)
	{
		super(message);
	}
}
class ShettyBecomesSanyasi extends Exception
{
	String message;
	ShettyBecomesSanyasi(String message)
	{
		super(message);
	}
}
class ShineShetty
{
	static Scanner sc=new Scanner(System.in);
	static boolean flag=false;
	static boolean sanyasi=false;
	public void ShettyStatus() throws ShettyGetMarriedException,ShettyNotFitforMarriage,ShettyNotGetMarriedException,ShettyBecomesSanyasi
	{
		System.out.println("Is Shetty Rich ?");
		boolean rich=sc.nextBoolean();
		System.out.println("Is Shetty Famous ?");
		boolean famous=sc.nextBoolean();
		System.out.println("Is Shetty A Normal Salaried Person ?");
		boolean salariedPerson=sc.nextBoolean();
		if(rich==true || famous==true)
		{
			throw new ShettyGetMarriedException("Shetty Gets Married :)");
		}
		else if(salariedPerson== true)
		{
			throw new ShettyNotGetMarriedException("Shetty Not Gets Married :(");
		}
		else
		{
			flag=true;
			throw new ShettyNotFitforMarriage("Shetty Not fit For Married");
		}
	}
	public void ChangeLife()
	{
		if(flag)
		{
			System.out.println("Choose Your options");
			System.out.println("1. Travel The World ?");
			System.out.println("2. Want to Because A Youtuber ? ");
			System.out.println("3. Want to Because A Musician ? ");
			System.out.println("4. No Interest In Anything ? ");
			int options=sc.nextInt();
			switch(options)
			{
			case 1:
				{
					System.out.println("OOHH Yeahh I'M Traveling The Whole World. IM Happy :)");
				}
				break;
			case 2: 
				{
					System.out.println("I'm A Famous Youtuber Collabing with a Sandeep Maheshwari :)");
					break;
				}
			case 3:
				{
					System.out.println("I'm A Famous Musician Collabing with AR REHAMAN ");
					break;
				}
			case 4:
				{
					sanyasi=true;
				}
			}
		}
	}
	public static void ShettyBecomesSanyasi() throws ShettyBecomesSanyasi
	{
		if(sanyasi)
		{
			throw new ShettyBecomesSanyasi("I'M A Sanyasi Now. No Feeling. Only Enlightment");
		}
	}
	public static void main(String[] args) 
	{	
		ShineShetty ss = new ShineShetty();
		try
		{
			ss.ShettyStatus();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			ss.ChangeLife();
			try
			{
				ss.ShettyBecomesSanyasi();
			}
			catch(Exception e2)
			{
				e2.printStackTrace();
			}
		}
	}  	
}       