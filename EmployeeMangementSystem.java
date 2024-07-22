import java.util.Scanner;
class EmployeeMangementSystem
{
	static String ename;
	static int eid;
	static String erole;
	static double esal;

	public static void main(String[] args) 
	{
       Scanner sc=new Scanner(System.in);
       System.out.print("**** WelCome ****");
       System.out.println();
       features:
       for (; ; ) 
       {
          System.out.println("***features***");
          System.out.println("1. Add New Employee");
          System.out.println("2. View Employee");
          System.out.println("3. Edit Employee");
          System.out.println("4. Exits");
          System.out.println();
          System.out.print("Enter an Option : ");
          int opt=sc.nextInt();
          switch(opt)
          {
              case 1 :
	          {
	          	   addNewEmployee();
	          	   break;
	          }
	          case 2 :
	          {
	          		 System.out.println("Enter a Employee id : ");
	          		 int eid1=sc.nextInt();
	          	   viewEmployee(eid1);
	          	   break;
	          }
	          case 3 :
	          {		
	          	update:
	          	for (; ; ) 
	          	{
	          
	          	   System.out.println("***Edit Employee Data***");
	          	   System.out.println();
	          	   System.out.println("1. Edit name");
	          	   System.out.println("2. Edit Role");
	          	   System.out.println("3. Edit Salary");
	          	   System.out.print("Exits");
	          	   System.out.println();
	          	   System.out.print("Enter an Option : ");
	          	   int opt1=sc.nextInt();
	          	   switch(opt1)
	          	   {
	          	   case 1:
	          	   {
	          	   	 updateNewName();
	          	   	 break;
	          	   }
	          	   case 2:
	          	   {
	          	 		 updateNewRole();
	          	 		 break;
	          	   }
	          	   case 3: 
	          	   	{
	          	   		updateNewSal();
	          	   		break;
	          	   	}
	          	   case 4:
	          	   	{
	          	   		continue features;
	 	
	          	   	}

	          	   }
	          	}
	          	   
	          }
	          case 4 :
	          {
	          	   System.exit(0);
	          	   break;
	          }
	          default:
	          {
	           	System.out.println("Invalid Option");
	          }
          }	
       }
	}


	public static void addNewEmployee()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("*** Enter New Employee Data **");
		System.out.print("Enter a Name: ");
		ename=sc.nextLine();
		System.out.print("Employee Id : ");
		eid=sc.nextInt();
		Scanner s=new Scanner(System.in);
		System.out.print("Employee Role : ");
		erole=s.nextLine();
		System.out.print("Employee Salary: ");
		esal=s.nextDouble();
	}
	public static void viewEmployee(int eid1)
	{
		if(eid==eid1)
		{
			System.out.println("*** Employee Data ***");
			System.out.println();
			System.out.println("Name : "+ename);
			System.out.println("Emp ID : "+eid);
			System.out.println("Role : "+erole);
			System.out.println("Salary : "+esal);
			System.out.println();
		}
		else
		{
			System.out.println("Wrong EId");
		}
    }
    public static void updateNewName()
    {
    	System.out.println("Update");
    	System.out.println();
    	System.out.println("Enter New Name : ");
    	Scanner s=new Scanner(System.in);
    	String nname=s.nextLine();
    	System.out.println("New Name Update Succesfully");
    	System.out.println();
    }
    public static void updateNewRole()
    {
    	System.out.println("*** Update Role ***");
    	System.out.println();
    	System.out.println("Enter New Role : ");
    	Scanner s=new Scanner(System.in);
    	String nrole=s.nextLine();
    	System.out.println("New Role Updated ");
    	System.out.println();
    }
    public static void updateNewSal()
    {
    	System.out.println("*** Update Salary ***");
    	System.out.println();
    	System.out.println("Enter New Sal : ");
    	Scanner s=new Scanner(System.in);
    	double sal=s.nextDouble();
    	System.out.println("Salary Updated");
    }
}