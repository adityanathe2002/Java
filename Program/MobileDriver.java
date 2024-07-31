class Mobile
{
	boolean playGames;
	boolean watchReels;
	public void playGames(boolean playGames)
	{
		this.playGames=playGames;
		System.out.println("Yes Play Games");
	}
	public void watchReels(boolean watchReels)
	{
		this.watchReels=watchReels;
		System.out.println("Yes You can Watch Reels");
	}
}
class MobileDriver
{
	static Mobile m;
	public static void main(String[] args) 
	{
		System.out.println("Hi main M");
		try
		{
			MobileDriver.cccm.playGames=true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			try
			{
				Mobile m1 = new Mobile();
				m1.playGames=true;
				m1.watchReels=true;
				m1.playGames(m1.playGames);
				m1.watchReels(m1.watchReels);
			}
			catch(Exception e2)
			{
				e2.printStackTrace();
			}
		}
		System.out.println("Main Ends");
	}
}