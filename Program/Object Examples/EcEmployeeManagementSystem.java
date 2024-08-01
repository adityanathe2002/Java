import java.util.Scanner;
class EmployeeInfo
{
	private String ename;
	private int eid;
	private String erole;
	private double salary;

	EmployeeInfo(String ename, int eid, String erole, double salary)
	{
		this.ename=ename;
		this.eid=eid;
		this.erole=erole;
		this.salary=salary;
	}
	public String getEname()
	{
		return ename;
	}
	public void setEname(String updateEname)
	{
		ename=updateEname;
	}
	public int getEid()
	{
		return eid;
	}
	public void setEid(int updateEid)
	{
		eid=updateEid;
	}
	public String getErole()
	{
		return erole;
	}
	public void setErole(String updateErole)
	{
		erole=updateErole;
	}
	public double getSalary()
	{
		return salary;
	}
	public void setSalary(double updateSalary)
	{
		salary=updateSalary;
	}
}
class EcEmployeeManagementSystem
{
	static EmployeeInfo obj1=null;
	public static void main(String[] args) 
	{
	   //boolean flag=true;
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
	          	   System.out.print("Enter a Employee id : ");
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
	          	   System.out.print("4. Exits");
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
		String ename=sc.nextLine();
		System.out.print("Employee Id : ");
		int eid=sc.nextInt();
		Scanner s=new Scanner(System.in);
		System.out.print("Employee Role : ");
		String erole=s.nextLine();
		System.out.print("Employee Salary: ");
		double salary=s.nextDouble();

		obj1 =new 
		EmployeeInfo(ename,eid,erole,salary);
	}
	public static void viewEmployee(int eid1)
	{
		if(obj1.getEid()==eid1)
		{
			System.out.println("*** Employee Data ***");
			System.out.println();
			System.out.println("Name : "+obj1.getEname());
			System.out.println("Emp ID : "+obj1.getEid());
			System.out.println("Role : "+obj1.getErole());
			System.out.println("Salary : "+obj1.getSalary());
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
    	System.out.print("Enter New Name : ");
    	Scanner s=new Scanner(System.in);
    	String updateEname=s.nextLine();
    	obj1.setEname(updateEname);
    	System.out.println("New Name Update Succesfully"+updateEname);
    	System.out.println();
    }
    public static void updateNewRole()
    {
    	System.out.println("*** Update Role ***");
    	System.out.println();
    	System.out.print("Enter New Role : ");
    	Scanner s=new Scanner(System.in);
    	String updateErole=s.nextLine();
    	obj1.setErole(updateErole);
    	System.out.println("New Role Updated "+updateErole);
    	System.out.println();
    }
    public static void updateNewSal()
    {
    	System.out.println("*** Update Salary ***");
    	System.out.println();
    	System.out.print("Enter New Sal : ");
    	Scanner s=new Scanner(System.in);
    	double updateSalary=s.nextDouble();
    	obj1.setSalary(updateSalary);
    	System.out.println("Salary Updated" +updateSalary);
    }
}