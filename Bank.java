import java.util.*;
class Bank
{
	static String name ;
	static String address;
	static Long addharNo;
	static Long phoneNo;
	static double bal;
	static int upiPin;
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		outerloop:
		for ( ; ; )
		{
			System.out.println("******** WelCome to LaxmiChitFund ********");
			System.out.println();
			System.out.println("1. Create acount ");
			System.out.println("2. Existing Account Holder");
			System.out.print("Enter a option : ");
			int option = sc.nextInt();
			System.out.println();
			switch(option)
			{
			case 1 : 
			{
				System.out.println(" *** Create Account Module ***");
				sc.nextLine();
				System.out.print("Enter your name : ");
				name = sc.nextLine();
				System.out.print("Enter your Address : ");
				address = sc.nextLine();
				System.out.print("Phone Number : ");
				phoneNo = sc.nextLong();
				System.out.print("Addhar Number : ");
				addharNo = sc.nextLong();
				System.out.print("Deposit Amount : ");
				bal = sc.nextDouble();
				System.out.print("Enter a upi pin : ");
				upiPin = sc.nextInt();
				System.out.println("Account Created Succesfully");
				System.out.println();
				break;
			}
		case 2 :
			{
				for ( ; ; )
				{
					System.out.println();
					   System.out.println(" *** Features *** ");
					   System.out.println("1. Check Balance 2.Deposit 3.Withdraw 4.Info 5. Logout");
					   System.out.println();
					   System.out.print("Enter an option : ");
					   int opt = sc.nextInt();
					   switch(opt)
					   {
					   case 1 : 
					   {
					   	System.out.println("**** Check Balance ****");
					   	System.out.print("Enter your upi pin : ");
					   	int userPin=sc.nextInt();
					   	if(userPin==upiPin){
					   		System.out.println("Your Account Balance is - "+ bal + "rs");
					   }
					   else
					   {
					   	 System.out.println("Wroung Upi Pin ");
					   }
					   	break;
					   }
					case 2 : 
					{
						System.out.println(" **** Deposit Amount **** ");
						System.out.println();
						System.out.print("Enter a amount : ");
						double depAmount = sc.nextDouble();
						bal += depAmount;
						System.out.print("Enter your Upi Pin : ");
						int userPin=sc.nextInt();
						if(userPin==upiPin)
						{
						   System.out.println("Amount Deposited Successfully");
						}else{
							System.out.println("wrong upi");
						}   
						break;
					}
					case 3  : 
					{
						System.out.println(" *** Withdraw Amount *** ");
						System.out.println();
						System.out.print("Enter an Amount : ");
						double withdrawAmount = sc.nextDouble();
						System.out.print("enter pin");
						int userPin=sc.nextInt();
						if(userPin==upiPin)
						if (withdrawAmount<=bal)
						{
							System.out.println("Amount Withdrawn Succesfully");
							bal = bal - withdrawAmount;
					    }else{
					    	System.out.println("Insufficient Funds");
					    }
						else
						{
							System.out.println("Wrong pin");
						}
						break;
					}
				    case 4 : 
				    {
				    	System.out.println(" *** Account Info *** ");
				    	System.out.println();
				    	System.out.println("Account Holder Name : "+ name );
				    	System.out.println("Address : "+ address);
				    	System.out.println("Phone Number : " + phoneNo);
				    	break;
				    }
				    case 5 : 
				    {
				    	System.exit(0);
				    }
				default : System.out.println(" Invalid Option");break;
					}
				}
			}
		   default : System.out.println("Invalid Option");break;
		  }
		}
	}
}