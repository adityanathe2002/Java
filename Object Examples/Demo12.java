import java.util.Scanner;
abstract class Parent
{
	abstract void accountCreated();
	abstract void checkBalance();
	// abstract void depositAmount();
	// abstract void withdrawAmount();
	// abstract void updatedName();
	// abstract void updateAddress();
	// abstract void updateUpiPin();
	// abstract void updatePhoneNumber();
}

class AccountInfo
{
	 String accountHolderName;
	 String address;
	 long adharNumber;
	 String panNumber;
	 int upiPin;
	 double balance;
	 long phoneNumber;

	AccountInfo(String accountHolderName, String address,long adharNumber, String panNumber, int upiPin ,double balance ,long phoneNumber)
	{
		super();
		this.accountHolderName=accountHolderName;
		this.address=address;
		this.adharNumber=adharNumber;
		this.panNumber=panNumber;
		this.upiPin=upiPin;
		this.balance=balance;
		this.phoneNumber=phoneNumber;
	}
	// public String getAccountHolderName()
	// {
	// 	return accountHolderName;
	// }
	// public void setAccountHolderName(String updateAccountHolderName)
	// {
	// 	accountHolderName=updateAccountHolderName;
	// }
	// public String getAddress()
	// {
	// 	return address;
	// }
	// public void setAddress(String updateAddress)
	// {
	// 	address=updateAddress;
	// }
	// public long getAdharNumber()
	// {
	// 	return adharNumber;
	// }
	// public String getPanNumber()
	// {
	// 	return panNumber;
	// }
	// public int getUpiPin()
	// {
	// 	return upiPin;
	// }
	// public void setUpiPin(int updateUpiPin)
	// {
	// 	upiPin=updateUpiPin;
	// }
	// public double getBalance()
	// {
	// 	return balance;
	// }
	// public void setBalance(double updateBalance)
	// {
	// 	balance=updateBalance;
	// }
	// public long getPhoneNumber()
	// {
	// 	return phoneNumber;
	// }
	// public void setPhoneNumber(long updatePhoneNumber)
	// {
	// 	phoneNumber=updatePhoneNumber;
	// }
}	

class Demo12
{
	static AccountInfo obj1=null;
	public static void main(String[] args) 
	{
		Child obj=new Child();
	
		// Parent obj1=new Child();
		// Child obj2=(Child)obj1;


		boolean flag=true;
		Scanner sc =new Scanner(System.in);

	  outerlopp:
	  for (; ; ) 
	  {
	  		System.out.println("**** Welcome Aapli Bank ****");
	  		System.out.println();
	  		System.out.println("1. Account Created");
	  		System.out.println("2. Existing Account");
	  		System.out.println("3. Exit");
	  		System.out.println();
	  		System.out.print("Enter a Option : ");
	  		int option=sc.nextInt();
	  		System.out.println();
	  		switch(option)
	  		{
	  		case 1:
	  		{
  				obj.accountCreated();
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
				    	System.out.println("4. Update Account");
				    	System.out.println("5. Logout");
				    	System.out.print("Enter an Option : ");
				    	int option1 =sc.nextInt();
				    	System.out.println();
				    	switch(option1)
				    	{
				    	case 1:
				    		{
				    			obj.checkBalance();
				    			break;
				    		}
				    	case 2:
				    		{

				    		}
				    	case 3:
				    		{

				    		}
				    	case 4:
				    		{
				    			update:
				    			for (; ; ) 
				    			{
				    				System.out.print("Enter Your Pin : ");
							        int ePin=sc.nextInt();

							        if (ePin==obj2.upiPin)
							        {
							        	System.out.println();
										System.out.println("1.Update Name");
										System.out.println("2.Update Address");
										System.out.println("3.Update UPI PIN");
										System.out.println("4.Update Phone Number");
										System.out.print("Enter the Option : ");
										int opt11=sc.nextInt();
										switch(opt11)
										{
										case 1:
											{

											}
										case 2:
											{

											}
										case 3:
											{

											}
										case 4:
											{

											}
										case 5:
											{
												continue features;
											}
										}
							        }
				    			}

				    		}
				    	case 5:
				    		{
				    			// continue outerlopp;
				    			// System.exist(0);
				    		}
				    	}
	    			}
	    		}
	    	case 3:
	    		{
	    			// System.exist(0);
	    		}
	  	    }
	  }
	}
}
class Child extends Parent
{
	public  void accountCreated()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your name : ");
		String name=sc.next();

