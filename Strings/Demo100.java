import java.util.*;

class Ola
{
	String username;
	double moneyWallet;
	 
	Ola(String userName, double moneyWallet)
	{
		this.userName=userName;
		this.moneyWallet=moneyWallet;
	}
	void userDetails()
	{
		System.out.println("**** Welcome ****");
		System.out.println("User Name: "+userName);
		System.out.println("Money Wallet: "+moneyWallet);
	}
}

class Suv extends Ola
{
	String pickupLocation;
	String dropLocation;
	double farePrice;

	Suv(String pickupLocation, String dropLocation,double farePrice)
	{
		this.pickupLocation=pickupLocation;
		this.dropLocation=dropLocation;
		this.farePrice=farePrice;
	}
	void suvMessage()
	{
		System.out.println("**** Suv Details ****");
		System.out.println("Pickup Location: "+this.pickupLocation);
		System.out.println("Drop Location: "+this.dropLocation);
		System.out.println("Fare Price : "+this.farePrice);
	}
}

class Mini extends Ola
{
	String pickupLocation;
	String dropLocation;
	double farePrice;

	Mini(String pickupLocation, String dropLocation,double farePrice)
	{
		this.pickupLocation=pickupLocation;
		this.dropLocation=dropLocation;
		this.farePrice=farePrice;
	}
	void miniMessage()
	{
		System.out.println("**** Mini Details ****");
		System.out.println("Pickup Location: "+this.pickupLocation);
		System.out.println("Drop Location: "+this.dropLocation);
		System.out.println("Fare Price : "+this.farePrice);
	}
}

class Auto extends Ola
{
	String pickupLocation;
	String dropLocation;
	double farePrice;

	Auto(String pickupLocation, String dropLocation,double farePrice)
	{
		this.pickupLocation=pickupLocation;
		this.dropLocation=dropLocation;
		this.farePrice=farePrice;
	}
	void autoMessage()
	{
		System.out.println("**** Auto Details ****");
		System.out.println("Pickup Location: "+this.pickupLocation);
		System.out.println("Drop Location: "+this.dropLocation);
		System.out.println("Fare Price : "+this.farePrice);
	}
}

class OlaUser extends Ola
{
	String userName;
	double moneyWallet;

	OlaUser(String userName, double moneyWallet)
	{
		super(username,moneyWallet);
		this.userName=userName;
		this.moneyWallet=moneyWallet;
	}
}

class Demo100
{
	public static void main(String[] args) 
	{
		
	}
}