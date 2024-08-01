abstract  class RBI 
{
	RBI()
	{
		super();
	}
	abstract void rateOfInterest();
	abstract  void withDrawLimit();
	abstract void depositLimit();
}
abstract class SBI extends RBI
{
	String accountType;
	String userName;

	SBI(String accountType,String userName)
	{
		super();
		this.accountType=accountType;
		this.userName=userName;
	}
	void accountDetails()
	{
		System.out.println("Account Type: "+this.accountType);
		System.out.println("User Name: "+this.userName);
	}
}
class Saving extends SBI
{
	Saving(String accountType,String userName)
	{
		super(accountType,userName);
	}
	void rateOfInterest()
	{
		System.out.println("ROI : "+8.5+"%");
	}
	void withDrawLimit()
	{
		System.out.println("WithDraw Limit: "+50000+" rs.");
	}
	void depositLimit()
	{
		System.out.println("Deposit Limit : "+100000+" rs.");
	}
}
class Current extends SBI
{
	Current (String accountType,String userName)
	{
		super(accountType,userName);
	}
	void rateOfInterest()
	{
		System.out.println("ROI : "+ 7.5 +"%");
	}
	void withDrawLimit()
	{
		System.out.println("WithDraw Limit: "+500000+" rs.");
	}
	void depositLimit()
	{
		System.out.println("Deposit Limit : "+1000000+" rs.");
	}
}
class AbstractExample3
{
	public static void main(String[] args) 
	{
		Saving obj1=new Saving("Saving","Ramesh");
		obj1.accountDetails();
		obj1.rateOfInterest();
		obj1.withDrawLimit();
		obj1.depositLimit();
		System.out.println();

		Current obj2=new Current("Current","Suresh");
		obj2.accountDetails();
		obj2.rateOfInterest();
		obj2.withDrawLimit();
		obj2.depositLimit();
	}
}
