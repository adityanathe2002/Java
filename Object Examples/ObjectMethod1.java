import java.util.*;
class Employee
{
	String name;
	String place;

	Employee(String name,String place)
	{
		this.name=name;
		this.place=place;
	}
	@Override
	protected void finalize() 
	{
		System.out.println("Object Got Destroyed");
	}
}

class ObjectMethod1
{
	public static void main(String[] args) 
	{
		Employee obj=new Employee("Ramesh","Pune");
		System.out.println(obj);
		obj=null;
		System.gc();
		System.out.println(obj.place);
	}
}