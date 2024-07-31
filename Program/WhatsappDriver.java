class Whatsapp
{
	boolean online;
	boolean chatWithGf;

	public void onlineMethod(boolean isOnline)
	{
		this.online = isOnline; 
		if(online==true)
		{
			System.out.println("You are Online");
		}
		else
		{
			System.out.println("You are Not Online");
		}
	}
	public void chatWithGfMethod(boolean wantToChatWithGf)
	{
		this.chatWithGf = wantToChatWithGf;
		if(chatWithGf== true && online == true)
		{
			System.out.println("You are Chat with Your girlFrirend ");
		}
		else if(chatWithGf == true && online == false)
		{
			System.out.println("You are Chat with Your GirlFriend Kaise SMS pe");
		}
		else if(chatWithGf == false && online == false)
		{
			System.out.println("You are Chat with Your GirlFriend Kaise 'Telepathy!!'");
		}
		else
		{
			System.out.println("You are Not Chat with Your girlFrirend");
		}
	}
}
class WhatsappDriver
{
	static Whatsapp w;
	public static void main(String[] args) 
	{
		System.out.println("Main Start");
		try
		{
			w.online=true;
			WhatsappDriver.w.onlineMethod(w.online);
			w.chatWithGf=true;
			WhatsappDriver.w.chatWithGfMethod(w.chatWithGf);
		}
		catch(Exception e)
		{
			System.out.println("Exception handled");
			// e.printStackTrace();
			try
			{
				w = new Whatsapp();
				w.online=true;
				WhatsappDriver.w.onlineMethod(w.online);
				w.chatWithGf=true;
				WhatsappDriver.w.chatWithGfMethod(w.chatWithGf);
			}
			catch(Exception e2)
			{
				System.out.println("Exception handled");
				// e2.printStackTrace();
			}
		}
		finally
		{
			System.out.println("Finally You Have A GirlFriend");
		}
		System.out.println("Main Ends");
	}
}