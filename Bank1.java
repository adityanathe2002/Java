import java.util.*;
class Bank1
{
	static String name;
	static String address;
	static long phoneNo;
	static long adharNo;
	static double bal;
	static int upiPin;
	
	public static void main(String[] args) 
	{
	  Scanner sc =new Scanner(System.in);

	  outerlopp:
	  for (; ; ) 
	  {
	  		System.out.println("**** Welcome Aapli Bank ****");
	  		System.out.println();
	  		System.out.println("1. Account Created");
	  		System.out.println("2. Existing Account");
	  		System.out.println();
	  		System.out.print("Enter a Option : ");
	  		int option=sc.nextInt();
	  		System.out.println();
	  		switch(option)
	  		{
	  		case 1:
	  		{
  				accountCreated();
  				break;
	  		}
	  		case 2:
	  		{
  			  features:
  			  for (; ; )
	  			{
	  			  	System.out.println("****Features****");
	  			  	System.out.println("1. Check Balance");
			    	System.out.println("2. Deposit");
			    	System.out.println("3. withdraw");
			    	System.out.println("4. Info");
			    	System.out.println("5. Logout");
			    	System.out.print("Enter an Option : ");
			    	int option1 =sc.nextInt();
			    	System.out.println();
			    	switch(option1)
	  		        {
	  			    case 1:
	  			    {
		  				checkBalance();
		  			 	break;
	  			    }
	  			    case 2:
  				    {
  				       depositAmount();
  				       break;
  				    }
	  			    case 3:
  				    {   
  				    	withdrawAmount();
  				     	break;
  				    }
	  			    case 4:
  				    {
  				    	 info();
  					     break;
  				    }
	  			    case 5:
	  				{
	  					System.exit(0);
	  				}
	  			default: System.out.println("Invalid Option");
	  			}
	  		  }
	  	   }
	  	default:System.out.println("Invalid Option");
	    }	
	  }
   }


	public static void accountCreated()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your name : ");
		name=sc.nextLine();
		System.out.print("Enter your address : ");
		address=sc.nextLine();
		System.out.print("Enter your Phone No :  ");
		phoneNo=sc.nextLong();
		System.out.print("Addhar Number: ");
		adharNo = sc.nextLong();
		System.out.print("Deposit Amount : ");
		bal = sc.nextDouble();
		System.out.print("Enter a upi pin : ");
		upiPin = sc.nextInt();
		System.out.println("Account Created Succesfully");
		System.out.println();
		
    }

    public static void checkBalance()
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.print("Enter your Pin : ");
    	int userPin=sc.nextInt();
    	if(userPin==upiPin)
    	{
    		System.out.println("Your Account Balance is - "+ bal + "rs");
    	}
    	else
    	{
    		System.out.println("Wrong upiPin");
    	}
    }
    public static void depositAmount()
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println(" **** Deposit Amount **** ");
		System.out.println();
		System.out.print("Enter a amount : ");
		double depAmount =sc.nextDouble();
		bal += depAmount;
		System.out.print("Enter your Upi Pin : ");
		int userPin=sc.nextInt();
		if(userPin==upiPin)
		{
		   System.out.println("Amount Deposited Successfully");
		}
		else
		{
			System.out.println("wrong upi");
		}   
    }
    public static void withdrawAmount()
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println(" *** Withdraw Amount *** ");
		System.out.println();
		System.out.print("Enter an Amount : ");
		double withdrawAmount = sc.nextDouble();
		System.out.print("Enter Pin : ");
		int userPin=sc.nextInt();
		if(userPin==upiPin)
		if (withdrawAmount<=bal)
		{
			System.out.println("Amount Withdrawn Succesfully");
			bal = bal - withdrawAmount;
	    }
	    else
	    {
	    	System.out.println("Insufficient Funds");
	    }
		else
		{
			System.out.println("Wrong pin");
		}
    }
    public static void info()
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println(" *** Account Info *** ");
    	System.out.println();
    	System.out.println("Account Holder Name : "+ name );
    	System.out.println("Address : "+ address);
    	System.out.println("Phone Number : " + phoneNo);
    }
}