		System.out.print("Enter your address : ");
		String address=sc.next();

		System.out.print("Adhar Number: ");
		long adharNumber = sc.nextLong();

		System.out.println("Pan Number");
		String panNumber=sc.next();

		System.out.print("Deposit Amount : ");
		double balance = sc.nextDouble();

		System.out.print("Enter a upi pin : ");
		int upiPin = sc.nextInt();

		System.out.print("Enter your Phone No :  ");
		long phoneNumber=sc.nextLong();

		System.out.println("Account Created Succesfully");
		System.out.println();

		obj1= new AccountInfo(name,address,adharNumber,panNumber,upiPin,balance,phoneNumber);
		
	}

	public void checkBalance()
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.print("Enter your Pin : ");
    	int userPin=sc.nextInt();
    	if(userPin==obj1.upiPin)
    	{
    		System.out.println("Your Account Balance is - "+ obj1.balance + "rs");
    	}
    	else
    	{
    		System.out.println("Wrong upiPin");
    	}
    }

    // public void depositAmount()
    // {
    // 	Scanner sc=new Scanner(System.in);
    // 	System.out.println(" **** Deposit Amount **** ");
	// 	System.out.println();
	// 	System.out.print("Enter a amount : ");
	// 	double amount =sc.nextDouble();
	// 	obj1.setBalance(amount +obj1.getBalance());
	// 	System.out.print("Enter your Upi Pin : ");
	// 	int userPin=sc.nextInt();
	// 	if(userPin==obj1.getUpiPin())
	// 	{
	// 	   System.out.println("Amount Deposited Successfully");
	// 	}
	// 	else
	// 	{
	// 		System.out.println("wrong upi");
	// 	}   
    // }

    // public void withdrawAmount()
    // {
    // 	Scanner sc = new Scanner(System.in);
    // 	System.out.println(" *** Withdraw Amount *** ");
	// 	System.out.println();
	// 	System.out.print("Enter an Amount : ");
	// 	double withdrawAmount = sc.nextDouble();
	// 	System.out.print("Enter Pin : ");
	// 	int userPin=sc.nextInt();
	// 	if(userPin==obj1.getUpiPin())
	// 	if (withdrawAmount<=obj1.getBalance())
	// 	{
	// 		System.out.println("Amount Withdrawn Succesfully");
	// 		obj1.setBalance(obj1.getBalance()-withdrawAmount);
	//     }
	//     else
	//     {
	//     	System.out.println("Insufficient Funds");
	//     }
	// 	else
	// 	{
	// 		System.out.println("Wrong pin");
	// 	}
    // }

    // public void updatedName()
    // {
    // 	System.out.print("Enter Your Name : ");
    // 	Scanner sc1=new Scanner(System.in);
	// 	String updatedName=sc1.next();
	// 	obj1.setAccountHolderName(updatedName);
	// 	System.out.println("Your Name Updated Successfully to "+ updatedName);
    // }

    // public void updateAddress()
    // {
    // 	System.out.print("Enter Your Address : ");
    // 	Scanner sc1=new Scanner(System.in);
	// 	String updatedAddress=sc1.next();
	// 	obj1.setAddress(updatedAddress);
	// 	System.out.println("Your Address Updated Successfully to "+ updatedAddress);
    // }

    // public void updateUpiPin()
    // {
    // 	System.out.print("Enter Your PIN : ");
    // 	Scanner sc1=new Scanner(System.in);
	// 	int updatedPin=sc1.nextInt();
	// 	obj1.setUpiPin(updatedPin);
	// 	System.out.println("Your Pin Updated Successfully  "+updatedPin);
    // }

    // public void updatePhoneNumber()
    // {
    // 	System.out.print("Enter Your Phone Number : ");
    // 	Scanner sc1=new Scanner(System.in);
	// 	long updatedNumber=sc1.nextLong();
	// 	obj1.setPhoneNumber(updatedNumber);
	// 	System.out.println("Your Number Updated Successfully to "+ updatedNumber);
    // }	
}

	