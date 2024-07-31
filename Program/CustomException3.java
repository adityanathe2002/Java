class UserException extends Exception
{
	UserException(String message)
	{
		super(message);
	}
}
class Student
{
	String name;
	String nplace;
	Student(String name,String nplace)
	{
		this.name=name;
		this.nplace=nplace;
	}
}

class CustomException3
{
	public static void main(String[] args) 
	{
		Student obj=new Student("Ramesh","Pune");
		System.out.println(obj.name);
		Student obj1=null;
		if(obj1==null)
		{
			try
			{
				throw new UserException("Object is Null");
			}
			catch(UserException ue)
			{
				ue.printStackTrace();
			}
		}
		else
		{
			System.out.println(obj1.name);
		}
	}
}