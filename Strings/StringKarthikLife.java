class StringKarthikLife
{
	public static void main(String[] args) 
	{
		String karthikGf="";
		String karthikWife=new String("KArina");

		if(karthikGf.isEmpty())
		{
			try
			{
				throw new UserException("Does not have gf");
			}
			catch(Exception e)
			{
				e.printStackTrace();
				if(karthikWife.isEmpty())
				{
					System.out.println("Karthik does not have wife");
				}
				else
				{
					System.out.println("Wife : "+karthikWife);
				}
			}
		}
	}
}

class UserException extends Exception
{
	UserException(String desc)
	{
		super(desc);
	}
}