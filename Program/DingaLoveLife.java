import java.util.Scanner;
class DingaGotKidnapped extends Exception
{
	String message;
	DingaGotKidnapped(String message)
	{
		super(message);
	}
}
class DingaMinglException extends Exception
{
	String message;
	DingaMinglException(String message)
	{
		super(message);
	}
}
class SelmonBhaiException extends Exception
{
	String message;
	SelmonBhaiException(String message)
	{
		super(message);
	}
}
class DingaLoveLife
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Started");
		System.out.println("Does Dinga Have Crush on Sumanth's Girlfriend ? ");
		boolean result=sc.nextBoolean();

		if(result==true)
		{
			try
			{
				throw new DingaGotKidnapped("Ohh My God ! Got Kidnapped");
			}
			catch(DingaGotKidnapped dge)
			{
				dge.printStackTrace();
			}
		}
		else
		{
			try
			{
				throw new DingaMinglException("Ready to Get Mingle :)");
			}
			catch(DingaMinglException dme)
			{
				dme.printStackTrace();
				System.out.println("Choose the Option");
				System.out.println("1. katrina");
				System.out.println("2. Kareena ");
				System.out.println("3. Sumantha");
				System.out.println("4. Selmon Bhai");
				int options=sc.nextInt();
				switch(options)
				{
				case 1:
					{
						System.out.println("katrina Already Married");
						break;
					}
				case 2:
					{
						System.out.println("kareena Already Married");
						break;
					}
				case 3:
					{
						System.out.println("Sumantha Already Married");
						break;
					}
				case 4:
					{
						try
						{
							throw new SelmonBhaiException("Cannot Marry Selmon Bhai :(");
						}
						catch(SelmonBhaiException sbe)
						{
							sbe.printStackTrace();
						}
					}
					break;
				default:
					{
						System.out.println("Inavalid Option");
					}
				}
			}
		}
		System.out.println("Endeddddd");
	}
}