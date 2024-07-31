class UserException extends Exception
{
	UserException(String message)
	{
		super(message);
	}
}
class Human
{
	String name;
	int age;
	String nPlace;

	Human (String name,int age,String nPlace)
	{
		this.name=name;
		this.age=age;
		this.nPlace=nPlace;
	}
	void displayHuman()
	{
		System.out.println("Name: "+this.name);
		System.out.println("Age: "+this.age);
		System.out.println("Native Place : "+this.nPlace);
	}
}
class VotingEligibility
{
	int eligibiltyAge;

	VotingEligibility(int eligibiltyAge)
	{
		this.eligibiltyAge=eligibiltyAge;
	}
}
class ClassCastException
{
	public static void main(String[] args) 
	{
		Human obj1=new Human("Ramesh",17,"Pune");
		obj1.displayHuman();
		VotingEligibility obj=new VotingEligibility(18);
		Human obj2=new VotingEligibility();
		if(obj1.age!= obj.eligibiltyAge)
		{
			try
			{
				throw new UserException("Hello You are not Eligible");
			}
			catch(UserException ue)
			{
				ue.printStackTrace();
			}
		}
		else
		{
			System.out.println("You Are Eligible");
		}
	}
}

